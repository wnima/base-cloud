package init.download.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import init.download.rpc.AppDownloadRpc;
import init.download.service.AppDownloadService;
import init.download.model.ResponseEntity;
import init.download.model.vo.AppInfoVO;

@Service("AppDownloadService")
public class AppDownloadServiceImpl implements AppDownloadService {

	@Autowired
	MessageSource messageSource;
	
	@Autowired
	AppDownloadRpc appDownloadRpc;
	
	@Override
	public ResponseEntity<AppInfoVO> getAppInfoByDownloadInfo(String downloadCode) {
		return appDownloadRpc.getAppInfoByDownloadCode(downloadCode);
	}

}
