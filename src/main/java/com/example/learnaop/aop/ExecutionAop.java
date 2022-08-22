package com.example.learnaop.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionAop {

    @Pointcut("execution(* com.example.learnaop.service..*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("------@Before---------");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("---------@AfterReturning");
    }


}
