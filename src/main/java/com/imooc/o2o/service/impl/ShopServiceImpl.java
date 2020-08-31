package com.imooc.o2o.service.impl;

import java.io.InputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.exceptions.ShopOperationException;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.util.ImageUtil;
import com.imooc.o2o.util.PathUtil;

/**
 * 
 * @author love天问
 *
 */
public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopDao shopDao;

	@Override
	public ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName)
			throws ShopOperationException {
		// 空值判断
		if (shop == null) {
			return new ShopExecution(ShopStateEnum.NULL_SHOP);
		}
		try {
			// ��������Ϣ����ʼ ֵ
			shop.setEnableStatus(0);
			shop.setCreateTime(new Date());
			shop.setLastEditTime(new Date());
			int effectedNum = shopDao.insertShop(shop);
			// ��ӵ�����Ϣ
			if (effectedNum <= 0) {
				throw new ShopOperationException("��������ʧ��");
			} else {
				if (shopImg != null) {
					// �洢ͼƬ
					try {
						addShopImg(shop, shopImg);

					} catch (Exception e) {
						throw new ShopOperationException("addShopImg error:" + e.getMessage());
					}
					// ���µ��̵�ͼƬ��ַ
					effectedNum = shopDao.updateShop(shop);
					if (effectedNum <= 0) {
						throw new ShopOperationException("����ͼƬ��ַʧ��");
					}

				}
			}

		} catch (Exception e) {
			throw new ShopOperationException("add Shop:errot" + e.getMessage());
		}
		return null;
	}

	private void addShopImg(Shop shop, InputStream shopImgInputStream, String fileName) {
		// 获取shop图片目录的相对值路径
		String dest = PathUtil.getShopImagePath(shop.getShopId());
		String shopImgAddr = ImageUtil.generateThumbnail(shopImgInputStream, fileName, dest);
		shop.setShopImg(shopImgAddr);

	}

}
