package com.zcs.aop.ltw;

/**
 * @description: Aop demo
 * @project: spring
 */
public class TestLTWBean {

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test() {
		System.out.println("test");
	}
}
