package com.flouis.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.flouis.spring.bean.itface.CompactDisc;
import com.flouis.spring.bean.itface.MediaPlayer;


@Component
public class CDPlayer implements MediaPlayer {

//	@Autowired
//	@Qualifier("jayChouSpecial")
	private CompactDisc cd;
	
	public CompactDisc getCompactDisc(){
		return this.cd;
	}
	
	@Autowired
	@Qualifier("jjSpecial")
	public void setCompactDisc(CompactDisc cd){
		this.cd = cd;
	}

	public CDPlayer(@Autowired @Qualifier("JJ") CompactDisc cd){
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}

}
