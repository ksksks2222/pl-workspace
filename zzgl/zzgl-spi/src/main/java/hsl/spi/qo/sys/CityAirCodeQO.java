package hsl.spi.qo.sys;

import hg.common.component.BaseQo;

/**
 * 
 * @类功能说明：城市机场三字码QO
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：tandeng
 * @创建时间：2014年8月4日下午2:43:41
 * @版本：V1.0
 *
 */
@SuppressWarnings("serial")
public class CityAirCodeQO extends BaseQo {
	/**
	 * 城市名称
	 */
	private String name;
	
	private String code;

	private String parentCode;

	/**
	 * 机场三字码
	 */
	private String airCode;

	/**
	 * 城市机场三字码
	 */
	private String cityAirCode;
	
	/**
	 * 城市简拼
	 */
	private String cityJianPin;
	
	/**
	 * 城市全拼
	 */
	private String cityQuanPin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getAirCode() {
		return airCode;
	}

	public void setAirCode(String airCode) {
		this.airCode = airCode;
	}

	public String getCityAirCode() {
		return cityAirCode;
	}

	public void setCityAirCode(String cityAirCode) {
		this.cityAirCode = cityAirCode;
	}

	public String getCityJianPin() {
		return cityJianPin;
	}

	public void setCityJianPin(String cityJianPin) {
		this.cityJianPin = cityJianPin;
	}

	public String getCityQuanPin() {
		return cityQuanPin;
	}

	public void setCityQuanPin(String cityQuanPin) {
		this.cityQuanPin = cityQuanPin;
	}
}
