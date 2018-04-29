package com.flouis.spittr.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.flouis.spittr.javaconfig.controller"})
public class WebConfig extends WebMvcConfigurerAdapter{
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new
				InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
