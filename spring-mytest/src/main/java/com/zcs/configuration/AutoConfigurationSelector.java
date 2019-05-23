package com.zcs.configuration;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: zhoucg
 * @date: 2019-05-23
 */
public class AutoConfigurationSelector implements DeferredImportSelector{
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{Selector.class.getName()};
	}
}
