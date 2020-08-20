package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;

public class ShopDaoTest extends BaseTest {
	@Autowired
	private ShopDao shopDao;

	@Test
	@Ignore // 此注解代表此方法不會執行
	public void testInsertShop() {
		Shop shop = new Shop();
		Area area = new Area();
		PersonInfo owner = new PersonInfo();
		ShopCategory shopCategory = new ShopCategory();

		owner.setUserId(1L);
		area.setAreaId(1);
		shopCategory.setShopCaregoryId(1L);
		shop.setShopId(2L);
		shop.setShopName("yuan");
		shop.setShopDesc("北京");
		shop.setShopAddr("天安门");
		shop.setPhone("110");
		shop.setShopImg("test");
		shop.setPriority(2);
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");

		// 把shop类的值添加到数据库tb_shop表中
		int effectedNum = shopDao.insertShop(shop);
		// 添加的行数和1对对比
		assertEquals(1, effectedNum);
	}

	@Test
	public void testUpdateShop() {

		Shop shop = new Shop();
		Area area = new Area();
		PersonInfo owner = new PersonInfo();
		shop.setLastEditTime(new Date());
		shop.setShopDesc("測試描述");
		shop.setShopAddr("測試地址");

		// 把shop类的值添加到数据库tb_shop表中
		int effectedNum = shopDao.updateShop(shop);
		// 添加的行数和1对对比
		assertEquals(1, effectedNum);
	}
}
