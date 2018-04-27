package plfx.xl.pojo.command.order;

import hg.common.component.BaseCommand;

/**
 * 
 * @类功能说明：取消订单
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：luoyun
 * @创建时间：2014年12月23日上午10:29:07
 * @版本：V1.0
 *
 */
@SuppressWarnings("serial")
public class CancleLineOrderCommand extends BaseCommand{

	/**
	 * 订单编号
	 */
	private String lineOrderID;
	
	/**
	 * 取消订单的游客ID，用","隔开
	 */
	private String lineOrderTravelers;

	public String getLineOrderID() {
		return lineOrderID;
	}

	public void setLineOrderID(String lineOrderID) {
		this.lineOrderID = lineOrderID;
	}

	public String getLineOrderTravelers() {
		return lineOrderTravelers;
	}

	public void setLineOrderTravelers(String lineOrderTravelers) {
		this.lineOrderTravelers = lineOrderTravelers;
	}

	
	
	
	
}