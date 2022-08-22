package com.example.learnaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAop {

    @Pointcut("execution(* com.example.learnaop.service.impl..*.*(..))")
    public void executeService(){

    }

    @Before("executeService())")
    public void doBeforeAdvice(JoinPoint joinPoint){
        System.out.println("me the before advice");
        Object[] obj = joinPoint.getArgs();
        System.out.println(obj);

        joinPoint.getThis();

        joinPoint.getTarget();

        Signature signature = joinPoint.getSignature();

        System.out.println(signature.getName());

        System.out.println(signature.getDeclaringTypeName());

        System.out.println(signature.getDeclaringType());
    }
}
