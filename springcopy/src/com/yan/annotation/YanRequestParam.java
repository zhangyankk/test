package com.yan.annotation;


import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(ElementType.PARAMETER)
@Documented
public @interface YanRequestParam {
	String value() default "";
}
