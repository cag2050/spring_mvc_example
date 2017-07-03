package com.tutorialspoint.importt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);
		// now both beans A and B will be available...
		A a = context.getBean(A.class);
		B b = context.getBean(B.class);
		a.printMsg("aaa");
		b.printMsg("bbb");
		context.close();
	}

}
