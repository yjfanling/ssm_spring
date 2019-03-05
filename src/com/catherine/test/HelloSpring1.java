package com.catherine.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.catherine.bean.User;

public class HelloSpring1 {
	@Test
	public void Test1(){
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//scope="singleton" 单例模式 只创建一个对象
		User u1=ac.getBean(User.class);
		User u2=ac.getBean(User.class);
		User u3=ac.getBean(User.class);
		
		System.out.println(u1==u2);
		//关闭容器对象就会触发bean的destroymethod
		ac.close();
	}
	@Test
	public void Test2(){
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//scope="prototype" 多例模式 在获取的时候会创建新的对象
		User u1=ac.getBean(User.class);
		User u2=ac.getBean(User.class);
		User u3=ac.getBean(User.class);
		
		System.out.println(u1==u2);
		ac.close();
	}
}
