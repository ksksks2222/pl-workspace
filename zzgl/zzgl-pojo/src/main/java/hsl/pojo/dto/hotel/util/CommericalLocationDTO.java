package hsl.pojo.dto.hotel.util;

import hsl.pojo.dto.BaseDTO;
@SuppressWarnings("serial")
public class CommericalLocationDTO extends BaseDTO{
	private String commericalLocationId;
	private String name;
	private HotelGeoDTO hotelGeo;
	public String getCommericalLocationId() {
		return commericalLocationId;
	}
	public void setCommericalLocationId(String commericalLocationId) {
		this.commericalLocationId = commericalLocationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HotelGeoDTO getHotelGeo() {
		return hotelGeo;
	}
	public void setHotelGeo(HotelGeoDTO hotelGeo) {
		this.hotelGeo = hotelGeo;
	}
	
}