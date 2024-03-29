package slfx.admin.controller.auth;

import hg.log.util.HgLogger;
import hg.system.common.system.SecurityConstants;
import hg.system.common.util.MD5HashUtil;
import hg.system.model.auth.AuthUser;
import hg.system.model.staff.Staff;
import hg.system.qo.StaffQo;
import hg.system.service.SecurityService;
import hg.system.service.StaffService;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import slfx.admin.common.LoginUtil;
import slfx.admin.controller.BaseController;

@Controller
public class LoginController extends BaseController {
	
	@Autowired
	private SecurityService securityService;
	@Resource
	private StaffService staffService;
	@Autowired
	private HgLogger hgLogger;
	/**
	 * 后台登录
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, Model model, 
				        @RequestParam(required=false) String error,
				        @RequestParam(required=false)String loginName) {
		hgLogger.info("wuyg", "后台登录");
		String message="";
		if(SecurityConstants.LOGIN_CHECK_ERROR_UNKNOWN_LOGIN_NAME.equals(error)){
			message="用户名不存在";
		}else if(SecurityConstants.LOGIN_CHECK_ERROR_PASSWORD.equals(error)){
			
			Staff staff = LoginUtil.getLoginlimitmap().get(loginName);
			if (staff != null) {
				int x = 5 - staff.getPwdErrorNum();
				if (x == 0) {
					message = "用户将被禁止登录1小时";
				} else {
					message = "用户名或密码错误," + x + "次后将被禁止登录1小时";
				}
			}else{
				message ="密码不能为空";
			}
		}else if(SecurityConstants.LOGIN_CHECK_ERROR_LOCK.equals(error)){
			message="用户被锁定";
		}else if(SecurityConstants.LOGIN_CHECK_ERROR_NULL.equals(error)){
			message="用户异常";
		}else if(SecurityConstants.LOGIN_CHECK_ERROR_FREEZE_TIME.equals(error)){
			message="多次登录错误,用户处于禁止登录中,稍后再试";
		}
		if(StringUtils.isNotBlank(message))
			hgLogger.error("wuyg", "后台登录:"+message);
		model.addAttribute("message", message);
		
		return "/admin/login.html";
	}
	
	/**
	 * 登录表单提交入口
	 * @param request
	 * @param model
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/login/check")
	public RedirectView loginCheck(HttpServletRequest request, HttpServletResponse response, Model model, 
			@RequestParam(value="loginName", required=false) String loginName,
			@RequestParam(value = "password", required = false) String password)
			throws IOException {
		hgLogger.info("wuyg", "登录表单提交"+loginName);
		if(StringUtils.isBlank(loginName)){
			model.addAttribute("error", SecurityConstants.LOGIN_CHECK_ERROR_UNKNOWN_LOGIN_NAME);
			hgLogger.error("wuyg", "登录表单提交：用户名不存在 ");
			return new RedirectView("/login", true);
		}else if(StringUtils.isBlank(password)){
			model.addAttribute("error", SecurityConstants.LOGIN_CHECK_ERROR_PASSWORD);
			hgLogger.error("wuyg", "登录表单提交：密码错误  ");
			return new RedirectView("/login", true);
		}else{
			Staff errorStaff = LoginUtil.getLoginlimitmap().get(loginName);
			if(errorStaff!=null && errorStaff.getPwdErrorNum()>=5){
				if(System.currentTimeMillis() - errorStaff.getLastErrorTime() > 3600000){
					LoginUtil.getLoginlimitmap().remove(loginName);
					errorStaff = null;
				}else{
					//限制1小时内登录时未到
					model.addAttribute("error", SecurityConstants.LOGIN_CHECK_ERROR_FREEZE_TIME);
					hgLogger.error("wuyg", "登录表单提交：多次登录错误,禁止登录时间未到  ");
					return new RedirectView("/login", true);
				}
			}
			
			StaffQo sqo=new StaffQo();
			sqo.setLoginName(loginName);
			Staff staff=staffService.queryUnique(sqo);
			
			if(staff == null){
				model.addAttribute("error", SecurityConstants.LOGIN_CHECK_ERROR_UNKNOWN_LOGIN_NAME);
				hgLogger.error("wuyg", "登录表单提交：用户名不存在   ");
				return new RedirectView("/login", true);
			}
	
			UsernamePasswordToken upt = new UsernamePasswordToken(loginName, MD5HashUtil.toMD5(password));
			Subject currentUser = SecurityUtils.getSubject();
	
			try {
				currentUser.login(upt);
			} catch (UnknownAccountException uae) {
				model.addAttribute("error", SecurityConstants.LOGIN_CHECK_ERROR_UNKNOWN_LOGIN_NAME);
				hgLogger.error("wuyg", "登录表单提交：用户名不存在   ");
				return new RedirectView("/login", true);
			} catch (IncorrectCredentialsException ice) {
				hgLogger.error("wuyg", "登录表单提交：密码错误    ");
				model.addAttribute("error", SecurityConstants.LOGIN_CHECK_ERROR_PASSWORD);
				//密码错误时记录登录错误次数和时间
				if(errorStaff!=null){
					errorStaff.setLastErrorTime(System.currentTimeMillis());
					errorStaff.setPwdErrorNum(errorStaff.getPwdErrorNum()+1);
					LoginUtil.getLoginlimitmap().put(loginName, errorStaff);
				}else{
					Staff stf = new Staff();
					stf.setLastErrorTime(System.currentTimeMillis());
					stf.setPwdErrorNum(1);
					LoginUtil.getLoginlimitmap().put(loginName, stf);
				}
				model.addAttribute("loginName", loginName);
				
				return new RedirectView("/login", true);
			} catch (LockedAccountException lae) {
				model.addAttribute("error", SecurityConstants.LOGIN_CHECK_ERROR_LOCK);
				hgLogger.error("wuyg", "登录表单提交：用户已被锁定  ");
				return new RedirectView("/login", true);
			} catch (AuthenticationException ae) {
				model.addAttribute("error", SecurityConstants.LOGIN_CHECK_ERROR_NULL);
				hgLogger.error("wuyg", "登录表单提交：用户异常   ");
				return new RedirectView("/login", true);
			}
	
			AuthUser usr = securityService.findUserByLoginName(loginName);
			currentUser.getSession().setAttribute(SecurityConstants.SESSION_USER_KEY, usr);
			hgLogger.info("wuyg", "登录表单提交：登录成功,清空错误次数限制   ");
			//登录成功后清空错误次数限制
			LoginUtil.getLoginlimitmap().remove(loginName);
		return new RedirectView("/home", true);
		}
	}
	
	@RequestMapping(value="/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException{
		hgLogger.info("wuyg", "用户登出 ");
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		currentUser.getSession().removeAttribute(SecurityConstants.SESSION_USER_KEY);
        response.sendRedirect(request.getContextPath()+"/login");
	}
}
