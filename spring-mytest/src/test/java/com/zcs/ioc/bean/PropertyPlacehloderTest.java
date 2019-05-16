package com.zcs.ioc.bean;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: guoping wang
 * @date: 2018/10/4 19:48
 * @project: spring
 */
public class PropertyPlacehloderTest {


	/**
	 * PropertyPlaceholderConfigurer测试
	 * 首先是查看对应的继承体系
	 */
	@Test
	public void testValidateProperties() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("propertyPlaceholder-Test.xml");
		String[] beanDefinitions = context.getBeanDefinitionNames();
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context.getBeanFactory();
		for(String beanDefinition : beanDefinitions) {
			System.out.println("current beanDefintionName="+beanDefinition);
			BeanDefinition beanDefinition1 = beanFactory.getBeanDefinition(beanDefinition);
			System.out.println("current beanDefintion="+beanDefinition1);

		}
//		HelloMessage helloMessage = (HelloMessage) context.getBean("helloMessage");
//		System.out.println(helloMessage);
	}
}
