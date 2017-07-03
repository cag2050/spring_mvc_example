package com.tutorialspoint.qualifier;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("@Qualifier/Beans.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
		context.close();
	}
}
