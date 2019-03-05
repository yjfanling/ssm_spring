package com.catherine.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.catherine.bean.Pet;
import com.catherine.bean.User2;
@RunWith(SpringJUnit4ClassRunner.class)//使用junit进行测试，帮我们创建容器。
@ContextConfiguration("classpath:applicationContext.xml")//读取配置文件
public class Test_JUnit {
	@Resource(name="dog")
	private Pet p;
	
	@Test
	public void Test(){
		System.out.println(p);
		
	}
}
