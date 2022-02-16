package init.download.util;

import init.download.model.ResponseEntity;

public class ResponseEntityUtil {
	public static <T> ResponseEntity<T> success(T data){
		return new ResponseEntity<>(RespStatusConstant.SUCCESS.getVal(),I18NUtls.getMessage(RespStatusConstant.SUCCESS.toString()),data);
	}

	public static <T> ResponseEntity<T> fail(RespStatusConstant status){
		return new ResponseEntity<>(status.getVal(),I18NUtls.getMessage(status.toString()),null);
	}
}
