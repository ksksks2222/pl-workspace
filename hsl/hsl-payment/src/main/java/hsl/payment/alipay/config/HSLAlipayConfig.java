package hsl.payment.alipay.config;

/**
 * 类名：HSLAlipayConfig
 * 功能：基础配置类
 * 详细：设置帐户有关信息及返回路径
 * 版本：3.3
 * 日期：2012-08-10
 * 说明：
 * 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 * 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 * <p/>
 * 提示：如何获取安全校验码和合作身份者ID
 * 1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 * 2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 * 3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”
 * <p/>
 * 安全校验码查看时，输入支付密码后，页面呈灰色的现象，怎么办？
 * 解决方法：
 * 1、检查浏览器配置，不让浏览器做弹框屏蔽设置
 * 2、更换浏览器或电脑，重新登录查询。
 */
public class HSLAlipayConfig {


	// ------------------ 固定配置 ------------------

	/**
	 * 支付宝提供给商户的服务接入网关URL(新)
	 */
	public static final String ALIPAY_GATEWAY_NEW = "https://mapi.alipay.com/gateway.do?";

	/**
	 * 支付宝消息验证地址
	 */
	public static final String HTTPS_VERIFY_URL = ALIPAY_GATEWAY_NEW + "service=notify_verify&";

	/**
	 * 字符编码格式 目前支持 gbk 或 utf-8
	 */
	public static final String INPUT_CHARSET = "utf-8";

	/**
	 * 签名方式 不需修改
	 */
	public static final String SIGN_TYPE = "MD5";

	// ------------------ 自定义配置 ------------------
	
	/**
	 * 合作身份者ID，以2088开头由16位纯数字组成的字符串
	 */
	private String partner = "2088611359544680";

	/**
	 * 商户的私钥
	 */
	private String key = "l53339pfhv07foem56hx2ayue427u3og";

	/**
	 * 卖家支付宝帐户
	 */
	private String sellerEmail = "ply365@ply365.com";

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

}