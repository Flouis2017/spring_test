package com.flouis.spring.DI.javaconfig.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.flouis.spring.DI.javaconfig.bean.AmericanFilm;
import com.flouis.spring.DI.javaconfig.bean.ChineseFilm;
import com.flouis.spring.DI.javaconfig.bean.JapaneseFilm;
import com.flouis.spring.DI.javaconfig.bean.MP4Player;
import com.flouis.spring.DI.javaconfig.bean.itface.Film;
import com.flouis.spring.DI.javaconfig.bean.itface.MediaPlayer;

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
		int choice = new Random().nextInt(3);
		if (choice == 0){
			return new ChineseFilm();
		} else if (choice == 1){
			return new AmericanFilm();
		} else{
			return new JapaneseFilm();
//			return null;
		}
	}
	
	@Bean
	public MediaPlayer mp4Player(){
		return new MP4Player();
	}
	
	//JavaConfig方式构造器注入
	@Bean(name="mp4Player2")
	public MediaPlayer mp4Player2(){
		return new MP4Player(this.japaneseFilm());
	}
	
	//JavaConfig方式setter方法注入
	@Bean(name="mp4Player3")
	public MediaPlayer mp4Player3(){
		Film film = this.americanFilm();
		MP4Player mp4Player = new MP4Player();
		mp4Player.setFilm(film);
		return mp4Player;
	}
	
}
