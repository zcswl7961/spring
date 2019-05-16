package com.zcs.ioc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @description:
 * @project: spring
 */
public class TestAware implements BeanFactoryAware {

	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public void testAware() {
		Hello hello = (Hello) this.beanFactory.getBean("hello");
		hello.say();
	}
}
