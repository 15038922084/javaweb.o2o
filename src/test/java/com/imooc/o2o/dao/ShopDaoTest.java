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
	@Ignore // ��ע�����˷�����������
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
		shop.setShopDesc("����");
		shop.setShopAddr("�찲��");
		shop.setPhone("110");
		shop.setShopImg("test");
		shop.setPriority(2);
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("�����");

		// ��shop���ֵ��ӵ����ݿ�tb_shop����
		int effectedNum = shopDao.insertShop(shop);
		// ��ӵ�������1�ԶԱ�
		assertEquals(1, effectedNum);
	}

	@Test
	public void testUpdateShop() {

		Shop shop = new Shop();
		Area area = new Area();
		PersonInfo owner = new PersonInfo();
		shop.setLastEditTime(new Date());
		shop.setShopDesc("�yԇ����");
		shop.setShopAddr("�yԇ��ַ");

		// ��shop���ֵ��ӵ����ݿ�tb_shop����
		int effectedNum = shopDao.updateShop(shop);
		// ��ӵ�������1�ԶԱ�
		assertEquals(1, effectedNum);
	}
}
