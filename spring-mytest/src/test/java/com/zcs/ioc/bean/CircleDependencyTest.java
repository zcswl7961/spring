package com.zcs.ioc.bean;

import com.zcs.ioc.circledependency.D;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @description:
 * @author: guoping wang
 * @date: 2018/9/18 13:48
 * @project: spring
 */
public class CircleDependencyTest {

	@Test
	public void testCircleDependency() {
		ClassPathResource resource = new ClassPathResource("circleDependency-Test.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		((XmlBeanFactory) beanFactory).setAllowCircularReferences(false);
//		A a = (A) beanFactory.getBean("a");
		D d = (D) beanFactory.getBean("d");
	}
}
