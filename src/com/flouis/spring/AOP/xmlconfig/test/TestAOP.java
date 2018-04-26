package com.flouis.spring.AOP.xmlconfig.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.AOP.xmlconfig.bean.itface.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/flouis/spring/AOP/xmlconfig/config/spring_aop.xml"})
public class TestAOP {
	
	@Autowired
	@Qualifier("np")
	private Performance nightPerformance;
	
	@Test
	public void test(){
		this.nightPerformance.perform();
	}
	
}