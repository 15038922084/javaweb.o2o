package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 
 * ΢����֤
 */
public class WechatAuth {
	private Long wechatAythId; // ΢��id ������id��
	private String openId; // ΢���˺��빫�ںŰ󶨵�Ψһ��ʶ (Ψһ����)
	private Date createTime;
	private PersonInfo personInfo; // �����Լ�����û��˺���Ϣ�����������ڹ�����һ��ʵ���࣬�������������ñ���

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
