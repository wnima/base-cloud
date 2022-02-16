package init.download.service;

import init.download.model.ResponseEntity;
import init.download.model.vo.AppInfoVO;

public interface AppDownloadService {
	/**
	 * 读取应用信息
	 */
	ResponseEntity<AppInfoVO> getAppInfoByDownloadInfo(String downloadCode);
}
