package com.zcs.ioc.bean;

import com.zcs.ioc.loadbean.Car;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * spring XmlBeanFactory使用,spring容器的基本实现
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		ClassPathResource resource = new ClassPathResource("beanFactoryTest.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		/**
		 *
		 */

		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		Car car = (Car) beanFactory.getBean("testCarFactoryBean");
		System.out.println(myTestBean.getTestStr());
		System.out.println(car);
	}

	/**
	 * 测试FactoryBean
	 */
	@Test
	public void testFactoryBean() {
		ClassPathResource resource = new ClassPathResource("beanFactoryTest.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		/**
		 * 获取对应的FactoryBean中的实体类
		 */
		Car car = (Car) beanFactory.getBean("testCarFactoryBean");
		System.out.println(car);
		/**
		 * 获取FactoryBean本身
		 */
		FactoryBean factoryBean = (FactoryBean)beanFactory.getBean("&testCarFactoryBean");
		System.out.println(factoryBean);


	}
}
