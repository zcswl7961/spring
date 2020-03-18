package com.zcs.aop.usedemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 测试动态使用AOP
 * @author: guoping wang
 * @date: 2018/10/6 12:03
 * @project: spring
 */
public class AopDemoTest {


	/**
	 * 先执行了环绕通知的前后处理方法，然后在处理@Before，@After的方法
	 */
	@Test
	public void testAopDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopDemo-Test.xml");
		ITest testBean = (ITest) context.getBean("test");

		testBean.test();
	}
}
