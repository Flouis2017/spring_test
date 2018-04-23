package com.flouis.spring.AOP.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(** com.flouis.spring.AOP.bean.*.perform(..))")
	public void pointcut(){}
	
	@Before("pointcut()")
	public void silenceCellPhone(){
		System.out.println("Silence cell phone.");
	}
	
}
