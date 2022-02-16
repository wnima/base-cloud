package init.download.model.dto;

public class AppDTO extends BaseDTO {
	private static final long serialVersionUID = -5630735420269429637L;
	private String packageName;
	private String showName;
	private String iconUri;
	private String downloadCode;
	private String fileCode;
	private String version;
	
	
	public String getPackageName() {
		return packageName;
	}


	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}


	public String getShowName() {
		return showName;
	}


	public void setShowName(String showName) {
		this.showName = showName;
	}


	public String getIconUri() {
		return iconUri;
	}


	public void setIconUri(String iconUri) {
		this.iconUri = iconUri;
	}


	public String getDownloadCode() {
		return downloadCode;
	}


	public void setDownloadCode(String downloadCode) {
		this.downloadCode = downloadCode;
	}


	public String getFileCode() {
		return fileCode;
	}


	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "AppDTO [packageName=" + packageName + ", showName=" + showName + ", iconUri=" + iconUri
				+ ", downloadCode=" + downloadCode + ", fileCode=" + fileCode + ", version=" + version + "]";
	}
}
