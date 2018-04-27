package pay.record.admin.listener;

import hg.common.component.ConfigurerListener;
import hg.common.util.file.FdfsFileUtil;

import java.net.URL;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;

public class AdminConfigurerListener implements ConfigurerListener {

	@Override
	public void configLoadOver() {
		
		// 重新加载LOG4J配置
		URL url = Loader.getResource("log4j.properties");
		if (url != null) {
			PropertyConfigurator.configure(url);
		}
		
		// 重新加载FASTDFS配置
		FdfsFileUtil.init();
	}

}
