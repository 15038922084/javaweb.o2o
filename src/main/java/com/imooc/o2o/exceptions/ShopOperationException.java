package com.imooc.o2o.exceptions;

/**
 * 业务异常类（对RuntimeException简单的做了一个封装）
 * 
 * @author love天问
 *
 */
public class ShopOperationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8420121393568805571L;

	// msg接收错误信息的参数
	public ShopOperationException(String msg) {
		super(msg);
	}
}
