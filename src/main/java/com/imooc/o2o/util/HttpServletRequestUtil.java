package com.imooc.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 解析request请求参数的工具类
 * 
 * @author love天问
 *
 */
public class HttpServletRequestUtil {
	/*
	 * 从request中提取出一个key,根据key，取出相应的值，并转化成我们需要的值
	 */
	private static int getInt(HttpServletRequest request, String key) {
		try {
			// decode函数将String 类型转化成 Integer
			return Integer.decode(request.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}

	private static long getLong(HttpServletRequest request, String key) {
		try {
			// valueOf函数将String 类型转化成 Long
			return Long.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}

	private static Double getDouble(HttpServletRequest request, String key) {
		try {
			// valueOf函数将String 类型转化成 Double
			return Double.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1d;
		}
	}

	private static boolean getBoolean(HttpServletRequest request, String key) {
		try {
			// valueOf函数将String 类型转化成 boolean
			return Boolean.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return false;
		}
	}

	public static String getString(HttpServletRequest request, String key) {
		try {
			// 将key键对应的值转化成String类型
			String result = request.getParameter(key);
			if (result != null) {
				result = result.trim();
			}
			if ("".equals(result)) {
				result = null;
			}
			return result;

		} catch (Exception e) {
			return null;
		}
	}
}
