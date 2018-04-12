package com.flouis.spring.DI.componentscan.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.DI.componentscan.bean.itface.A;
import com.flouis.spring.DI.componentscan.bean.itface.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={com.flouis.spring.DI.componentscan.resource.Config.class})
//@ContextConfiguration(locations={"classpath:com/flouis/spring/resource/spring.xml"})
public class TestDI {

	@Autowired
	@Qualifier("jayChouSpecial")
	private CompactDisc jccd;
	
	@Autowired
	private A a;
	
	@Autowired
	@Qualifier("JJ")
	private CompactDisc jjcd;
	
	@Test
	public void testDI(){
		System.out.println(jccd);
		jccd.play();
		System.out.println(a);
		System.out.println(jjcd);
		jjcd.play();
	}
	
}
