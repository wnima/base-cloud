package init.download.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import init.download.dao.AppDownloadDao;
import init.download.model.dto.AppDTO;
import init.download.model.vo.AppInfoVO;
import init.download.service.AppDownloadService;
import init.download.util.RespStatusConstant;
import init.download.model.ResponseEntity;
import init.download.util.ResponseEntityUtil;

@Service("AppDownloadService")
public class AppDownloadServiceImpl implements AppDownloadService {

	@Autowired
	MessageSource messageSource;
	
	@Autowired
	AppDownloadDao appDownloadDao;
	
	@Override
	public ResponseEntity<AppInfoVO> getAppInfoByDownloadInfo(String downloadCode) {
		AppDTO appDTO = appDownloadDao.getAppInfoByDownloadCode(downloadCode);
		if(ObjectUtils.isEmpty(appDTO)) {
			return ResponseEntityUtil.fail(RespStatusConstant.NOT_FOUND);
		}
		AppInfoVO appinfo = new AppInfoVO();
		appinfo.setDownloadCode(appDTO.getDownloadCode());
		appinfo.setIconUrl(appDTO.getIconUri());
		appinfo.setPackageName(appDTO.getPackageName());
		appinfo.setShowName(appDTO.getShowName());
		appinfo.setUpdateTime(appDTO.getUpdateTime());
		appinfo.setVersion(appDTO.getVersion());
		return ResponseEntityUtil.success(appinfo);
	}

}
