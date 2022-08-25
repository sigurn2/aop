package com.example.aop.aop.annotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAop {
    @Pointcut("@annotation(com.example.aop.aop.annotations.Admin)")
    public void pointCut() {

    }

    @Before(value = "pointCut()")
    public void resolve(JoinPoint jp) {
        Object[] objects = jp.getArgs();
        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }
}
