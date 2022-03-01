package com.aman.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		//BeanFactory beanFactory;
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
		
		//Vehicle vehicle=new Car();
		//vehicle.drive();
		//Vehicle vehicle2=new Bike();
		
		Vehicle obj=(Vehicle) applicationContext.getBean("vehicle");
		obj.drive();
	}
}
