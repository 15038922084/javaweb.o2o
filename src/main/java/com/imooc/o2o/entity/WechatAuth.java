package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 
 * 微信认证
 */
public class WechatAuth {
	private Long wechatAythId; // 微信id （主键id）
	private String openId; // 微信账号与公众号绑定的唯一标识 (唯一索引)
	private Date createTime;
	private PersonInfo personInfo; // （外键约束）用户账号信息，此属性用于关联另一个实体类，所以数据类型用本身

	public Long getWechatAythId() {
		return wechatAythId;
	}

	public void setWechatAythId(Long wechatAythId) {
		this.wechatAythId = wechatAythId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

}
