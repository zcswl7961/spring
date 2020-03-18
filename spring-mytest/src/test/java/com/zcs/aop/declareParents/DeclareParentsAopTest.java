package com.zcs.aop.declareParents;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhoucg
 * @date 2020-03-16 16:14
 */
public class DeclareParentsAopTest {


	@Test
	public void test() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Person women = (Person) ctx.getBean("women");

//		women.likePerson();

		Animal animal = (Animal) women;
		animal.eat();
	}
}
