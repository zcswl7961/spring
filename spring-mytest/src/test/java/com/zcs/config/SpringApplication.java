package com.zcs.config;

import com.zcs.configuration.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhoucg
 * @date: 2019-05-10
 */
public class SpringApplication {


	@Test
	public void test() {
		/**
		 * 将ConfigurationClassPostProcessor的BeanFactoryPostProcessor注入到容器中，进行解析
		 */
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);

		//使用@Bean标签加入的
		TestBean testBean = (TestBean) applicationContext.getBean("testBean");
		System.out.println("testBean=="+testBean);

		//使用@Component注解注入的bean
		TestComponent testComponent = (TestComponent)applicationContext.getBean("testComponent");
		testComponent.testComponent();

		//@Import Selector
		Selector selector = (Selector)applicationContext.getBean("com.zcs.configuration.Selector");
		selector.print();

		//@Import normal class
//		NormalImportClass normalImportClass = (NormalImportClass) applicationContext.getBean("com.zcs.configuration.NormalImportClass");
//		normalImportClass.print();
	}

	@Test
	public void componentTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(NotConfigurationTest.class);
		applicationContext.getBean("notConfigurationTest");
	}


}
