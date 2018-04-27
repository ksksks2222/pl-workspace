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
public class ValidCodeCheckCommand extends BaseCommand {

	/**
	 * 验证码
	 */
	private String validCode;
	
	private String bh;
	
	private String zh;

	
	public String getValidCode() {
		return validCode;
	}

	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getZh() {
		return zh;
	}

	public void setZh(String zh) {
		this.zh = zh;
	}
	

}
