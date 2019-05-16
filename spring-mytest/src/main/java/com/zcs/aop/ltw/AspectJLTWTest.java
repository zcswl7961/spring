package com.zcs.aop.ltw;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @description:
 * @project: spring
 */
@Aspect
public class AspectJLTWTest {

	@Pointcut("execution(* com.zcs.aop.ltw.TestLTWBean.test(..))")
	public void test() {

	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("before1");
		Object o = null;
		try {
			o = proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}
}
