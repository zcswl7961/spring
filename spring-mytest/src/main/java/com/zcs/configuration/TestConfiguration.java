package com.zcs.configuration;

import org.springframework.context.annotation.*;

/**
 * @author: zhoucg
 * @date: 2019-05-09
 */
@Configuration
@ComponentScan(basePackages = "com.zcs.configuration")
@ImportResource(value = {"classpath:/spring/spring-context.xml"})
@Import(value = {AutoConfigurationSelector.class,NormalImportClass.class})
public class TestConfiguration {

	@Bean
	public TestBean testBean(){
		return new TestBean();
	}


}
