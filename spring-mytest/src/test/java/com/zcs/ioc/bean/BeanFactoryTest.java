package com.zcs.ioc.bean;

import com.zcs.ioc.loadbean.Car;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * spring XmlBeanFactory使用,spring容器的基本实现
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() throws IOException {
		ClassPathResource resource = new ClassPathResource("beanFactoryTest.xml");


		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
		/**
		 *
		 */
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for(String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}


//		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
//		Car car = (Car) beanFactory.getBean("testCarFactoryBean");
//		System.out.println(myTestBean.getTestStr());
//		System.out.println(car);

		UserService userService = (UserService)beanFactory.getBean("userService");
		userService.add("1212");
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
