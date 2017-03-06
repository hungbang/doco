package com.vidolima.doco.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is applied to the entity class. Specifies that other annotations can also be found in super class.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DocumentIndexSubClass {
	/**
     * Specifies the name of the Index.
     * 
     * @return name.
     */
    String name() default "";
}