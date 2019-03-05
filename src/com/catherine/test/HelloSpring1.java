package com.catherine.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.catherine.bean.User;

public class HelloSpring1 {
	@Test
	public void Test1(){
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//scope="singleton" ����ģʽ ֻ����һ������
		User u1=ac.getBean(User.class);
		User u2=ac.getBean(User.class);
		User u3=ac.getBean(User.class);
		
		System.out.println(u1==u2);
		//�ر���������ͻᴥ��bean��destroymethod
		ac.close();
	}
	@Test
	public void Test2(){
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//scope="prototype" ����ģʽ �ڻ�ȡ��ʱ��ᴴ���µĶ���
		User u1=ac.getBean(User.class);
		User u2=ac.getBean(User.class);
		User u3=ac.getBean(User.class);
		
		System.out.println(u1==u2);
		ac.close();
	}
}
