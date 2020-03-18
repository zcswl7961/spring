package com.zcs.aop.declareParents;

import org.springframework.stereotype.Component;

/**
 * @author zhoucg
 * @date 2020-03-16 16:12
 */
@Component
public class FemaleAnimal implements Animal{
	@Override
	public void eat() {
		System.out.println("我是雌性，我比雄性更喜欢吃零食");
	}
}
