package com.zcs.aop.declareParents;

import org.springframework.stereotype.Component;

/**
 * @author zhoucg
 * @date 2020-03-16 16:11
 */
@Component
public class Women implements Person{
	@Override
	public void likePerson() {
		System.out.println("我是女生，我喜欢帅哥");
	}
}
