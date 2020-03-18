package com.zcs.aop.declareParents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author zhoucg
 * @date 2020-03-16 16:12
 */
@Aspect
@Component
public class AspectConfig {


	@DeclareParents(value = "com.zcs.aop.declareParents.Person+", defaultImpl = FemaleAnimal.class)
	public Animal animal;
}
