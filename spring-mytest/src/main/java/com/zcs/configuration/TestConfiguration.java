package com.zcs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: zhoucg
 * @date: 2019-05-09
 */
@Configuration
@ComponentScan(basePackages = "com.zcs.configuration")
@Import(AutoConfigurationSelector.class)
public class TestConfiguration {

	@Bean
	public TestBean testBean(){
		return new TestBean();
	}


}
