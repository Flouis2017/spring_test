package com.flouis.spring.AOP.bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(** com.flouis.spring.AOP..*.perform(..))")
	public void pointcut(){}
	
	@Before(value="pointcut()")
	public void takeSeats(){
		System.out.println("Take seats.");
	}
	
	@Before("pointcut()")
	public void silenceCellPhone(){
		System.out.println("Silence cell phone.");
	}
	
	@After("pointcut()")
	public void applause(){
		System.out.println("Clap! Clap! Clap!");
	}
	
	@AfterReturning("pointcut()")
	public void leave(){
		System.out.println("Leave the Performance.");
	}
	
	@AfterThrowing("pointcut()")
	public void refundTicket(){
		System.out.println("Demand Refund!");
	}
	
}
