package com.imooc.o2o.entity;

import java.util.Date;

/**
 * ����
 * 
 * @author love����
 *
 */
public class Area {
	/*
	 * ����ͳһʹ���������ͣ���Ϊ�������ͻ���Ĭ��ֵ��������ɲ���Ҫ���鷳
	 */
	// ����id
	public Integer areaId;
	// ����
	public String areaName;
	// Ȩ�أ����ȼ���
	public Integer priority;
	// ����ʱ��
	public Date createTime;
	// ����ʱ��
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
