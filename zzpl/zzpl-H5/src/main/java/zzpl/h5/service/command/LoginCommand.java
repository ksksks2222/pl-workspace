package zzpl.h5.service.command;

import hg.common.component.BaseCommand;


/**
 * @类功能说明：验证验证码_command
 * @类修改者：zzb
 * @修改日期：2014年12月1日下午12:01:02
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @作者：zzb
 * @创建时间：2014年12月1日下午12:01:02
 */
@SuppressWarnings("serial")
public class LoginCommand extends BaseCommand {

	/**
	 * 公司编号
	 */
	private String companyNO;
	
	/**
	 * 登录名
	 */
	private String loginName;
	
	/**
	 * 登陆密码
	 */
	private String password;
	
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyNO() {
		return companyNO;
	}

	public void setCompanyNO(String companyNO) {
		this.companyNO = companyNO;
	}
	
}