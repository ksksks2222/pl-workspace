package hsl.pojo.qo.dzp.region;

import hg.common.annotation.QOAttr;
import hg.common.annotation.QOAttrType;
import hg.common.annotation.QOConfig;
import hg.common.component.BaseQo;

/**
 * 电子票务-城市QO
 * Created by hgg on 2016/3/7.
 */
@SuppressWarnings("serial")
@QOConfig(daoBeanId = "dzpCityDAO")
public class DZPCityQO extends BaseQo {

	/**
	 * 城市名称
	 */
	@QOAttr(name = "name", type = QOAttrType.LIKE_ANYWHERE)
	private String name;

	/**
	 * 所属省份ID
	 */
	@QOAttr(name = "fromProvince.id")
	private String proviceId;

	/**
	 * ID排序（大于0升序，小于0降序）
	 */
	@QOAttr(name = "id", type = QOAttrType.ORDER)
	private Integer idOrder = 1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProviceId() {
		return proviceId;
	}

	public void setProviceId(String proviceId) {
		this.proviceId = proviceId;
	}

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}
}
