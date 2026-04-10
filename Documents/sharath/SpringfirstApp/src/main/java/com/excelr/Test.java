package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");

		Car c=con.getBean("car1",Car.class);
	}

}
