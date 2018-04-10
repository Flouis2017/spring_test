package com.flouis.spring.bean;

import org.springframework.stereotype.Component;

import com.flouis.spring.bean.itface.CompactDisc;

@Component("jayChouSpecial")
public class JayChouSpecial implements CompactDisc {

	private String title = "Common Jasmin Orange";
	private String artist = "Jay Chou";
	
	public void play() {
		System.out.println("Playing : " + title + " by " + artist);
	}

}


