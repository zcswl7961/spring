package com.zcs.aop.usedemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 假设是A增强器 。@Before
 *
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
		System.out.println("A增强器 beforeTest");
	}

//	@After("test()")
//	public void afterTest() {
//		System.out.println("A增强器 afterTest");
//	}
//
//	@Around("test() || subTest()")
//	public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint) {
//		System.out.println("A增强器 =========beforeAroundTest==========");
//		Object o = null;
//		try {
//			o = proceedingJoinPoint.proceed();
//		} catch (Throwable throwable) {
//			throwable.printStackTrace();
//		}
//		System.out.println("A增强器 =========afterAroundTest==========");
//		return o;
//	}
//
//	/**
//	 * AfterReturning 增强处理可以访问到方法的返回值，但它不能改变目标方法的返回值
//	 * @param rvt
//	 * @return
//	 */
//	@AfterReturning(returning="rvt", pointcut="execution(* com.zcs.aop.usedemo.TestBean.afterReturn(..))")
//	public String afterRet(String rvt) {
//		return rvt+" wl";
//	}
}
