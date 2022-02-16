package init.download.model.vo;

import java.util.Date;

public class AppInfoVO {
	private String packageName;
	private String showName;
	private String iconUrl;
	private String downloadCode;
	private String version;
	private Date updateTime;
	
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
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getDownloadCode() {
		return downloadCode;
	}
	public void setDownloadCode(String downloadCode) {
		this.downloadCode = downloadCode;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "AppInfoVO [packageName=" + packageName + ", showName=" + showName + ", iconUrl=" + iconUrl
				+ ", downloadCode=" + downloadCode + ", version=" + version + ", updateTime=" + updateTime + "]";
	}
}
