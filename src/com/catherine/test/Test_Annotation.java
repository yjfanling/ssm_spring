package com.catherine.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.catherine.bean.User2;

public class Test_Annotation {
	@Test
	public void Test(){
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
		User2 u=(User2) ac.getBean("user");
		User2 u1=(User2) ac.getBean("user");
//		System.out.println(u==u1);
		System.out.println(u);
	}
}
