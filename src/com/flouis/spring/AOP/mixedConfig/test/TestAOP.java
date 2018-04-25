package com.flouis.spring.AOP.mixedConfig.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.AOP.mixedConfig.bean.itface.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/flouis/spring/AOP/mixedConfig/config/applicationContext.xml"})
public class TestAOP {
	
	@Autowired
	@Qualifier("np")
	private Performance nightPerformance;
	
	@Test
	public void test(){
		this.nightPerformance.setName("Spring Festival Gala");
		this.nightPerformance.setTime("20:00");
		this.nightPerformance.perform();
	}

}
