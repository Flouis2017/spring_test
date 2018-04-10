package com.flouis.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.bean.itface.A;
import com.flouis.spring.bean.itface.CompactDisc;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.flouis.spring.bean.ComponentScanConfig.class)
public class MainTest {
	
	@Autowired
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
