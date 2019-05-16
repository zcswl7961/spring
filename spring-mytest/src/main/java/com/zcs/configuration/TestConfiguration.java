package com.zcs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhoucg
 * @date: 2019-05-09
 */
@Configuration
@ComponentScan(basePackages = "guo.ping.configuration")
public class TestConfiguration {

	@Bean
	public TestBean testBean(){
		return new TestBean();
	}


}
