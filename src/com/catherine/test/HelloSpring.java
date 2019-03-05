package com.catherine.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.catherine.bean.User;

public class HelloSpring {
	//在之前项目在开发中 new对象是自己做的
	@Test
	public void Test1(){
		User u=new User();
		u.setU_id(1);
		System.out.println(u);
	}
	//IoC的反转：创建对象这份工作由我们自己执行反转给spring帮我们执行；
	//IoC的控制：由spring帮我们负责创建销毁对象，掌控对象的生命周期等，我们在需要使用对象的时候根spring申请即可
	//IoC是一种编程思想，也是一种设计模式，它需要DI（依赖注入）的支持
	
	//spring是一个容器，他将帮我们管理对象
	@Test
	public void Test2(){
		//根据spring配置文件获取容器对象
		//ApplicationContext配置的所有bean都会在容器创建的时候被创建出来
		//如果配置的bean较多，那么在创建容器的时候，会产生内存过大的问题。这种情况再机器硬件性能较为落后的时候体现得比较明显；
		//延迟加载 ，添加lazy-init，有三种状态：default、true、false 
		// 即<bean name="user" class="com.catherine.bean.User" lazy-init="true">则User不会在创建容器的时候就自动加载，在获取的时候才创建
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getBean获取配置好的user对象（程序员向spring容器要对象）
//		User u=(User) ac.getBean("user");  //根据名字获取对象
//		//User u=ac.getBean(User.class);		 //根据类型获取对象
//		System.out.println(u);
	}
}
