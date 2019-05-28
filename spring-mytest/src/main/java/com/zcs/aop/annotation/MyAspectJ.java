package com.zcs.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author: zhoucg
 * @date: 2019-05-28
 */
@Component
@Aspect
public class MyAspectJ {

	//@Before("@annotation(com.zcs.aop.annotation.AspectJAnnotation)")
	@Before("@annotation(ap)")
	public void test(JoinPoint jp,AspectJAnnotation ap) {
		System.out.println("面向切面编程=="+jp);
	}
}
