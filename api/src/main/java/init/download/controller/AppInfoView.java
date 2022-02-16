package init.download.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import init.download.model.ResponseEntity;
import init.download.model.vo.AppInfoVO;
import init.download.service.AppDownloadService;

@RestController
public class AppInfoView {

    @Autowired
    AppDownloadService appDownloadService;

	@GetMapping("appinfo")
	public ResponseEntity<AppInfoVO> appinfo(String code) {
		return appDownloadService.getAppInfoByDownloadInfo(code);
	}
}
