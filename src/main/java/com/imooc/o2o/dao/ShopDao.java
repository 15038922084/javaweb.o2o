package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

public interface ShopDao {
	/**
	 * ��������
	 * 
	 * @param shop
	 * @return
	 */
	int insertShop(Shop shop);

	/**
	 * ���µ���
	 * 
	 * @param shop
	 * @return
	 */
	int updateShop(Shop shop);
}
