package hsl.h5.base.weixin;

import java.util.List;


public class WxCustomMenu {
	
	private String type;
	private String name;
	private String key;
	private String url;
	private List<WxCustomMenu> sub_button;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<WxCustomMenu> getSub_button() {
		return sub_button;
	}
	public void setSub_button(List<WxCustomMenu> sub_button) {
		this.sub_button = sub_button;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
