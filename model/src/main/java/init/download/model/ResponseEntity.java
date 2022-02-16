package init.download.model;

public class ResponseEntity<T> {
	private Integer code;
	private String msg;
	private T data;
	
	public ResponseEntity(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseEntity [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
