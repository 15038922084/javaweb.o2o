package com.imooc.o2o.exceptions;

/**
 * ҵ���쳣�ࣨ��RuntimeException�򵥵�����һ����װ��
 * 
 * @author love����
 *
 */
public class ShopOperationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8420121393568805571L;

	// msg���մ�����Ϣ�Ĳ���
	public ShopOperationException(String msg) {
		super(msg);
	}
}
