package com.imooc.o2o.entity;

import java.util.Date;
import java.util.List;

/**
 * 
 * 商品
 * 
 * @author love天问
 *
 */
public class Product {
	private Long productId;
	private String productName;
	private String productDesc;
	// 简略图
	private String imgAddr;
	private String normalPrice;
	private String promotionPrice;
	private String priority;
	private Date createTime;
	private Date lastEditTime;
	// -1.不可用 0.下架 1.在前端展示系统展示
	private Integer enableStatus;

	private List<ProductImg> productImgList; // 商品详情图片列表(与商品是一对多的关系)
	private ProductCategory productCategory; // 商品类别
	private Shop shop; // 商品是由哪个商铺发布的

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getImgAddr() {
		return imgAddr;
	}

	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}

	public String getNormalPrice() {
		return normalPrice;
	}

	public void setNormalPrice(String normalPrice) {
		this.normalPrice = normalPrice;
	}

	public String getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
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

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public List<ProductImg> getProductImgList() {
		return productImgList;
	}

	public void setProductImgList(List<ProductImg> productImgList) {
		this.productImgList = productImgList;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

}
