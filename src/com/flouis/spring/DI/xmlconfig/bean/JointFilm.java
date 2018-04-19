package com.flouis.spring.DI.xmlconfig.bean;

import java.util.List;

import com.flouis.spring.DI.xmlconfig.bean.itface.Film;

public class JointFilm implements Film {

	private String filmName;
	private String director;
	private List<String> actorList;
	
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

	public List<String> getActorList() {
		return actorList;
	}

	public void setActorList(List<String> actorList) {
		this.actorList = actorList;
	}
	
	public JointFilm(){}
	
	public JointFilm(String filmName,String director,List<String> actorList){
		this.filmName = filmName;
		this.director = director;
		this.actorList = actorList;
	}

	public void play() {
		System.out.println(this.filmName+" directed by "+this.director);
		if (this.actorList!=null){
			for (int i=0;i<actorList.size();i++){
				if (i==actorList.size()-1){
					System.out.print(actorList.get(i));
				} else {
					System.out.print(actorList.get(i)+"/ ");
				}
			}
		}
	}

}
