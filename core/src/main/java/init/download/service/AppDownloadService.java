package init.download.service;

import init.download.model.vo.AppInfoVO;
import init.download.model.ResponseEntity;

public interface AppDownloadService {
	/**
	 * 读取应用信息
	 */
	ResponseEntity<AppInfoVO> getAppInfoByDownloadInfo(String downloadCode);
}
