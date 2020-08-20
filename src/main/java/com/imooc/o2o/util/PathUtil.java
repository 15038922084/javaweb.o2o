package com.imooc.o2o.util;

/**
 * �ṩ���๤��ϵͳ��Ĭ��·��
 * 
 * @author love����
 *
 */
public class PathUtil {

	private static String seperator = System.getProperty("file.separator");

	public static String getImgBasePath() {

		String os = System.getProperty("os.name");
		String basePath = "";
		// �жϸ�Ŀ¼�Ƿ���winϵͳ�£��ǵĻ��洢��������
		if (os.toLowerCase().startsWith("win")) {
			basePath = "F:/java/imooc/win_image/";
		} else {
			basePath = "F:/java/imooc/linux_image";
		}

		basePath.replace("/", seperator);
		return basePath;

	}

	/**
	 * ����ЩͼƬ�ֱ�浽���Ե��̵�·����
	 */
	public static String getShopImagePath(long shopId) {
		String imagePath = "/upload/item/shop/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}
}
