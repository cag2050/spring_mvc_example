package com.tutorialspoint.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("@Qualifier/Beans.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
	}

}
