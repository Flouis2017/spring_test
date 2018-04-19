package com.flouis.spring.DI.xmlconfig.bean;

import com.flouis.spring.DI.xmlconfig.bean.itface.Film;

public class ChineseFilm implements Film{

	
	private String filmName;
	private String director;
	private String starring;
	
	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getStarring() {
		return starring;
	}

	public void setStarring(String starring) {
		this.starring = starring;
	}
	
	public ChineseFilm(String filmName,String director,String starring){
		this.filmName = filmName;
		this.director = director;
		this.starring = starring;
	}

	public ChineseFilm(){}
	
	public void play() {
		System.out.println("China Film: "+filmName+" By "+director+" With Super Stars: "+starring);
	}

}
