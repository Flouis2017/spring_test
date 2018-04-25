package com.flouis.spring.AOP.mixedConfig.bean;

import org.springframework.stereotype.Component;

import com.flouis.spring.AOP.mixedConfig.bean.itface.Performance;

@Component("np")
public class NightPerformance implements Performance {

	private String name;
	private String time;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public NightPerformance(){}
	
	public NightPerformance(String name,String time){
		this.name = name;
		this.time = time;
	}

	public void perform() {
		System.out.println("Welcome to "+this.name+" at "+this.time+" this night!");
	}

}
