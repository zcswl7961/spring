package com.zcs.ioc.aware;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @project: spring
 */
public class Hello {

	private Test test;

	@Autowired
	public Hello(Test test) {
		this.test = test;
	}

	public void say() {
		test.print();
		System.out.println("hello");
	}
}
