package com.phucdx.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.phucdx.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint point) {
        LOGGER.info("Method call " + point.getSignature().getName());
    }
}
