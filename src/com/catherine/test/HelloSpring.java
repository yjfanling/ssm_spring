package com.catherine.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.catherine.bean.User;

public class HelloSpring {
	//��֮ǰ��Ŀ�ڿ����� new�������Լ�����
	@Test
	public void Test1(){
		User u=new User();
		u.setU_id(1);
		System.out.println(u);
	}
	//IoC�ķ�ת������������ݹ����������Լ�ִ�з�ת��spring������ִ�У�
	//IoC�Ŀ��ƣ���spring�����Ǹ��𴴽����ٶ����ƿض�����������ڵȣ���������Ҫʹ�ö����ʱ���spring���뼴��
	//IoC��һ�ֱ��˼�룬Ҳ��һ�����ģʽ������ҪDI������ע�룩��֧��
	
	//spring��һ�����������������ǹ������
	@Test
	public void Test2(){
		//����spring�����ļ���ȡ��������
		//ApplicationContext���õ�����bean����������������ʱ�򱻴�������
		//������õ�bean�϶࣬��ô�ڴ���������ʱ�򣬻�����ڴ��������⡣��������ٻ���Ӳ�����ܽ�Ϊ����ʱ�����ֵñȽ����ԣ�
		//�ӳټ��� �����lazy-init��������״̬��default��true��false 
		// ��<bean name="user" class="com.catherine.bean.User" lazy-init="true">��User�����ڴ���������ʱ����Զ����أ��ڻ�ȡ��ʱ��Ŵ���
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��getBean��ȡ���úõ�user���󣨳���Ա��spring����Ҫ����
//		User u=(User) ac.getBean("user");  //�������ֻ�ȡ����
//		//User u=ac.getBean(User.class);		 //�������ͻ�ȡ����
//		System.out.println(u);
	}
}
