package zzpl.pojo.command.jp.plfx.gj;

import hg.common.component.BaseCommand;

import java.util.List;

@SuppressWarnings("serial")
public class ApplyRefundTicketGJCommand extends BaseCommand {
	/**
	 * 分销平台订单号
	 */
	private String platformOrderId;

	/**
	 * 经销商订单号
	 */
	private String dealerOrderId;

	/**
	 * 申请种类(一次申请只能选择一种申请理由，多个乘客可以使用同一种种类)
	 * 
	 * 1. 当日作废 2. 自愿退票 3. 非自愿退票 4. 其他
	 */
	private Integer refundType;

	/**
	 * 申请理由(200字符以内）
	 */
	private String refundMemo;

	/**
	 * 需要退废票的乘客信息
	 */
	private List<RefundPassengerInfo> refundPassengerInfos;

	/**
	 * @类功能说明：需要退废票的乘客信息
	 * @类修改者：
	 * @修改日期：2015年7月18日下午10:35:58
	 * @修改说明：
	 * @公司名称：浙江汇购科技有限公司
	 * @作者：zhurz
	 * @创建时间：2015年7月18日下午10:35:58
	 */
	public static class RefundPassengerInfo {
		/**
		 * 乘客姓名
		 */
		private String passengerName;

		/**
		 * 证件类型
		 * 
		 * @see GJ#IDTYPE_MAP
		 */
		private Integer idType;

		/**
		 * 证件号
		 */
		private String idNo;

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public Integer getIdType() {
			return idType;
		}

		public void setIdType(Integer idType) {
			this.idType = idType;
		}

		public String getIdNo() {
			return idNo;
		}

		public void setIdNo(String idNo) {
			this.idNo = idNo;
		}

	}

	public String getPlatformOrderId() {
		return platformOrderId;
	}

	public void setPlatformOrderId(String platformOrderId) {
		this.platformOrderId = platformOrderId;
	}

	public String getDealerOrderId() {
		return dealerOrderId;
	}

	public void setDealerOrderId(String dealerOrderId) {
		this.dealerOrderId = dealerOrderId;
	}

	public Integer getRefundType() {
		return refundType;
	}

	public void setRefundType(Integer refundType) {
		this.refundType = refundType;
	}

	public String getRefundMemo() {
		return refundMemo;
	}

	public void setRefundMemo(String refundMemo) {
		this.refundMemo = refundMemo;
	}

	public List<RefundPassengerInfo> getRefundPassengerInfos() {
		return refundPassengerInfos;
	}

	public void setRefundPassengerInfos(
			List<RefundPassengerInfo> refundPassengerInfos) {
		this.refundPassengerInfos = refundPassengerInfos;
	}

}