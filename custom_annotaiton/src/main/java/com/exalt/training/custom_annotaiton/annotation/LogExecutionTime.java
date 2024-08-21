package com.exalt.training.custom_annotaiton.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * this class defines the annotation @LogExecutionTime
 * this annotation is used to mark the methods that we want to log their execution time.
 * this annotation is available at runtime.
 */


@Target(ElementType.METHOD)  // Specifies that this annotation can be applied to methods
@Retention(RetentionPolicy.RUNTIME)  // Specifies that this annotation will be available at runtime
public @interface LogExecutionTime {

}
