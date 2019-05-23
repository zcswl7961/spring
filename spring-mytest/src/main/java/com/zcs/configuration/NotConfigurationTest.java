package com.zcs.configuration;

import org.springframework.stereotype.Component;

/**
 * @author: zhoucg
 * @date: 2019-05-23
 * AnnotationConfigurationApplicationContext解析非@Configuration注解
 */
@Component
public class NotConfigurationTest {

	public void test() {
		System.out.println("该类不含对应的@Configuration注解");
	}
}
