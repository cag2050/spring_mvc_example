package com.tutorialspoint.helloworld;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("helloworld/Beans.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.close();
	}

}
