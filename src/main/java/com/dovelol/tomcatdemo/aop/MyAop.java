package com.dovelol.tomcatdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author Dovelol
 * @date 2018/10/9 14:49
 */

@Aspect
@Component
public class MyAop {

    private static final Logger logger = LoggerFactory.getLogger(MyAop.class);

    @Pointcut("@annotation(com.dovelol.tomcatdemo.annotation.MyAnnotation)")
    public void myInfoAnnotation() {

    }

    @Before("execution(* com.dovelol.tomcatdemo.service.MyService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        logger.info("before " + method.getName());
    }

    @After("execution(* com.dovelol.tomcatdemo.service.MyService.*(..))")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        logger.info("after " + method.getName());
    }

}
