package com.zcs.ioc.bean;


import com.zcs.ioc.selfbeanfactorypostprocessor.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 测试自定义BeanFactoryPostProcessor
 * @author: guoping wang
 * @date: 2018/10/4 21:25
 * @project: spring
 */
public class MyBeanFactoryPostProcessorTest {

	@Test
	public void testMyBeanFactoryPostProcessor() {
//		ConfigurableListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("selfBeanFactoryPostProcessor-Test.xml"));
//		BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) bf.getBean("myBeanFactoryPostProcessor");
		ApplicationContext bf = new ClassPathXmlApplicationContext("selfBeanFactoryPostProcessor-Test.xml");
//		bfpp.postProcessBeanFactory(bf);
		User user = (User) bf.getBean("user");
		System.out.println(user);
	}
}
