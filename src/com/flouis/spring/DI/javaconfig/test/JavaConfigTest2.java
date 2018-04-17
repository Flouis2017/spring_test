package com.flouis.spring.DI.javaconfig.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.DI.javaconfig.bean.itface.Film;
import com.flouis.spring.DI.javaconfig.bean.itface.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.flouis.spring.DI.javaconfig.config.FilmSpringConfig.class)
public class JavaConfigTest2 {

	@Autowired
	@Qualifier("mp4Player2")
	private MediaPlayer mp4Player;
	
	@Test
	public void test(){
		Film film = mp4Player.getFilm();
		film.setFilmName("aaa");
		film.setDirector("bbbb");
		film.setStarring("ccccc");
		mp4Player.play();
	}
	
}
