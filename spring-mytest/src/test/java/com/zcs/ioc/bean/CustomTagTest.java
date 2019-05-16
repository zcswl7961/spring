package com.zcs.ioc.bean;

import com.zcs.ioc.customtag.Order;
import com.zcs.ioc.customtag.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: guoping wang
 * @date: 2018/9/2 14:50
 * @project: spring
 */
public class CustomTagTest {

	@Test
	public void testCustomTag() {
//		XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("customTag-Test.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("${config}");
		User user = (User) context.getBean("testUserBean");
		Order order = (Order) context.getBean("testOrderBean");
		System.out.println(user);
		System.out.println(order);
	}
}
