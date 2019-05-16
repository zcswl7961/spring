package guo.ping.ioc.aware;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: guoping wang
 * @date: 2018/9/26 13:34
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
