package com.zcs.ioc.bean;

import com.zcs.ioc.aware.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhoucg on 2019-04-25.
 * ApplicationContex测试
 */
public class ApplicationContextTest {


	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) applicationContext.getBean("hello");
		hello.say();

	}




}
