package init.download.util;

public enum RespStatusConstant {
	SUCCESS(200),
	FAIL(500),
	NOT_FOUND(404),
	;
	private Integer val;
	private RespStatusConstant(Integer val) {
		this.val = val;
	}
	public Integer getVal() {
		return val;
	}
	public void setVal(Integer val) {
		this.val = val;
	}
}
