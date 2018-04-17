package com.flouis.spring.DI.javaconfig.bean;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

import com.flouis.spring.DI.javaconfig.bean.itface.Film;
import com.flouis.spring.DI.javaconfig.bean.itface.MediaPlayer;

public class MP4Player implements MediaPlayer {

//	@Autowired	// 使用javaconfig方式进行依赖注入时，要将这两个注释去掉。
//	@Qualifier("cf")
	private Film film;
	
	public void setFilm(Film film){
		this.film = film;
	}
	
	public Film getFilm(){
		return this.film;
	}
	
	public MP4Player(){}
	
	public MP4Player(Film film){
		this.film = film;
	}
	
	public void play() {
		film.play();
	}

}
