package com.imooc.o2o.service;

import java.io.File;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

/**
 * ��ӵ��̵Ľӿ�
 * 
 * @author love����
 *
 */
public interface ShopService {
	ShopExecution addShop(Shop shop, File shopImg);
}
