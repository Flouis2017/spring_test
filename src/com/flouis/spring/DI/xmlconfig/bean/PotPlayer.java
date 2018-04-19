package com.flouis.spring.DI.xmlconfig.bean;

import com.flouis.spring.DI.xmlconfig.bean.itface.Film;
import com.flouis.spring.DI.xmlconfig.bean.itface.MediaPlayer;

public class PotPlayer implements MediaPlayer {

	private Film film;
	
	public Film getFilm() {
		return this.film;
	}
	
	public void setFilm(Film f){
		this.film = f;
	}

	public PotPlayer(){}
	
	public PotPlayer(Film film){
		this.film = film;
	}
	
	public void play() {
		film.play();
	}

}
