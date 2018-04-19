package com.flouis.spring.DI.xmlconfig.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.DI.xmlconfig.bean.itface.Film;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/flouis/spring/DI/xmlconfig/config/spring.xml"})
public class XmlConfigTest {

	@Autowired
//	@Qualifier("chineseFilm")
//	@Qualifier("japaneseFilm")
//	@Qualifier("americanFilm")
	@Qualifier("jointFilm2")
	private Film film;

	@Test
	public void test(){
		System.out.println(film);
		film.play();
	}
	
}
