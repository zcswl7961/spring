package com.zcs.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: zhoucg
 * @date: 2019-05-28
 */
@Configuration
@ComponentScan("com.zcs.aop.annotation")
@EnableAspectJAutoProxy
public class AnnotationConfig {
}
