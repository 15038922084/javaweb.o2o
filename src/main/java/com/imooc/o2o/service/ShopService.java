package com.imooc.o2o.service;

import java.io.File;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

/**
 * 添加店铺的接口
 * 
 * @author love天问
 *
 */
public interface ShopService {
	ShopExecution addShop(Shop shop, File shopImg);
}
