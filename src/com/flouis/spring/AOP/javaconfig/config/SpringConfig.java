package com.flouis.spring.AOP.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.flouis.spring.AOP.javaconfig.bean.NightPerformance;
import com.flouis.spring.AOP.javaconfig.bean.itface.Performance;


@Configuration
@EnableAspectJAutoProxy
@Import({com.flouis.spring.AOP.javaconfig.bean.Audience.class})
public class SpringConfig {

	@Bean
	@Scope("prototype")
	public Performance nightPerformance(){
		return new NightPerformance("Spring Festival Gala","20:00");
	}
	
}
