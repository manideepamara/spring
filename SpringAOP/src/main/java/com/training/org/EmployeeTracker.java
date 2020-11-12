package com.training.org;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeTracker {
	
	
	
	@Pointcut("execution(* Employee.*(..))")
	public void k() {}	
	
	
	@Before("k()")
	public void beforeLog(JoinPoint jp) {
		System.out.println("before advice");
	}
	
	
	
	
}