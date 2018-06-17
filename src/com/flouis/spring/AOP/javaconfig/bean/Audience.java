package com.flouis.spring.AOP.javaconfig.bean;

//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Configuration
@Component
@EnableAspectJAutoProxy
@Aspect
public class Audience {
	@Pointcut("execution(** com.flouis.spring.AOP.javaconfig..*.perform(..))")
	public void pointcut(){}
//	@Before(value="pointcut()")
	public void takeSeats(){
		System.out.println("Take seats.");
	}
//	@Before("pointcut()")
	public void silenceCellPhone(){
		System.out.println("Silence cell phone.");
	}
//	@After("pointcut()")
	public void applause(){
		System.out.println("Clap! Clap! Clap!");
	}
//	@AfterReturning("pointcut()")
	public void leave(){
		System.out.println("Leave the Performance.");
	}
//	@AfterThrowing("pointcut()")
	public void refundTicket(){
		System.out.println("Demand Refund!");
	}
	
	
	@Around("pointcut()")
	public void audienceBehavior(){
		try{
			System.out.println("Take seats.");
			System.out.println("Silence cell phone.");
			new NightPerformance("Spring Festival Gala","20:00").perform();
			System.out.println("Clap! Clap! Clap!");
			System.out.println("Leave the Performance.");
		} catch(Exception e){
			System.out.println("Demand Refund!");
		}
	}
}
