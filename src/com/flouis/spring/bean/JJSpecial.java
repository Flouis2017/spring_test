package com.flouis.spring.bean;

import org.springframework.stereotype.Component;

import com.flouis.spring.bean.itface.CompactDisc;

@Component("jjSpecial")
public class JJSpecial implements CompactDisc {

	private String title = "Caocao";
	private String artist = "JJ";
	
	public void play() {
		System.out.println("Playing : " + title + " by " + artist);
	}

}
