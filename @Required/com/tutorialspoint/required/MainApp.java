package com.tutorialspoint.required;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		  FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("@Required/Beans.xml");
	      Student student = (Student) context.getBean("student");
	      System.out.println("Name : " + student.getName() );
	      System.out.println("Age : " + student.getAge() );
	      context.close();
	}

}
