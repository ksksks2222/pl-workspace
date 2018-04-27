package plfx.yeexing.pojo.command.message;

import hg.common.component.BaseCommand;


/**
 * 
 * @类功能说明：api接口机票消息通知command
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：yuqz
 * @创建时间：2015年7月7日下午5:12:39
 * @版本：V1.0
 *
 */
@SuppressWarnings("serial")
public class JPNotifyMessageApiCommand extends BaseCommand {
	
	/**
	 * 经销商订单号
	 */
	private String dealerOrderCode;
	
	/**
	 * 分销订单号
	 * 用于取前5位分辨是哪个经销商
	 */
	private String orderNo;
	
	/**
	 * 乘客姓名
	 * 多个乘客之间用 ^ 分隔
	 */
	private String passengerName;
	
	/**
	 * 票号
	 * 票号之间用 ^分隔，并与姓名相对应
	 */
	private String airId;	
	
	/**
	 * 通知类型
	 * 1：出票成功通知
	 * 2:支付成功通知
	 * 3：取消成功通知
	 * 4：退废票通知
	 * 5：分销申请退废票成功通知
	 * 6：拒绝出票通知
	 * 7：同步退废票状态通知
	 */
	private String type;					

	/**
	 * 新pnr
	 * 换编码出票后的pnr，如没有，则为空
	 */
	private String newPnr;
	
	/**
	 * 实退金额
	 * 支付方实际退款金额
	 */
	private Double refundPrice;

	/**
	 * 退票状态
	 * 1—成功 2—拒绝退废票
	 */
	private Integer refundStatus;
	/**
	 * 拒绝退票理由
	 */
	private String refuseMemo;
	/**
	 * 退款手续费
	 * 退款时的手续费
	 */
	private Double procedures;
	
	/**
	 * 签名
	 */
	private String sign;
	
	/**
	 * 支付流水号
	 */
	private String payId;
	
	/**
	 * 总支付金额
	 */
	private Double totalPrice;
	
	/**
	 * 支付平台
	 */
	private Integer payPlatform;
	
	/**
	 * 支付方式
	 */
	private Integer payType;
	
	/**
	 * 申请种类
	 * 1.当日作废2.自愿退票3.非自愿退票 4.差错退款 5.其他
	 */
	private String refundType;
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getAirId() {
		return airId;
	}
	public void setAirId(String airId) {
		this.airId = airId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNewPnr() {
		return newPnr;
	}
	public void setNewPnr(String newPnr) {
		this.newPnr = newPnr;
	}
	public Double getRefundPrice() {
		return refundPrice;
	}
	public void setRefundPrice(Double refundPrice) {
		this.refundPrice = refundPrice;
	}
	public Integer getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefuseMemo() {
		return refuseMemo;
	}
	public void setRefuseMemo(String refuseMemo) {
		this.refuseMemo = refuseMemo;
	}
	public Double getProcedures() {
		return procedures;
	}
	public void setProcedures(Double procedures) {
		this.procedures = procedures;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getPayPlatform() {
		return payPlatform;
	}
	public void setPayPlatform(Integer payPlatform) {
		this.payPlatform = payPlatform;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public String getDealerOrderCode() {
		return dealerOrderCode;
	}
	public void setDealerOrderCode(String dealerOrderCode) {
		this.dealerOrderCode = dealerOrderCode;
	}
	public String getRefundType() {
		return refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
}