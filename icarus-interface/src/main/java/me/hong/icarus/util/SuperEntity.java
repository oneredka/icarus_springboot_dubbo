package me.hong.icarus.util;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : YiHong
 * @Description: 用于实体类继承，companyId属性
 * @Date: Created in 17:30  2018/8/14.
 * @Modified By:
 */
public class SuperEntity implements Serializable {
	private Date createTime;
	private Date updateTime;
	private Integer isDelete;
	private Long companyId;

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

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
}
