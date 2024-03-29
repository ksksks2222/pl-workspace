package hg.dzpw.api.component.init;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

import hg.common.util.PathUtil;
import hg.common.util.file.FdfsFileUtil;
import hg.log.util.HgLogger;
//import hg.service.image.spi.inter.FastdfsService;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @类功能说明：dfs配置初始化
 * @类修改者：
 * @修改日期：2014-12-4上午11:34:36
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @作者：zhurz
 * @创建时间：2014-12-4上午11:34:36
 */
@Component
public class FastdfsConfigInit implements InitializingBean{
	
//	@Autowired
//	private FastdfsService fastdfsService;
	@Autowired
	private HgLogger hgLogger;
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		loadRemoteDfsconfig();
	}
	
	
	public void loadRemoteDfsconfig() throws IOException, URISyntaxException {
//		hgLogger.info("zhurz", "开始加载DFS配置");
//		String conf = fastdfsService.getFastdfsConfig();
//		String path = PathUtil.getClassPath() + "fastdfs_client.conf";
//		
//		//将DFS配置输出到配置文件中
//		File file = new File(path);
//		FileOutputStream fos = new FileOutputStream(file);
//		try {
//			IOUtils.write(conf == null ? "" : conf, fos, "UTF-8");
//		} finally {
//			fos.close();
//		}
//		// 重新加载FASTDFS配置
//		FdfsFileUtil.init();
//		hgLogger.info("zhurz", "DFS配置加载完毕");
	}
	
	
}
