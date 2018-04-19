package com.flouis.spring.DI.xmlconfig.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import com.flouis.spring.DI.xmlconfig.bean.itface.Film;
import com.flouis.spring.DI.xmlconfig.bean.itface.MediaPlayer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/flouis/spring/DI/xmlconfig/config/spring.xml"})
public class XmlConfigTest2 {

	@Autowired
	@Qualifier("pp_property")
//	@Qualifier("pp_p")
//	@Qualifier("pp_constructor")
//	@Qualifier("pp_c")
	private MediaPlayer player;

	@Test
	public void test(){
//		Film film = player.getFilm();
		player.play();
	}
	
}
