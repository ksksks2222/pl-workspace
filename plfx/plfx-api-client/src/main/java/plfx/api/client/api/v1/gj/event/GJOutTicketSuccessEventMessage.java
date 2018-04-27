package plfx.api.client.api.v1.gj.event;

import java.util.List;
import java.util.Map;

import plfx.api.client.common.publish.PublishEventMessage;

/**
 * @类功能说明：国际机票出票成功事件消息
 * @类修改者：
 * @修改日期：2015-7-8下午3:18:15
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @作者：zhurz
 * @创建时间：2015-7-8下午3:18:15
 */
public class GJOutTicketSuccessEventMessage extends PublishEventMessage {

	/**
	 * 分销平台国际机票订单号
	 */
	private String platformOrderId;

	/**
	 * 经销商订单号
	 */
	private String dealerOrderId;

	/**
	 * 乘客票号
	 * 
	 * <乘客姓名, List<票号>>
	 */
	private Map<String, List<String>> passengerEticketNo;

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

	public Map<String, List<String>> getPassengerEticketNo() {
		return passengerEticketNo;
	}

	public void setPassengerEticketNo(
			Map<String, List<String>> passengerEticketNo) {
		this.passengerEticketNo = passengerEticketNo;
	}

}
