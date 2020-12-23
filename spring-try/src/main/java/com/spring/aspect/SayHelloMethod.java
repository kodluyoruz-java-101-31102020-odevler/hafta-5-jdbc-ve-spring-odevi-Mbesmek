package com.spring.aspect;

import com.spring.aspectannotation.SayHello;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SayHelloMethod {

    @Around("@annotation(sayHello1)")
    public Object execute(ProceedingJoinPoint joinPoint, SayHello sayHello1) throws  Throwable{
        if (!sayHello1.active())
            joinPoint.proceed();
        String className=joinPoint.getSignature().getDeclaringType().getSimpleName();
        String methodName=joinPoint.getSignature().getName();
        Object result=joinPoint.proceed();
        System.out.println("Hello from"+"Class Name:"+  className +"Method Name:"+methodName );
        return result;
    }
}
