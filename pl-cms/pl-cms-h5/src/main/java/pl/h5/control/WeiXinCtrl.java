package pl.h5.control;
import pl.h5.base.utils.CachePool;
import pl.h5.base.utils.Crypto;
import pl.h5.base.utils.IOUtil;
import pl.h5.base.weixin.AccessToken;
import pl.h5.exception.HslapiException;
import hg.common.util.JsonUtil;
import hg.common.util.SysProperties;
import hg.log.util.HgLogger;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.ParseException;
/**
 * 微信网关请求
 * @author 胡永伟
 * @author chenxy
 * @version 2014年12月9日 15:55:56 修改
 */
@SuppressWarnings("deprecation")
@Controller
@RequestMapping("weixin")
public class WeiXinCtrl  {
	
	
	/**
	 * 微信接入口
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @param echostr
	 * @param out
	 */
	@RequestMapping(value="gate", method=RequestMethod.GET)
	public void gate(String signature, String timestamp,String nonce, String echostr, PrintWriter out) {
		HgLogger.getInstance().info("chenxy", "进入到微信网关接口>>gate>GET");
		out.print(checkPower(signature, timestamp, nonce) ? echostr : "fail");
	}
	
	/**
	 * 微信消息请求
	 * @param model
	 * @param request
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 * @throws IOException
	 * @throws DocumentException
	 * @throws HslapiException
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="gate", method=RequestMethod.POST)
	public String gate(Model model, HttpServletRequest request, String signature,String timestamp, String nonce) throws IOException,DocumentException, HslapiException {
		HgLogger.getInstance().info("chenxy", "进入到微信网关接口>>gate>POST");
		if(checkPower(signature, timestamp, nonce)) {
			String weixinReqXml = IOUtil.stringify(request.getInputStream());
			HgLogger.getInstance().info("chenxy", "进入到微信网关接口>>gate>POST>>获得的微信请求"+weixinReqXml);
			//提取XML内容
			Document weixinReqXmlDoc = DocumentHelper.parseText(weixinReqXml);
			Element xmlEle = weixinReqXmlDoc.getRootElement();
			Map<String,String> wxMap = new HashMap<String,String>(); //存放XML内容
			for (Iterator<Element> it = xmlEle.elementIterator(); it.hasNext();) {
				Element ele = it.next();
				wxMap.put(ele.getName(),(String)ele.getData());
			}
			boolean hasRegOrBind = true;
			// 判断微信用户是否已经绑定
			String openid = wxMap.get("FromUserName");
			if (CachePool.getUser(openid) == null) {
				if (getUserIdByOpenid(openid) == null) {
					hasRegOrBind = false;
				}
			}
			Map<String, Object> map = new HashMap<String, Object>();
			if (hasRegOrBind) {
				map.put("hasRegOrBind", hasRegOrBind);
			}
			map.put("toUser", wxMap.get("FromUserName"));
			map.put("fromUser", wxMap.get("ToUserName"));
			map.put("createTime", String.valueOf(new Date().getTime() / 1000));
			Boolean isRoot = Boolean.parseBoolean(SysProperties.getInstance().get("root"));
	        String proj = request.getContextPath();
	        String port = SysProperties.getInstance().get("port");
	        String system = "http://" + SysProperties.getInstance().get("host") + ("80".equals(port) ? "" : ":" + port);
	        if (!isRoot) {
	        	system += proj;
	        }
	        HgLogger.getInstance().info("chenxy", "进入到微信网关接口>>gate>POST>>返回欢迎页面的参数："+JsonUtil.parseObject(map,false));
	        HgLogger.getInstance().info("chenxy", "进入到微信网关接口>>gate>POST>>返回系统路径："+system);
			model.addAttribute("system", system);
			model.addAttribute("map", map);
			return "weixin/reply";
		}
		return "";
	}
	
	/**
	 * 微信网页授权
	 * @param model
	 * @param request
	 * @param response
	 * @param code
	 * @param state
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws HslapiException
	 */
	@RequestMapping("auth")
	public Object auth(Model model,HttpServletRequest request,HttpServletResponse response, String code, String state)throws ClientProtocolException, IOException, HslapiException {
		HgLogger.getInstance().info("chenxy", "WeiXinCtrl>>进入微信网页授权>>code：>>"+code);
		AccessToken token = getWxAccessToken(code);
		String openid = token.getOpenid();
		setOpenidToCookie(response, openid);
		HgLogger.getInstance().info("chenxy", "WeiXinCtrl>>将openid设置到cookie中OpenId:>>"+openid);
		state += ((state.indexOf("?") > -1 ? "&" : "?") + "openid=" + openid);
		RedirectView view=new RedirectView(state);
		return view;
	}
	
	/**
	 * 签名比对
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 */
	private boolean checkPower(String signature, String timestamp, String nonce) {
		HgLogger.getInstance().info("chenxy","微信签名对比"+signature);
		HgLogger.getInstance().info("chenxy","微信签名CC获得的wx_gate_token:>>"+SysProperties.getInstance().get("wx_gate_token"));
		String[] strArr = {SysProperties.getInstance().get("wx_gate_token"), timestamp, nonce};
		Arrays.sort(strArr);
		return signature.equals(Crypto.sha1(strArr[0] + strArr[1] + strArr[2]));
	}
	
	/**
	 * 将openid设置到cookie中
	 * @param response
	 * @param openid
	 */
	private void setOpenidToCookie(HttpServletResponse response, String openid) {
		Cookie cookie = new Cookie("openid", openid);
		cookie.setPath("/");
		cookie.setMaxAge(300 * 24 * 60 * 60);
		response.addCookie(cookie);
	}
	
	/**
	 * 获取ACCESS_TOKEN
	 */
	private AccessToken getWxAccessToken(String code) throws ClientProtocolException, IOException {
		HgLogger.getInstance().info("chenxy", "调用微信网页授权接口>>>code>:"+code);
		String url = String.format("https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code", SysProperties.getInstance().get("wx_app_id"), SysProperties.getInstance().get("wx_app_secret"),code);
		@SuppressWarnings({ "resource" })
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		HttpResponse response =  client.execute(httpGet);
		HttpEntity entity = response.getEntity();
		String content = EntityUtils.toString(entity);
		HgLogger.getInstance().info("chenxy", "调用微信网页授权接口>>>返回的参数>:"+content);
		try {
			return JSON.parse(content, AccessToken.class);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 根据openid获取用户id
	 * @param openid
	 * @return
	 */
	private String getUserIdByOpenid(String openid) {
//		HslUserBindAccountQO userBindAccountQO=new HslUserBindAccountQO();
//		HslUserQO hslUserQO=new HslUserQO();
//		userBindAccountQO.setAccountType(1);
//		userBindAccountQO.setBindAccountId(openid);
//		userBindAccountQO.setUserQO(hslUserQO);
//		QueryUserResult queryUserResult = queryUser(userBindAccountQO);
//		if (success(queryUserResult)&&null!=queryUserResult.getUserDTO()) {
//			String userId = queryUserResult.getUserDTO().getId();
//			CachePool.setUser(openid, userId);
//			return userId;
//		} else {
			return null;
//		}
	}
	
	
	/**
	 * 查询用户
	 * @param userQO
	 * @return
	 */
//	public QueryUserResult queryUser(HslUserBindAccountQO userBindAccountQO){
////		QueryUserResult userResponse=new QueryUserResult();
////		try {
////			UserDTO userDTO=userService.queryUser(userBindAccountQO);
////			userResponse.setUserDTO(userDTO);
////			userResponse.setResult(ApiResponse.RESULT_CODE_OK);
////			userResponse.setMessage("用户查询成功");
////		} catch (UserException e) {
////			userResponse.setResult(Constants.exceptionMap.get(e.getCode()));
////			userResponse.setMessage(e.getMessage());
////		}
//		return userResponse;
//	}
	
}
