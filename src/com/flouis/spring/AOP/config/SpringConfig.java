package com.flouis.spring.AOP.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.flouis.spring.AOP.bean.NightPerformance;
import com.flouis.spring.AOP.bean.itface.Performance;


@Configuration
@EnableAspectJAutoProxy
@Import({com.flouis.spring.AOP.bean.Audience.class})
public class SpringConfig {

	@Bean
	public Performance nightPerformance(){
		return new NightPerformance("Spring Festival Gala","20:00");
	}
	
}
