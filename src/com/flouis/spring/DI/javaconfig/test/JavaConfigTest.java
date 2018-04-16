package com.flouis.spring.DI.javaconfig.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.DI.javaconfig.bean.itface.Film;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.flouis.spring.DI.javaconfig.config.FilmSpringConfig.class)
public class JavaConfigTest {
	
	@Autowired
	@Qualifier("americanFilm")
	private Film af;
	
	@Autowired
	@Qualifier("cf")
	private Film cf;
	
	@Autowired
	@Qualifier("randomFilm")
	private Film randomFilm;
	
	
	@Test
	public void TestJavaConfig(){
		af.setFilmName("Resident Evil");
		af.setDirector("Paul.Anderson");
		af.setStarring("Milla.Jovovich");
		System.out.println(af);
		af.play();
		System.out.println(cf);
		System.out.println(randomFilm);
	}

}
