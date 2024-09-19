package com.phucdx.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.phucdx.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.phucdx.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint point) {
        LOGGER.info("Method called " + point.getSignature().getName());
    }

    @After("execution(* com.phucdx.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.phucdx.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint point) {
        LOGGER.info("Method executed " + point.getSignature().getName());
    }

    @AfterThrowing("execution(* com.phucdx.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.phucdx.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCrash(JoinPoint point) {
        LOGGER.info("Method has some issues " + point.getSignature().getName());
    }

    @AfterReturning("execution(* com.phucdx.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.phucdx.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccess(JoinPoint point) {
        LOGGER.info("Method executed successfully " + point.getSignature().getName());
    }
}
