package com.zcs.aop.usedemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @description:
 * @project: spring
 */
@Aspect
public class AspectJTest {

	@Pointcut("execution(* com.zcs.aop.usedemo.TestBean.test(..))")
	public void test() {

	}

	@Pointcut("execution(* com.zcs.aop.usedemo.TestBean.subTest(..))")
	public void subTest() {

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
		System.out.println("=========beforeSubTest==========");
		Object o = null;
		try {
			o = proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("=========afterSubTest==========");
		return o;
	}
	@AfterReturning(returning="rvt", pointcut="execution(* com.zcs.aop.usedemo.TestBean.afterReturn(..))")
	public String afterRet(String rvt) {
		return rvt+" wl";
	}
}
