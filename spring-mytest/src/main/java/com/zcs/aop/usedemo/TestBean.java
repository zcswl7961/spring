package com.zcs.aop.usedemo;

import org.springframework.aop.framework.AopContext;
import org.springframework.aop.support.AopUtils;

/**
 * @description: Aop demo
 * @project: spring
 */
public class TestBean implements ITest{

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	@Override
	public void test() {
		System.out.println("TestBean内部自己执行====test");
//		this.subTest();
//		System.out.println(AopContext.currentProxy()  == this);
//		boolean aopProxy = AopUtils.isAopProxy(this);
//		boolean aopProxy1 = AopUtils.isAopProxy(AopContext.currentProxy());
//		System.out.println(this);
		//(ITest)AopContext.currentProxy().subTest();
	}

	@Override
	public void subTest() {
		System.out.println("内部执行=======subTest");
	}

	@Override
	public String afterReturn(String a) {
		return a+"zcg";
	}


	@Override
	public String toString() {
		return "TestBean{" +
				"testStr='" + testStr + '\'' +
				'}';
	}
}
