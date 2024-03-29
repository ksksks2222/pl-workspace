package slfx.xl.app.service.spi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import slfx.xl.app.component.base.BaseXlSpiServiceImpl;
import slfx.xl.app.dao.LineOrderFileDAO;
import slfx.xl.app.service.local.LineOrderFileLocalService;
import slfx.xl.pojo.command.order.UploadLineOrderFileCommand;
import slfx.xl.pojo.dto.order.LineOrderFileDTO;
import slfx.xl.pojo.qo.LineOrderFileQO;
import slfx.xl.spi.inter.LineOrderFileService;

/**
 * 
 * @类功能说明：线路订单文件Service
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：luoyun
 * @创建时间：2014年12月24日上午9:03:51
 * @版本：V1.0
 *
 */
@Service("lineOrderFileService")
public class LineOrderFileServiceImpl extends BaseXlSpiServiceImpl<LineOrderFileDTO, LineOrderFileQO, LineOrderFileLocalService> 
											implements LineOrderFileService {


	@Autowired
	private LineOrderFileLocalService lineOrderFileLocalService;
	@Autowired
	private LineOrderFileDAO lineOrderFileDAO;
	
	@Override
	protected LineOrderFileLocalService getService() {
		return lineOrderFileLocalService;
	}
	
	@Override
	protected Class<LineOrderFileDTO> getDTOClass() {
		return LineOrderFileDTO.class;
	}

	@Override
	public Boolean uploadLineOrderFile(UploadLineOrderFileCommand command){
		return lineOrderFileLocalService.uploadLineOrderFile(command);
	}

	
	
	

}
