package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * 配置spring和junit整合，junit启动时加载springIoc容器
 *
 */
//告诉是pring使用SpringJUnit4ClassRunner这个class类跑的
@RunWith(SpringJUnit4ClassRunner.class)
//告诉JUnit，spring配置文件的位置
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class BaseTest {

}
