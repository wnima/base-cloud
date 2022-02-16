package init.download.model.dto;

import java.io.Serializable;
import java.util.Date;

public class BaseDTO implements Serializable{
	private static final long serialVersionUID = -5935678166891503473L;
	private Integer id;
	private Date createTime;
	private Date updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "BaseDTO [id=" + id + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}
