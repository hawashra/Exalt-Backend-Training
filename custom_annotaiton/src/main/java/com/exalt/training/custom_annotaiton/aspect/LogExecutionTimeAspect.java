package com.exalt.training.custom_annotaiton.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * this class is an Aspect that has a method that logs the execution time of the methods
 * that are annotated with @LogExecutionTime which is a user defined annotation.
 * */

@Aspect
@Component
public class LogExecutionTimeAspect {

    // Logger is used to log the execution time of the methods
    private static final Logger logger = LoggerFactory.getLogger(LogExecutionTimeAspect.class);

    /**
     * this method is an around advice.
     * @param joinPoint is the point where the advice will be applied.
     */

    @Around("@annotation(com.exalt.training.custom_annotaiton.annotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();  // Continue with the method execution

        long executionTime = System.currentTimeMillis() - start;

        logger.info(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}
