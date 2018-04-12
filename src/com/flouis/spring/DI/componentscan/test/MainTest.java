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
@ContextConfiguration(classes=com.flouis.spring.DI.componentscan.bean.ComponentScanConfig.class)
public class MainTest {
	
	@Autowired
	@Qualifier("jayChouSpecial")
	private CompactDisc cd;
	
	@Autowired
	private A a;

	@Test
	public void testComponentScan() {
		System.out.println(cd);//com.flouis.spring.bean.JayChouSpecial@76508ed1
		cd.play();
		System.out.println(a);
	}

}
