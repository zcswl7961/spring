package com.zcs.ioc.bean;

import com.zcs.ioc.validateproperties.MyClassPathXmlAppllicationContext;
import com.zcs.ioc.customtag.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * @description: 测试验证属性
 * @author: guoping wang
 * @date: 2018/10/3 13:15
 * @project: spring
 */
public class ValidatePropertiesTest {

	@Test
	public void testValidateProperties() {
		ApplicationContext context = new MyClassPathXmlAppllicationContext("customTag-Test.xml");
		User user = (User) context.getBean("testUserBean");
	}
}
