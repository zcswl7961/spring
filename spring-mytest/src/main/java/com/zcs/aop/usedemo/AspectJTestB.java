package com.zcs.aop.usedemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * B增强器 @Around 增强
 *
 * @author zhoucg
 * @date 2020-03-18 14:15
 */
@Aspect
public class AspectJTestB {

	@Pointcut("execution(* com.zcs.aop.usedemo.TestBean.test(..))")
	public void test() {

	}


	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("B增强器=========beforeAroundTest==========");
		Object o = null;
		try {
			o = proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("B增强器=========afterAroundTest==========");
		return o;
	}
}
