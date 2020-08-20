package com.imooc.o2o.util;

/**
 * 提供两类工程系统的默认路径
 * 
 * @author love天问
 *
 */
public class PathUtil {

	private static String seperator = System.getProperty("file.separator");

	public static String getImgBasePath() {

		String os = System.getProperty("os.name");
		String basePath = "";
		// 判断根目录是否是win系统下，是的话存储到。。。
		if (os.toLowerCase().startsWith("win")) {
			basePath = "F:/java/imooc/win_image/";
		} else {
			basePath = "F:/java/imooc/linux_image";
		}

		basePath.replace("/", seperator);
		return basePath;

	}

	/**
	 * 将这些图片分别存到各自店铺的路径下
	 */
	public static String getShopImagePath(long shopId) {
		String imagePath = "/upload/item/shop/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}
}
