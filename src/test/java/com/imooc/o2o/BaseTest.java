package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * ����spring��junit���ϣ�junit����ʱ����springIoc����
 *
 */
//������pringʹ��SpringJUnit4ClassRunner���class���ܵ�
@RunWith(SpringJUnit4ClassRunner.class)
//����JUnit��spring�����ļ���λ��
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class BaseTest {

}
