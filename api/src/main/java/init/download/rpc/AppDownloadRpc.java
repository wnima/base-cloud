package init.download.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import init.download.model.ResponseEntity;
import init.download.model.vo.AppInfoVO;

@FeignClient("base-core")
public interface AppDownloadRpc {

	@GetMapping("/app/{code}/info")
	ResponseEntity<AppInfoVO> getAppInfoByDownloadCode(@PathVariable("code") String downloadCode);

}
