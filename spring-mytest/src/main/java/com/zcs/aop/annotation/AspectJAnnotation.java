package com.zcs.aop.annotation;

import java.lang.annotation.*;

/**
 * @author: zhoucg
 * @date: 2019-05-28
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AspectJAnnotation {
}
