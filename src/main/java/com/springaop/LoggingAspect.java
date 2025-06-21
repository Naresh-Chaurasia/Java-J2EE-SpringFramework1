package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/*
Advice: The action taken by an aspect at a particular join point. In this code, the logAfter method is an @After advice—it runs after the matched method executes.

Join Point: A point during the execution of a program, such as a method call or exception handling. Here, each execution of any method in SimpleService is a join point.

Pointcut: An expression that matches join points. In this code, "execution(* com.springaop.SimpleService.*(..))" is the pointcut, matching all methods in SimpleService. 
*/

@Aspect // Marks this class as an Aspect (cross-cutting concern)
@Component // Registers this class as a Spring bean
public class LoggingAspect {

    // @After is an advice: code to run after the matched method executes
    // The string is a pointcut: matches all methods in SimpleService
    @After("execution(* com.springaop.SimpleService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        // JoinPoint provides reflective access to the method being called
        System.out.println("LoggingAspect: Method " + joinPoint.getSignature().getName() + " was called.");
    }
}