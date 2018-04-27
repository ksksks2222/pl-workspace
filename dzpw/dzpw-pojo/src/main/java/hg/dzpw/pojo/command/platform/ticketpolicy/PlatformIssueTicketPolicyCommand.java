package hg.dzpw.pojo.command.platform.ticketpolicy;

import java.util.Date;

import hg.dzpw.pojo.common.BaseCommand;

/**
 * @类功能说明：发布门票策略
 * @类修改者：
 * @修改日期：2014-11-12上午10:43:37
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @作者：zzx
 * @创建时间：2014-11-12上午10:43:37
 */
public class PlatformIssueTicketPolicyCommand extends BaseCommand {
	private static final long serialVersionUID = 1L;
	
	//门票策略Id
	private String ticketPolicyId;
	//审核时间
	private Date checkDate;
	//审核人
	private String checkPersonName;
	//审核说明
	private String checkRemark;
	//审核说明
	private String checkResult;

	public String getTicketPolicyId() {
		return ticketPolicyId;
	}
	public void setTicketPolicyId(String ticketPolicyId) {
		this.ticketPolicyId = ticketPolicyId == null ? null : ticketPolicyId.trim();
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckPersonName() {
		return checkPersonName;
	}
	public void setCheckPersonName(String checkPersonName) {
		this.checkPersonName = checkPersonName;
	}
	public String getCheckRemark() {
		return checkRemark;
	}
	public void setCheckRemark(String checkRemark) {
		this.checkRemark = checkRemark;
	}
	public String getCheckResult() {
		return checkResult;
	}
	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
}