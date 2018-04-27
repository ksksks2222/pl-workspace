package hsl.pojo.exception;
@SuppressWarnings("serial")
public class LineException extends BaseException{
		
		public LineException(Integer code, String message){
			super(code,message);
		}
		
		/**
		 * 没有数据
		 */
		public static final Integer NODATA = 1; 
		
		/**
		 * 更新指令异常
		 */
		public static final Integer COMMAND_ERROR = 2;
		
		/**
		 * 监听器已满
		 */
		public static final Integer FULL_LISTENERS = 3;
		
		/**
		 * 创建订单失败
		 */
		public static final Integer CREATE_ORDER_FAIL = 4;
		
		
		/**
		 * 更新订单状态失败
		 */
		public static final Integer UPDATE_ORDER_STATUS=5;
		
	}