package com.zcs.configuration;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author: zhoucg
 * @date: 2019-05-09
 */
@Component
@Import(AutoConfigurationSelector.class)
public class TestComponent {

	public void testComponent() {
		System.out.println("使用ComponentScan进行注入的bean，该bean使用@Component进行注入");
	}
}
