package com.zcs.springFactories;

import org.junit.Test;
import org.springframework.core.io.support.DummyFactory;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author: zhoucg
 * @date: 2019-07-28
 */
public class SpringFactoriesLoaderUtils {


	@Test
	public void load() {

		List<DummyFactory> factories = SpringFactoriesLoader
				.loadFactories(DummyFactory.class, SpringFactoriesLoaderUtils.class.getClassLoader());
		System.out.println(factories.size());
	}


}
