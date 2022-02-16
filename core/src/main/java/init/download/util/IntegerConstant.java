package init.download.util;

public enum IntegerConstant {
	TWO_HUNDRED(200),
	FIVE_HUNDRED(500),
	;
	private Integer val;
	private IntegerConstant(Integer val) {
		this.val = val;
	}
	public Integer getVal() {
		return val;
	}
	public void setVal(Integer val) {
		this.val = val;
	}
}
