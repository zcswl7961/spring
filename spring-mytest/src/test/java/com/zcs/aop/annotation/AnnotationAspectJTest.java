package com.zcs.aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhoucg
 * @date: 2019-05-28
 */
public class AnnotationAspectJTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		CglibAspectJ cglibAspectJ = (CglibAspectJ) applicationContext.getBean("cglibAspectJ");
		cglibAspectJ.test();
	}
}
