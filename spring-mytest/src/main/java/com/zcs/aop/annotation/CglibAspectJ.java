package com.zcs.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @author: zhoucg
 * @date: 2019-05-28
 */
@Component
public class CglibAspectJ {

	@AspectJAnnotation
	public void test() {
		System.out.println("这个一个基于注解的面向切面的类");
	}
}
