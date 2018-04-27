package hsl.pojo.dto.jp;
import hsl.pojo.dto.BaseDTO;

import java.util.List;
@SuppressWarnings("serial")
public class PassengerInfoGNDTO extends BaseDTO{
	/**
	 * 乘客集合
	 */
	private List<PassengerGNDTO> passengerList;
	/**
	 * 联系人姓名
	 */
	private String name;
	/***
	 * 联系人电话
	 */
	private String telephone;

	public List<PassengerGNDTO> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<PassengerGNDTO> passengerList) {
		this.passengerList = passengerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
