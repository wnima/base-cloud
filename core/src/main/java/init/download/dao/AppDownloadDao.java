package init.download.dao;

import org.springframework.stereotype.Repository;

import init.download.model.dto.AppDTO;

@Repository
public interface AppDownloadDao {
	/**
	 * 读取应用信息
	 */
	public AppDTO getAppInfoByDownloadCode(String downloadCode);
	
}
