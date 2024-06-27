package com.abc.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserMain {
	public static void main(String[] args) {
//		BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory factory=new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

//		User user=factory.getBean("user1",User.class);
//		User user=factory.getBean("user",User.class);
		User user=factory.getBean(User.class);


		System.out.println(user);
		System.out.println("userr data ");
		System.out.println("\tid "+user.getUserId());
		System.out.println("\tname "+user.getUserName());
		System.out.println("\tsalary "+user.getUserSalary());

		User user1=factory.getBean(User.class);
		user1.setUserId(805675);
		user1.setUserName("anand kumar");
		user1.setUserSalary(34000);

		
		System.out.println("========================================");
		System.out.println(user);
		System.out.println(user1);
		
	}
} 
