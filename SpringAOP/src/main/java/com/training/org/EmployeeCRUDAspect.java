package com.training.org;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeCRUDAspect {
	
	@Pointcut("execution(* EmployeeManager.getEmployeeDetails())")
	public void k(){
		System.out.println("hi hello namasthe");
	}
	
	
	@Before("k()")
	public void logBeforeV1(JoinPoint jointPoint) {
		System.out.println("Method before actual execution");
	}

	
	
	
      
  }
