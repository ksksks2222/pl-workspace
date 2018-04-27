package plfx.mp.tcclient.tc.dto.jd;

import plfx.mp.tcclient.tc.dto.Dto;
import plfx.mp.tcclient.tc.util.ReadProperties;


public class JdDto extends Dto{
	
	public JdDto() {
		super();
		if("0".equals(ReadProperties.getTc_is_test())){
			this.setUrl(ReadProperties.getTc_url());
		}else{
			this.setUrl(ReadProperties.getTc_url_test());
		}
	}
	

}
