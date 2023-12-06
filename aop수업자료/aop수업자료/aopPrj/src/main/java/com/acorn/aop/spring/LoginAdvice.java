package com.acorn.aop.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAdvice {
 // @Around("execution(* com.acorn.aop.spring.*.*( .. ))")  
 @Around("execution(* com.acorn.aop.spring.*.*( int, int))")
 public Object method( ProceedingJoinPoint pjp ) throws Throwable {		 
	 System.out.println("before ");
	  Object  result  = pjp.proceed();	  
	  System.out.println( result);
	  
	 System.out.println(" after");	  
	 return result;
 }
	  
}

