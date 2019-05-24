package com.zcs.configuration;

import org.springframework.context.annotation.*;

/**
 * @author: zhoucg
 * @date: 2019-05-09
 */
@Configuration
@ComponentScan(basePackages = "com.zcs.configuration")
@ImportResource
//@Import(AutoConfigurationSelector.class)
//@Import(NormalImportClass.class) @Import 普通类
public class TestConfiguration {

	@Bean
	public TestBean testBean(){
		return new TestBean();
	}


}
