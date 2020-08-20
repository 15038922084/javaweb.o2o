package com.imooc.o2o.entity;

import java.util.Date;

/*
 * 店铺类别板块
 */
public class ShopCategory {
	private Long shopCaregoryId;
	private String shopCategoryName;
	private String shopCategoryDesc;
	private String shopCategoryImg;
	private Integer priority; // 权重，优先级
	private Date createTime;
	private Date lastEditTime; // 最新修改时间
	private ShopCategory parent; // 上级id （也是一个实体类）

	public Long getShopCaregoryId() {
		return shopCaregoryId;
	}

	public void setShopCaregoryId(Long shopCaregoryId) {
		this.shopCaregoryId = shopCaregoryId;
	}

	public String getShopCategoryName() {
		return shopCategoryName;
	}

	public void setShopCategoryName(String shopCategoryName) {
		this.shopCategoryName = shopCategoryName;
	}

	public String getShopCategoryDesc() {
		return shopCategoryDesc;
	}

	public void setShopCategoryDesc(String shopCategoryDesc) {
		this.shopCategoryDesc = shopCategoryDesc;
	}

	public String getShopCategoryImg() {
		return shopCategoryImg;
	}

	public void setShopCategoryImg(String shopCategoryImg) {
		this.shopCategoryImg = shopCategoryImg;
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

	public ShopCategory getParent() {
		return parent;
	}

	public void setParent(ShopCategory parent) {
		this.parent = parent;
	}

}
