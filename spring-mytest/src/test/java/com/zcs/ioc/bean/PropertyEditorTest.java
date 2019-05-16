package com.zcs.ioc.bean;

import com.zcs.ioc.propertieseditor.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: guoping wang
 * @date: 2018/10/3 22:11
 * @project: spring
 */
public class PropertyEditorTest {

	@Test
	public void testPropertyEditorRegister() {
		ApplicationContext context = new ClassPathXmlApplicationContext("propertyEditorTest.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
	}
}
