package plfx.mp.tcclient.tc.dto.order;

import plfx.mp.tcclient.tc.dto.Dto;
import plfx.mp.tcclient.tc.util.ReadProperties;


public class OrderDto extends Dto{
	
	public OrderDto() {
		super();
		if("0".equals(ReadProperties.getTc_is_test())){
			this.setUrl(ReadProperties.getTc_order_url());
		}else{
			this.setUrl(ReadProperties.getTc_order_url_test());
		}
	}
	

}
