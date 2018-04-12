package com.flouis.spring.test;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.bean.CDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={com.flouis.spring.resource.Config.class})
public class TestDI2 {

	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void test(){
		System.out.println(cdPlayer.getCompactDisc());
		this.cdPlayer.play();
	}
}
