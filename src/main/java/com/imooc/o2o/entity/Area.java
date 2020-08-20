package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 区域
 * 
 * @author love天问
 *
 */
public class Area {
	/*
	 * 属性统一使用引用类型，因为基本类型会有默认值，以免造成不必要的麻烦
	 */
	// 区域id
	public Integer areaId;
	// 名称
	public String areaName;
	// 权重（优先级）
	public Integer priority;
	// 创建时间
	public Date createTime;
	// 更新时间
	public Date lastEditTime;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

}
