package hgria.admin.controller.hgCommon.baseDate;


import hg.log.util.HgLogger;
import hg.system.model.meta.City;
import hg.system.model.meta.Province;
import hg.system.qo.CityQo;
import hg.system.qo.ProvinceQo;
import hg.system.service.impl.CityServiceImpl;
import hg.system.service.impl.ProvinceServiceImpl;
import hgria.admin.controller.BaseController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @类功能说明：基础数据_控制器
 * @类修改者：zzb
 * @修改日期：2014年9月10日上午9:01:43
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @作者：zzb
 * @创建时间：2014年9月10日上午9:01:43
 *
 */
@Controller
@RequestMapping(value="/baseDate")
public class BaseDateController extends BaseController {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(BaseDateController.class);
	
	/**
	 * 行政区划_省市_service
	 */
	@Autowired
	ProvinceServiceImpl provinceServiceImpl;
	
	/**
	 * 行政区划_县市_service
	 */
	@Autowired
	CityServiceImpl cityServiceImpl;
	
	/**
	 * 
	 * @方法功能说明：省份查询
	 * @修改者名字：zzb
	 * @修改时间：2014年9月10日上午9:04:58
	 * @修改内容：
	 * @参数：@param provinceQo
	 * @参数：@return
	 * @return:String
	 * @throws
	 */
	@ResponseBody
	@RequestMapping(value="/province")
	public String province(@ModelAttribute ProvinceQo provinceQo) {
		
		HgLogger.getInstance().info("zzb", "进入省份查询方法:provinceQo【" + provinceQo + "】");

		List<Province> provinceList = provinceServiceImpl.queryList(provinceQo);
		
		return JSON.toJSONString(provinceList);
		
	}
	
	
	/**
	 * 
	 * @方法功能说明：县市查询
	 * @修改者名字：zzb
	 * @修改时间：2014年9月10日上午9:14:18
	 * @修改内容：
	 * @参数：@param cityQo
	 * @参数：@return
	 * @return:String
	 * @throws
	 */
	@ResponseBody
	@RequestMapping(value="/city")
	public String city(@ModelAttribute CityQo cityQo) {
		
		HgLogger.getInstance().info("zzb", "进入县市查询方法:cityQo【" + cityQo + "】");

		List<City> cityList = cityServiceImpl.queryList(cityQo);
		
		return JSON.toJSONString(cityList);
		
	}
	
	
	
	
}
