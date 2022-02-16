package init.download.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import init.download.model.vo.AppInfoVO;
import init.download.service.AppDownloadService;
import init.download.model.ResponseEntity;

@RestController
public class AppDownloadController {
	
	@Autowired
	AppDownloadService appDownloadService;
	
	@GetMapping("/app/{code}/info")
	public ResponseEntity<AppInfoVO> getAppinfoByCode(@PathVariable("code") String code){
		return appDownloadService.getAppInfoByDownloadInfo(code);
	}
}
