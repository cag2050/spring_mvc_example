package com.tutorialspoint.txadvice;

import java.util.List;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("txadvice/Beans.xml");
		StudentDAO studentJDBCTemplate = (StudentDAO) context.getBean("studentJDBCTemplate");
		System.out.println("------Records creation--------");
		studentJDBCTemplate.create("Zara", 11, 99, 2010);
		studentJDBCTemplate.create("Nuha", 20, 97, 2010);
		studentJDBCTemplate.create("Ayan", 25, 100, 2011);
		System.out.println("------Listing all the records--------");
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}
		context.close();
	}

}
