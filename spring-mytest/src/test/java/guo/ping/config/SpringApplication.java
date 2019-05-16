package guo.ping.config;

import guo.ping.configuration.TestBean;
import guo.ping.configuration.TestComponent;
import guo.ping.configuration.TestConfiguration;
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
	}
}
