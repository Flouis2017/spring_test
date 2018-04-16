package com.flouis.spring.DI.javaconfig.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.flouis.spring.DI.javaconfig.bean.AmericanFilm;
import com.flouis.spring.DI.javaconfig.bean.ChineseFilm;
import com.flouis.spring.DI.javaconfig.bean.JapaneseFilm;
import com.flouis.spring.DI.javaconfig.bean.itface.Film;

@Configuration
public class FilmSpringConfig {

	@Bean(name="cf")
	public Film chineseFilm(){
		return new ChineseFilm();
	}
	
	@Bean
	public Film americanFilm(){
		return new AmericanFilm();
	}
	
	@Bean
	public Film japaneseFilm(){
		return new JapaneseFilm();
	}
	
	@Bean
	public Film randomFilm(){
		int choice = new Random().nextInt(2);
		if (choice == 0){
			return new ChineseFilm();
		} else if (choice == 1){
			return new AmericanFilm();
		} else{
			return new JapaneseFilm();
//			return null;
		}
	}
	
}
