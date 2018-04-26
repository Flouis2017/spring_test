package com.flouis.spring.AOP.javaconfig.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flouis.spring.AOP.javaconfig.bean.itface.Performance;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={com.flouis.spring.AOP.javaconfig.config.SpringConfig.class})
public class TestAOP {

	@Autowired
	private Performance np;
	
	@Autowired
	private Performance nightPerformance;
	
	@Test
	public void test(){
		System.out.println(np);
		System.out.println(nightPerformance);
		np.perform();
	}
	
}
