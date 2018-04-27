package hsl.pojo.dto.jp;



import org.apache.commons.collections.KeyValue;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @类功能说明：订单状态
 * 用户：
 * 待确认               USER_PAY_WAIT
 * 已取消	    USER_TICKET_CANCEL
 * 出票处理中       USER_TICKET_DEALING
 * 出票失败           USER_TICKET_FAIL
 * 已出票               USER_TICKET_SUCC
 * 退票处理中       USER_TICKET_REFUND_DEALING
 * 退票失败           USER_TICKET_REFUND_FAIL
 * 退票成功           USER_TICKET_REFUND_SUCC
 * 
 *
 * 未支付            USER_TICKET_NO_PAY
 * 已支付            USER_TICKET_PAY_SUCC
 * 待退款            USER_TICKET_REBACK_WAIT
 * 已退款            USER_TICKET_REBACK_SUCC
 *
 *
 * 
 * 商城
 * 待确认               SHOP_PAY_WAIT
 * 已取消		SHOP_TICKET_CANCEL
 * 出票处理中       SHOP_TICKET_DEALING
 * 出票失败           SHOP_TICKET_FAIL
 * 已出票               SHOP_TICKET_SUCC
 * 退票处理中       SHOP_TICKET_REFUND_DEALING
 * 退票失败           SHOP_TICKET_REFUND_FAIL
 * 退票成功           SHOP_TICKET_REFUND_SUCC
 * 
 * 
 * 待支付            SHOP_TICKET_NO_PAY
 * 已支付            SHOP_TICKET_PAY_SUCC
 * 已收款           SHOP_TICKET_RECEIVE_PAYMENT_SUCC
 * 待回款           SHOP_TICKET_TO_BE_BACK_WAIT
 * 已回款           SHOP_TICKET_TO_BE_BACK_SUCC
 * 待退款            SHOP_TICKET_REBACK_WAIT
 * 已退款            SHOP_TICKET_REBACK_SUCC
 * 
 * 分销
 * 待确认               SLFX_PAY_WAIT
 * 已取消		SLFX_TICKET_CANCEL
 * 出票处理中       SLFX_TICKET_DEALING
// * 出票待重试       SLFX_TICKET_TRY_AGAIN
 * 出票失败           SLFX_TICKET_FAIL
 * 已出票               SLFX_TICKET_SUCC
 * 退票处理中       SLFX_TICKET_REFUND_DEALING
 * 退票失败           SLFX_TICKET_REFUND_FAIL
 * 退票成功           SLFX_TICKET_REFUND_SUCC
 * 
 * 待支付             SLFX_TICKET_NO_PAY
 * 已支付             SLFX_TICKET_PAY_SUCC
 * 已收款            SLFX_TICKET_RECEIVE_PAYMENT_SUCC
 * 待回款            SLFX_TICKET_TO_BE_BACK_WAIT
 * 已回款            SLFX_TICKET_TO_BE_BACK_SUCC
 * 待退款             SLFX_TICKET_REBACK_WAIT
 * 已退款             SLFX_TICKET_REBACK_SUCC
 * 
 	
         
         
	
	
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：qiuxianxiang
 * @创建时间：2014年7月31日下午4:27:53
 * @版本：V1.0
 *
 */
@Embeddable
public class JPOrderStatusConstant implements  Serializable{

	/**
	 * @FieldsserialVersionUID:TODO
	 */
	private static final long serialVersionUID = 4903467088416374159L;


	public JPOrderStatusConstant(Integer status) {
		setStatus(status);
	}

	public JPOrderStatusConstant() {
		super();
	}

	public static final String USER_PAY_WAIT = "1";
	public static final String USER_TICKET_CANCEL = "2";
	public static final String USER_TICKET_DEALING = "3";
	public static final String USER_TICKET_FAIL = "4";
	public static final String USER_TICKET_SUCC = "5";
	public static final String USER_TICKET_REFUND_DEALING = "6";
	public static final String USER_TICKET_REFUND_FAIL = "7";
	public static final String USER_TICKET_REFUND_SUCC = "8";
	
	
	public static final String USER_TICKET_NO_PAY = "9";
	public static final String USER_TICKET_PAY_SUCC = "10";
	public static final String USER_TICKET_REBACK_WAIT = "11";
	public static final String USER_TICKET_REBACK_SUCC = "12";
	
	
	
	
	
	public static final String SHOP_PAY_WAIT = "13";
	public static final String SHOP_TICKET_CANCEL = "14";
	public static final String SHOP_TICKET_DEALING = "15";
	public static final String SHOP_TICKET_FAIL = "16";
	public static final String SHOP_TICKET_SUCC = "17";
	public static final String SHOP_TICKET_REFUND_DEALING = "18";
	public static final String SHOP_TICKET_REFUND_FAIL = "19";
	public static final String SHOP_TICKET_REFUND_SUCC	 = "20";
	
	
	public static final String SHOP_TICKET_NO_PAY = "21";
	public static final String SHOP_TICKET_PAY_SUCC = "22";
	public static final String SHOP_TICKET_RECEIVE_PAYMENT_SUCC = "23";
	public static final String SHOP_TICKET_TO_BE_BACK_WAIT = "24";
	public static final String SHOP_TICKET_TO_BE_BACK_SUCC = "25";
	public static final String SHOP_TICKET_REBACK_WAIT = "26";
	public static final String SHOP_TICKET_REBACK_SUCC = "27";
	
	
	
	public static final String SLFX_PAY_WAIT = "28";
	public static final String SLFX_TICKET_CANCEL = "29";
	public static final String SLFX_TICKET_DEALING = "30";
//	public static final String SLFX_TICKET_TRY_AGAIN = "31";
	public static final String SLFX_TICKET_FAIL = "32";
	public static final String SLFX_TICKET_SUCC = "33";
	public static final String SLFX_TICKET_REFUND_DEALING = "34";
	public static final String SLFX_TICKET_REFUND_FAIL = "35";
	public static final String SLFX_TICKET_REFUND_SUCC = "36";
	
	
	
	public static final String SLFX_TICKET_NO_PAY = "37";
	public static final String SLFX_TICKET_PAY_SUCC = "38";
	public static final String SLFX_TICKET_RECEIVE_PAYMENT_SUCC = "39";
	public static final String SLFX_TICKET_TO_BE_BACK_WAIT = "40";
	public static final String SLFX_TICKET_TO_BE_BACK_SUCC = "41";
	public static final String SLFX_TICKET_REBACK_WAIT = "42";
	public static final String SLFX_TICKET_REBACK_SUCC = "43";
	

	public static final String USER_PAY_WAIT_VAL = "待确认";
	public static final String USER_TICKET_CANCEL_VAL = "已取消";
	public static final String USER_TICKET_DEALING_VAL = "出票处理中";
	public static final String USER_TICKET_FAIL_VAL = "出票失败";
	public static final String USER_TICKET_SUCC_VAL = "已出票";
	public static final String USER_TICKET_REFUND_DEALING_VAL = "退/废处理中";
	public static final String USER_TICKET_REFUND_FAIL_VAL = "退/废失败";
	public static final String USER_TICKET_REFUND_SUCC_VAL = "退/废成功";
	
	
	public static final String USER_TICKET_NO_PAY_VAL = "未支付";
	public static final String USER_TICKET_PAY_SUCC_VAL = "已支付 ";
	public static final String USER_TICKET_REBACK_WAIT_VAL = "待退款";
	public static final String USER_TICKET_REBACK_SUCC_VAL = "已退款 ";
	
	
	public static final String SHOP_PAY_WAIT_VAL = "待确认";
	public static final String SHOP_TICKET_CANCEL_VAL = "已取消";
	public static final String SHOP_TICKET_DEALING_VAL = "出票处理中";
	public static final String SHOP_TICKET_FAIL_VAL = "出票失败";
	public static final String SHOP_TICKET_SUCC_VAL = "已出票";
	public static final String SHOP_TICKET_REFUND_DEALING_VAL = "退/废处理中";
	public static final String SHOP_TICKET_REFUND_FAIL_VAL = "退/废失败";
	public static final String SHOP_TICKET_REFUND_SUCC_VAL = "退/废成功";
	
	public static final String SHOP_TICKET_NO_PAY_VAL = "待支付";
	public static final String SHOP_TICKET_PAY_SUCC_VAL = "已支付";
	public static final String SHOP_TICKET_RECEIVE_PAYMENT_SUCC_VAL = "已收款";
	public static final String SHOP_TICKET_TO_BE_BACK_WAIT_VAL = "待回款";
	public static final String SHOP_TICKET_TO_BE_BACK_SUCC_VAL = "已回款";
	public static final String SHOP_TICKET_REBACK_WAIT_VAL = "待退款";
	public static final String SHOP_TICKET_REBACK_SUCC_VAL = "已退款";
	
	
	
	

	public static final String SLFX_PAY_WAIT_VAL = "待确认";
	public static final String SLFX_TICKET_CANCEL_VAL = "已取消";
	public static final String SLFX_TICKET_DEALING_VAL = "出票处理中";
//	public static final String SLFX_TICKET_TRY_AGAIN_VAL = "出票待重试";
	public static final String SLFX_TICKET_FAIL_VAL = "出票失败";
	public static final String SLFX_TICKET_SUCC_VAL = "已出票";
	public static final String SLFX_TICKET_REFUND_DEALING_VAL = "退/废处理中";
	public static final String SLFX_TICKET_REFUND_FAIL_VAL = "退/废失败";
	public static final String SLFX_TICKET_REFUND_SUCC_VAL = "退/废成功";
	
	public static final String SLFX_TICKET_NO_PAY_VAL = "待支付 ";
	public static final String SLFX_TICKET_PAY_SUCC_VAL = "已支付";
	public static final String SLFX_TICKET_RECEIVE_PAYMENT_SUCC_VAL = "已收款";
	public static final String SLFX_TICKET_TO_BE_BACK_WAIT_VAL = "待回款";
	public static final String SLFX_TICKET_TO_BE_BACK_SUCC_VAL = "已回款";
	public static final String SLFX_TICKET_REBACK_WAIT_VAL = "待退款";
	public static final String SLFX_TICKET_REBACK_SUCC_VAL = "已退款";
	

	
	
	public final static List<KeyValue> JPORDER_STATUS_LIST = new ArrayList<KeyValue>();
	static {
		JPORDER_STATUS_LIST.add(new Attr(USER_PAY_WAIT, USER_PAY_WAIT_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_CANCEL, USER_TICKET_CANCEL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_DEALING, USER_TICKET_DEALING_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_FAIL, USER_TICKET_FAIL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_SUCC, USER_TICKET_SUCC_VAL));
		
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_REFUND_DEALING, USER_TICKET_REFUND_DEALING_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_REFUND_FAIL, USER_TICKET_REFUND_FAIL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_REFUND_SUCC, USER_TICKET_REFUND_SUCC_VAL));
		
		
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_NO_PAY, USER_TICKET_NO_PAY_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_PAY_SUCC, USER_TICKET_PAY_SUCC_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_REBACK_WAIT, USER_TICKET_REBACK_WAIT_VAL));
		JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_REBACK_SUCC, USER_TICKET_REBACK_SUCC_VAL));
		
		
		JPORDER_STATUS_LIST.add(new Attr(SHOP_PAY_WAIT, SHOP_PAY_WAIT_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_CANCEL, SHOP_TICKET_CANCEL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_DEALING,SHOP_TICKET_DEALING_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_FAIL, SHOP_TICKET_FAIL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_SUCC, SHOP_TICKET_SUCC_VAL));
		
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_DEALING, SHOP_TICKET_REFUND_DEALING_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_FAIL, SHOP_TICKET_REFUND_FAIL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_SUCC,SHOP_TICKET_REFUND_SUCC_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_NO_PAY, SHOP_TICKET_NO_PAY_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_PAY_SUCC, SHOP_TICKET_PAY_SUCC_VAL));
		
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_RECEIVE_PAYMENT_SUCC,SHOP_TICKET_RECEIVE_PAYMENT_SUCC_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_TO_BE_BACK_WAIT, SHOP_TICKET_TO_BE_BACK_WAIT_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_TO_BE_BACK_SUCC,SHOP_TICKET_TO_BE_BACK_SUCC_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_REBACK_WAIT, SHOP_TICKET_REBACK_WAIT_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_REBACK_SUCC, SHOP_TICKET_REBACK_SUCC_VAL));
		
		
		
		
		JPORDER_STATUS_LIST.add(new Attr(SLFX_PAY_WAIT, SLFX_PAY_WAIT_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_CANCEL, SLFX_TICKET_CANCEL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_DEALING, SLFX_TICKET_DEALING_VAL));
//		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_TRY_AGAIN, SLFX_TICKET_TRY_AGAIN_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_FAIL, SLFX_TICKET_FAIL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_SUCC, SLFX_TICKET_SUCC_VAL));
		
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_REFUND_DEALING, SLFX_TICKET_REFUND_DEALING_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_REFUND_FAIL, SLFX_TICKET_REFUND_FAIL_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_REFUND_SUCC, SLFX_TICKET_REFUND_SUCC_VAL));
		
		
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_NO_PAY, SLFX_TICKET_NO_PAY_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_PAY_SUCC, SLFX_TICKET_PAY_SUCC_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_RECEIVE_PAYMENT_SUCC, SLFX_TICKET_RECEIVE_PAYMENT_SUCC_VAL));
		
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_TO_BE_BACK_WAIT, SLFX_TICKET_TO_BE_BACK_WAIT_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_TO_BE_BACK_SUCC, SLFX_TICKET_TO_BE_BACK_SUCC_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_REBACK_WAIT, SLFX_TICKET_REBACK_WAIT_VAL));
		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_REBACK_SUCC, SLFX_TICKET_REBACK_SUCC_VAL));
		
	}
	
	//分销订单状态
	public final static List<KeyValue> SLFX_JPORDER_STATUS_LIST = new ArrayList<KeyValue>();
	static {
		SLFX_JPORDER_STATUS_LIST.add(new Attr(SLFX_PAY_WAIT, SLFX_PAY_WAIT_VAL));
		SLFX_JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_CANCEL, SLFX_TICKET_CANCEL_VAL));
		SLFX_JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_DEALING, SLFX_TICKET_DEALING_VAL));
//		JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_TRY_AGAIN, SLFX_TICKET_TRY_AGAIN_VAL));
		SLFX_JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_FAIL, SLFX_TICKET_FAIL_VAL));
		SLFX_JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_SUCC, SLFX_TICKET_SUCC_VAL));
		
		SLFX_JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_REFUND_DEALING, SLFX_TICKET_REFUND_DEALING_VAL));
		SLFX_JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_REFUND_FAIL, SLFX_TICKET_REFUND_FAIL_VAL));
		SLFX_JPORDER_STATUS_LIST.add(new Attr(SLFX_TICKET_REFUND_SUCC, SLFX_TICKET_REFUND_SUCC_VAL));
		
	}
	//分销支付状态
		public final static List<KeyValue> SLFX_JPORDER_PAY_STATUS_LIST = new ArrayList<KeyValue>();
		static {
			SLFX_JPORDER_PAY_STATUS_LIST.add(new Attr(SLFX_TICKET_NO_PAY, SLFX_TICKET_NO_PAY_VAL));
			SLFX_JPORDER_PAY_STATUS_LIST.add(new Attr(SLFX_TICKET_PAY_SUCC, SLFX_TICKET_PAY_SUCC_VAL));
			SLFX_JPORDER_PAY_STATUS_LIST.add(new Attr(SLFX_TICKET_RECEIVE_PAYMENT_SUCC, SLFX_TICKET_RECEIVE_PAYMENT_SUCC_VAL));
			
			SLFX_JPORDER_PAY_STATUS_LIST.add(new Attr(SLFX_TICKET_TO_BE_BACK_WAIT, SLFX_TICKET_TO_BE_BACK_WAIT_VAL));
			SLFX_JPORDER_PAY_STATUS_LIST.add(new Attr(SLFX_TICKET_TO_BE_BACK_SUCC, SLFX_TICKET_TO_BE_BACK_SUCC_VAL));
			SLFX_JPORDER_PAY_STATUS_LIST.add(new Attr(SLFX_TICKET_REBACK_WAIT, SLFX_TICKET_REBACK_WAIT_VAL));
			SLFX_JPORDER_PAY_STATUS_LIST.add(new Attr(SLFX_TICKET_REBACK_SUCC, SLFX_TICKET_REBACK_SUCC_VAL));
		}
		//用户订单状态
		public final static List<KeyValue> USER_JPORDER_STATUS_LIST = new ArrayList<KeyValue>();
		static {
			USER_JPORDER_STATUS_LIST.add(new Attr(USER_PAY_WAIT, USER_PAY_WAIT_VAL));
			USER_JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_CANCEL, USER_TICKET_CANCEL_VAL));
			USER_JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_DEALING, USER_TICKET_DEALING_VAL));
			USER_JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_FAIL, USER_TICKET_FAIL_VAL));
			USER_JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_SUCC, USER_TICKET_SUCC_VAL));
			
			USER_JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_REFUND_DEALING, USER_TICKET_REFUND_DEALING_VAL));
			USER_JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_REFUND_FAIL, USER_TICKET_REFUND_FAIL_VAL));
			USER_JPORDER_STATUS_LIST.add(new Attr(USER_TICKET_REFUND_SUCC, USER_TICKET_REFUND_SUCC_VAL));
			
		}
		//用户支付状态
			public final static List<KeyValue> USER_JPORDER_PAY_STATUS_LIST = new ArrayList<KeyValue>();
			static {
				USER_JPORDER_PAY_STATUS_LIST.add(new Attr(USER_TICKET_NO_PAY, USER_TICKET_NO_PAY_VAL));
				USER_JPORDER_PAY_STATUS_LIST.add(new Attr(USER_TICKET_PAY_SUCC, USER_TICKET_PAY_SUCC_VAL));
				USER_JPORDER_PAY_STATUS_LIST.add(new Attr(USER_TICKET_REBACK_WAIT, USER_TICKET_REBACK_WAIT_VAL));
				USER_JPORDER_PAY_STATUS_LIST.add(new Attr(USER_TICKET_REBACK_SUCC, USER_TICKET_REBACK_SUCC_VAL));
			}
	
			//商城订单状态
			public final static List<KeyValue> SHOP_JPORDER_STATUS_LIST = new ArrayList<KeyValue>();
			static {
				SHOP_JPORDER_STATUS_LIST.add(new Attr(SHOP_PAY_WAIT, SHOP_PAY_WAIT_VAL));
				SHOP_JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_CANCEL, SHOP_TICKET_CANCEL_VAL));
				SHOP_JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_DEALING,SHOP_TICKET_DEALING_VAL));
				SHOP_JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_FAIL, SHOP_TICKET_FAIL_VAL));
				SHOP_JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_SUCC, SHOP_TICKET_SUCC_VAL));
				
				SHOP_JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_DEALING, SHOP_TICKET_REFUND_DEALING_VAL));
				SHOP_JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_FAIL, SHOP_TICKET_REFUND_FAIL_VAL));
				SHOP_JPORDER_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_SUCC,SHOP_TICKET_REFUND_SUCC_VAL));
				
			}
			//商城支付状态
				public final static List<KeyValue> SHOP_JPORDER_PAY_STATUS_LIST = new ArrayList<KeyValue>();
				static {
					SHOP_JPORDER_PAY_STATUS_LIST.add(new Attr(SHOP_TICKET_NO_PAY, SHOP_TICKET_NO_PAY_VAL));
					SHOP_JPORDER_PAY_STATUS_LIST.add(new Attr(SHOP_TICKET_PAY_SUCC, SHOP_TICKET_PAY_SUCC_VAL));
					
					SHOP_JPORDER_PAY_STATUS_LIST.add(new Attr(SHOP_TICKET_RECEIVE_PAYMENT_SUCC,SHOP_TICKET_RECEIVE_PAYMENT_SUCC_VAL));
					SHOP_JPORDER_PAY_STATUS_LIST.add(new Attr(SHOP_TICKET_TO_BE_BACK_WAIT, SHOP_TICKET_TO_BE_BACK_WAIT_VAL));
					SHOP_JPORDER_PAY_STATUS_LIST.add(new Attr(SHOP_TICKET_TO_BE_BACK_SUCC,SHOP_TICKET_TO_BE_BACK_SUCC_VAL));
					SHOP_JPORDER_PAY_STATUS_LIST.add(new Attr(SHOP_TICKET_REBACK_WAIT, SHOP_TICKET_REBACK_WAIT_VAL));
					SHOP_JPORDER_PAY_STATUS_LIST.add(new Attr(SHOP_TICKET_REBACK_SUCC, SHOP_TICKET_REBACK_SUCC_VAL));
					
				}
		
		//商城wap订单状态list
		public final static List<KeyValue> SHOP_JPORDER_USER_WAP_STATUS_LIST = new ArrayList<KeyValue>();
		static{
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr("sp1","已取消"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr("sp2","出票失败待退款"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr(SHOP_PAY_WAIT+SHOP_TICKET_NO_PAY,"待支付"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr(SHOP_TICKET_DEALING+SHOP_TICKET_PAY_SUCC,"出票处理中"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr(SHOP_TICKET_FAIL+SHOP_TICKET_REBACK_SUCC,"出票失败已退款"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr(SHOP_TICKET_SUCC+SHOP_TICKET_PAY_SUCC,"已出票"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_DEALING+SHOP_TICKET_PAY_SUCC,"退票处理中"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_SUCC+SHOP_TICKET_REBACK_WAIT,"退票成功待退款"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_SUCC+SHOP_TICKET_REBACK_SUCC,"退票成功已退款"));
			SHOP_JPORDER_USER_WAP_STATUS_LIST.add(new Attr(SHOP_TICKET_REFUND_FAIL+SHOP_TICKET_PAY_SUCC,"退票失败"));
		}
		
	
	
	public final static HashMap<String,String> JPORDER_STATUS_MAP = new HashMap<String,String>();
	static {
		JPORDER_STATUS_MAP.put(USER_PAY_WAIT, USER_PAY_WAIT_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_CANCEL, USER_TICKET_CANCEL_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_DEALING, USER_TICKET_DEALING_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_FAIL, USER_TICKET_FAIL_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_SUCC, USER_TICKET_SUCC_VAL);
		
		JPORDER_STATUS_MAP.put(USER_TICKET_REFUND_DEALING, USER_TICKET_REFUND_DEALING_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_REFUND_FAIL, USER_TICKET_REFUND_FAIL_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_REFUND_SUCC, USER_TICKET_REFUND_SUCC_VAL);
		
		
		JPORDER_STATUS_MAP.put(USER_TICKET_NO_PAY, USER_TICKET_NO_PAY_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_PAY_SUCC, USER_TICKET_PAY_SUCC_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_REBACK_WAIT, USER_TICKET_REBACK_WAIT_VAL);
		JPORDER_STATUS_MAP.put(USER_TICKET_REBACK_SUCC, USER_TICKET_REBACK_SUCC_VAL);
		
		
		JPORDER_STATUS_MAP.put(SHOP_PAY_WAIT, SHOP_PAY_WAIT_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_CANCEL, SHOP_TICKET_CANCEL_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_DEALING,SHOP_TICKET_DEALING_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_FAIL, SHOP_TICKET_FAIL_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_SUCC, SHOP_TICKET_SUCC_VAL);
		
		JPORDER_STATUS_MAP.put(SHOP_TICKET_REFUND_DEALING, SHOP_TICKET_REFUND_DEALING_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_REFUND_FAIL, SHOP_TICKET_REFUND_FAIL_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_REFUND_SUCC,SHOP_TICKET_REFUND_SUCC_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_NO_PAY, SHOP_TICKET_NO_PAY_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_PAY_SUCC, SHOP_TICKET_PAY_SUCC_VAL);
		
		JPORDER_STATUS_MAP.put(SHOP_TICKET_RECEIVE_PAYMENT_SUCC,SHOP_TICKET_RECEIVE_PAYMENT_SUCC_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_TO_BE_BACK_WAIT, SHOP_TICKET_TO_BE_BACK_WAIT_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_TO_BE_BACK_SUCC,SHOP_TICKET_TO_BE_BACK_SUCC_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_REBACK_WAIT, SHOP_TICKET_REBACK_WAIT_VAL);
		JPORDER_STATUS_MAP.put(SHOP_TICKET_REBACK_SUCC, SHOP_TICKET_REBACK_SUCC_VAL);
		
		
		
		
		JPORDER_STATUS_MAP.put(SLFX_PAY_WAIT, SLFX_PAY_WAIT_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_CANCEL, SLFX_TICKET_CANCEL_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_DEALING, SLFX_TICKET_DEALING_VAL);
//		JPORDER_STATUS_MAP.put(SLFX_TICKET_TRY_AGAIN, SLFX_TICKET_TRY_AGAIN_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_FAIL, SLFX_TICKET_FAIL_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_SUCC, SLFX_TICKET_SUCC_VAL);
		
		JPORDER_STATUS_MAP.put(SLFX_TICKET_REFUND_DEALING, SLFX_TICKET_REFUND_DEALING_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_REFUND_FAIL, SLFX_TICKET_REFUND_FAIL_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_REFUND_SUCC, SLFX_TICKET_REFUND_SUCC_VAL);
		
		
		JPORDER_STATUS_MAP.put(SLFX_TICKET_NO_PAY, SLFX_TICKET_NO_PAY_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_PAY_SUCC, SLFX_TICKET_PAY_SUCC_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_RECEIVE_PAYMENT_SUCC, SLFX_TICKET_RECEIVE_PAYMENT_SUCC_VAL);
		
		JPORDER_STATUS_MAP.put(SLFX_TICKET_TO_BE_BACK_WAIT, SLFX_TICKET_TO_BE_BACK_WAIT_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_TO_BE_BACK_SUCC, SLFX_TICKET_TO_BE_BACK_SUCC_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_REBACK_WAIT, SLFX_TICKET_REBACK_WAIT_VAL);
		JPORDER_STATUS_MAP.put(SLFX_TICKET_REBACK_SUCC, SLFX_TICKET_REBACK_SUCC_VAL);
	}
	//用户订单状态
	public final static HashMap<String,String> USER_JPORDER_STATUS_MAP = new HashMap<String,String>();
	static {
		USER_JPORDER_STATUS_MAP.put(USER_PAY_WAIT, USER_PAY_WAIT_VAL);
		USER_JPORDER_STATUS_MAP.put(USER_TICKET_CANCEL, USER_TICKET_CANCEL_VAL);
		USER_JPORDER_STATUS_MAP.put(USER_TICKET_DEALING, USER_TICKET_DEALING_VAL);
		USER_JPORDER_STATUS_MAP.put(USER_TICKET_FAIL, USER_TICKET_FAIL_VAL);
		USER_JPORDER_STATUS_MAP.put(USER_TICKET_SUCC, USER_TICKET_SUCC_VAL);
		USER_JPORDER_STATUS_MAP.put(USER_TICKET_REFUND_DEALING, USER_TICKET_REFUND_DEALING_VAL);
		USER_JPORDER_STATUS_MAP.put(USER_TICKET_REFUND_FAIL, USER_TICKET_REFUND_FAIL_VAL);
		USER_JPORDER_STATUS_MAP.put(USER_TICKET_REFUND_SUCC, USER_TICKET_REFUND_SUCC_VAL);
	}
	//用户支付状态
		public final static HashMap<String,String> USER_JPORDER_PATY_STATUS_MAP = new HashMap<String,String>();
		static {
			USER_JPORDER_PATY_STATUS_MAP.put(USER_TICKET_NO_PAY, USER_TICKET_NO_PAY_VAL);
			USER_JPORDER_PATY_STATUS_MAP.put(USER_TICKET_PAY_SUCC, USER_TICKET_PAY_SUCC_VAL);
			USER_JPORDER_PATY_STATUS_MAP.put(USER_TICKET_REBACK_WAIT, USER_TICKET_REBACK_WAIT_VAL);
			USER_JPORDER_PATY_STATUS_MAP.put(USER_TICKET_REBACK_SUCC, USER_TICKET_REBACK_SUCC_VAL);
		}
		
		//用户wap订单状态(使用的时候订单状态在前，支付状态在后)
		public final static HashMap<String,String> SHOP_JPORDER_USER_WAP_STATUS_MAP = new HashMap<String, String>();
		static{
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_CANCEL+SHOP_TICKET_NO_PAY,"已取消");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_CANCEL+SHOP_TICKET_PAY_SUCC,"已取消");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_PAY_WAIT+SHOP_TICKET_NO_PAY,"待支付");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_DEALING+SHOP_TICKET_PAY_SUCC,"出票处理中");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_REBACK_WAIT,"出票失败待退款");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_TO_BE_BACK_WAIT,"出票失败待退款");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_REBACK_SUCC,"出票失败已退款");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_SUCC+SHOP_TICKET_PAY_SUCC,"已出票");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_REFUND_DEALING+SHOP_TICKET_PAY_SUCC,"退票处理中");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_REFUND_SUCC+SHOP_TICKET_REBACK_WAIT,"退票成功待退款");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_REFUND_SUCC+SHOP_TICKET_REBACK_SUCC,"退票成功已退款");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_REFUND_FAIL+SHOP_TICKET_PAY_SUCC,"退票失败");
			SHOP_JPORDER_USER_WAP_STATUS_MAP.put(SHOP_TICKET_REFUND_FAIL+SHOP_TICKET_PAY_SUCC,"已取消");
		}
		//用户状态对应订单状态
		public final static HashMap<String,String> SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP = new HashMap<String, String>();
		static{
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_CANCEL+SHOP_TICKET_NO_PAY,SHOP_TICKET_CANCEL);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_CANCEL+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_CANCEL);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_PAY_WAIT+SHOP_TICKET_NO_PAY,SHOP_PAY_WAIT);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_DEALING+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_DEALING);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_REBACK_WAIT,SHOP_TICKET_FAIL);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_TO_BE_BACK_WAIT,SHOP_TICKET_FAIL);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_REBACK_SUCC,SHOP_TICKET_FAIL);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_SUCC+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_REFUND_DEALING+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_REFUND_DEALING);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_REFUND_SUCC+SHOP_TICKET_REBACK_WAIT,SHOP_TICKET_REFUND_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_REFUND_SUCC+SHOP_TICKET_REBACK_SUCC,SHOP_TICKET_REFUND_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_TICKET_MAP.put(SHOP_TICKET_REFUND_FAIL+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_REFUND_FAIL);
		}
		//用户状态对应支付状态
		public final static HashMap<String,String> SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP = new HashMap<String, String>();
		static{
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_CANCEL+SHOP_TICKET_NO_PAY,SHOP_TICKET_NO_PAY);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_CANCEL+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_PAY_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_PAY_WAIT+SHOP_TICKET_NO_PAY,SHOP_TICKET_NO_PAY);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_DEALING+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_PAY_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_REBACK_WAIT,SHOP_TICKET_REBACK_WAIT);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_TO_BE_BACK_WAIT,SHOP_TICKET_TO_BE_BACK_WAIT);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_FAIL+SHOP_TICKET_REBACK_SUCC,SHOP_TICKET_REBACK_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_SUCC+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_PAY_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_REFUND_DEALING+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_PAY_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_REFUND_SUCC+SHOP_TICKET_REBACK_WAIT,SHOP_TICKET_REBACK_WAIT);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_REFUND_SUCC+SHOP_TICKET_REBACK_SUCC,SHOP_TICKET_REBACK_SUCC);
			SHOP_JPORDER_USER_WAP_STATUS_TO_PAY_MAP.put(SHOP_TICKET_REFUND_FAIL+SHOP_TICKET_PAY_SUCC,SHOP_TICKET_PAY_SUCC);
		}
		//商城订单状态
		public final static HashMap<String,String> SHOP_JPORDER_STATUS_MAP = new HashMap<String,String>();
		static {
			SHOP_JPORDER_STATUS_MAP.put(SHOP_PAY_WAIT, SHOP_PAY_WAIT_VAL);
			SHOP_JPORDER_STATUS_MAP.put(SHOP_TICKET_CANCEL, SHOP_TICKET_CANCEL_VAL);
			SHOP_JPORDER_STATUS_MAP.put(SHOP_TICKET_DEALING,SHOP_TICKET_DEALING_VAL);
			SHOP_JPORDER_STATUS_MAP.put(SHOP_TICKET_FAIL, SHOP_TICKET_FAIL_VAL);
			SHOP_JPORDER_STATUS_MAP.put(SHOP_TICKET_SUCC, SHOP_TICKET_SUCC_VAL);
			
			SHOP_JPORDER_STATUS_MAP.put(SHOP_TICKET_REFUND_DEALING, SHOP_TICKET_REFUND_DEALING_VAL);
			SHOP_JPORDER_STATUS_MAP.put(SHOP_TICKET_REFUND_FAIL, SHOP_TICKET_REFUND_FAIL_VAL);
			SHOP_JPORDER_STATUS_MAP.put(SHOP_TICKET_REFUND_SUCC,SHOP_TICKET_REFUND_SUCC_VAL);
		}
		//商城支付状态
			public final static HashMap<String,String> SHOP_JPORDER_PAY_STATUS_MAP = new HashMap<String,String>();
			static {
				SHOP_JPORDER_PAY_STATUS_MAP.put(SHOP_TICKET_NO_PAY, SHOP_TICKET_NO_PAY_VAL);
				SHOP_JPORDER_PAY_STATUS_MAP.put(SHOP_TICKET_PAY_SUCC, SHOP_TICKET_PAY_SUCC_VAL);
				
				SHOP_JPORDER_PAY_STATUS_MAP.put(SHOP_TICKET_RECEIVE_PAYMENT_SUCC,SHOP_TICKET_RECEIVE_PAYMENT_SUCC_VAL);
				SHOP_JPORDER_PAY_STATUS_MAP.put(SHOP_TICKET_TO_BE_BACK_WAIT, SHOP_TICKET_TO_BE_BACK_WAIT_VAL);
				SHOP_JPORDER_PAY_STATUS_MAP.put(SHOP_TICKET_TO_BE_BACK_SUCC,SHOP_TICKET_TO_BE_BACK_SUCC_VAL);
				SHOP_JPORDER_PAY_STATUS_MAP.put(SHOP_TICKET_REBACK_WAIT, SHOP_TICKET_REBACK_WAIT_VAL);
				SHOP_JPORDER_PAY_STATUS_MAP.put(SHOP_TICKET_REBACK_SUCC, SHOP_TICKET_REBACK_SUCC_VAL);
			}
			//分销订单状态
			public final static HashMap<String,String> SLFX_JPORDER_STATUS_MAP = new HashMap<String,String>();
			static {
				SLFX_JPORDER_STATUS_MAP.put(SLFX_PAY_WAIT, SLFX_PAY_WAIT_VAL);
				SLFX_JPORDER_STATUS_MAP.put(SLFX_TICKET_CANCEL, SLFX_TICKET_CANCEL_VAL);
				SLFX_JPORDER_STATUS_MAP.put(SLFX_TICKET_DEALING, SLFX_TICKET_DEALING_VAL);
//				JPORDER_STATUS_MAP.put(SLFX_TICKET_TRY_AGAIN, SLFX_TICKET_TRY_AGAIN_VAL);
				SLFX_JPORDER_STATUS_MAP.put(SLFX_TICKET_FAIL, SLFX_TICKET_FAIL_VAL);
				SLFX_JPORDER_STATUS_MAP.put(SLFX_TICKET_SUCC, SLFX_TICKET_SUCC_VAL);
				
				SLFX_JPORDER_STATUS_MAP.put(SLFX_TICKET_REFUND_DEALING, SLFX_TICKET_REFUND_DEALING_VAL);
				SLFX_JPORDER_STATUS_MAP.put(SLFX_TICKET_REFUND_FAIL, SLFX_TICKET_REFUND_FAIL_VAL);
				SLFX_JPORDER_STATUS_MAP.put(SLFX_TICKET_REFUND_SUCC, SLFX_TICKET_REFUND_SUCC_VAL);
			}
			//分销支付状态
				public final static HashMap<String,String> SLFX_JPORDER_PAY_STATUS_MAP = new HashMap<String,String>();
				static {
					SLFX_JPORDER_PAY_STATUS_MAP.put(SLFX_TICKET_NO_PAY, SLFX_TICKET_NO_PAY_VAL);
					SLFX_JPORDER_PAY_STATUS_MAP.put(SLFX_TICKET_PAY_SUCC, SLFX_TICKET_PAY_SUCC_VAL);
					SLFX_JPORDER_PAY_STATUS_MAP.put(SLFX_TICKET_RECEIVE_PAYMENT_SUCC, SLFX_TICKET_RECEIVE_PAYMENT_SUCC_VAL);
					
					SLFX_JPORDER_PAY_STATUS_MAP.put(SLFX_TICKET_TO_BE_BACK_WAIT, SLFX_TICKET_TO_BE_BACK_WAIT_VAL);
					SLFX_JPORDER_PAY_STATUS_MAP.put(SLFX_TICKET_TO_BE_BACK_SUCC, SLFX_TICKET_TO_BE_BACK_SUCC_VAL);
					SLFX_JPORDER_PAY_STATUS_MAP.put(SLFX_TICKET_REBACK_WAIT, SLFX_TICKET_REBACK_WAIT_VAL);
					SLFX_JPORDER_PAY_STATUS_MAP.put(SLFX_TICKET_REBACK_SUCC, SLFX_TICKET_REBACK_SUCC_VAL);
				}
		
	
	/**  平台订单状态与供应商订单状态的对应关系   */
	public final static HashMap<String,String> STATUS_KEY_RELATION = new HashMap<String,String>();
	public static final String YG_WAIT_PAY= "NW"; //新订单待支付
	public static final String YG_ALREADY_PAY= "PY";    //已支付
	public static final String YG_TEMPORARILY_TICKET= "ZP"; //暂不能出票
	public static final String YG_ALREADY_TICKET= "TP"; //已出票
	public static final String YG_WAIT_REFUND= "RW";   //出票失败待退款
	public static final String YG_ALREADY_REFUND= "RP";   //出票失败已退款
	public static final String YG_REFUND_SUCCESS="FR";//退款成功
	public static final String YG_REFUND_FAIL="RR";//退废失败
	public static final String YG_APPLY_FAIL="RF";//升舱失败
	public static final String YG_APPLY_REFUND_DISCARD= "AR";   //申请退/废票
	static {
//		STATUS_KEY_RELATION.put(WAIT_PAY, YG_WAIT_PAY);
//		STATUS_KEY_RELATION.put(ALREADY_PAY, YG_ALREADY_PAY);
//		STATUS_KEY_RELATION.put(TEMPORARILY_TICKET,YG_TEMPORARILY_TICKET);
//		STATUS_KEY_RELATION.put(ALREADY_TICKET, YG_ALREADY_TICKET);
//		
//		STATUS_KEY_RELATION.put(WAIT_REFUND, YG_WAIT_REFUND);
//		STATUS_KEY_RELATION.put(ALREADY_REFUND, YG_ALREADY_REFUND);
//		STATUS_KEY_RELATION.put(REFUND_SUCCESS, YG_REFUND_SUCCESS);
//		STATUS_KEY_RELATION.put(REFUND_FAIL, YG_REFUND_FAIL);
//		
//		STATUS_KEY_RELATION.put(APPLY_FAIL, YG_APPLY_FAIL);
//		STATUS_KEY_RELATION.put(APPLY_REFUND_DISCARD, YG_APPLY_REFUND_DISCARD);
	}
	
	
	
   /** 订单状态 */
   private Integer status;
   
   /** 支付状态 */
   private Integer payStatus;
   

	public JPOrderStatusConstant(Integer status,Integer payStatus) {
		super();
		setStatus(status);
		setPayStatus(payStatus);
}

	public static final String COMMON_TYPE = "0";
	public static final String EXCEPTION_TYPE = "1";
	
	public static final String COMMON_TYPE_STR = "普通订单";
	public static final String EXCEPTION_TYPE_STR = "异常订单";
	public final static HashMap<String,String> JPORDER_TYPE_MAP = new HashMap<String,String>();
	static {
		JPORDER_TYPE_MAP.put(COMMON_TYPE, COMMON_TYPE_STR);
		JPORDER_TYPE_MAP.put(EXCEPTION_TYPE, EXCEPTION_TYPE_STR);
	}
	
	/** 退废订单状态   */
	public static final Integer CATEGORY_REFUND = 0;// 废票
	public static final Integer CATEGORY_BACK = 1;  // 退票
	/** 退废订单状态   */
	public static final String CATEGORY_REFUND_VAL = "已废票";// 废票
	public static final String CATEGORY_BACK_VAL = "已退票";  // 退票
	
	
   /** 
    * 是否可支付
    */
   public Boolean canPay(JPOrderDTO order) {
      // TODO: implement
      return false;
   }
   
   /** 
    * 是否可废票
    */
   public Boolean canDelete(JPOrderDTO order) {
      // TODO: implement
      return false;
   }
   
	/** 
	* 是否可退票
	*/
	public Boolean canCancel(JPOrderDTO order) {
		// TODO: implement
		return false;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

}

class Attr implements KeyValue, Serializable {
	
	private static final long serialVersionUID = -6969400281629759587L;
	
	private Object key;
	private Object value;
	
	public Attr(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public Object getKey() {
		return key;
	}

	@Override
	public Object getValue() {
		return value;
	}
	
	public void setKey(Object key) {
		this.key = key;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}