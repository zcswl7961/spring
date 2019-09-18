package com.zcs.aop.usedemo;

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
		System.out.println("test");
//		ITest proxy = (ITest) AopContext.currentProxy();
//		proxy.subTest();
	}

	@Override
	public void subTest() {
		System.out.println("subTest");
	}

	@Override
	public String afterReturn(String a) {
		return a+"zcg";
	}


}
