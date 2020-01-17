package com.mavenspringexample.CustomerDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mavenspringexample.CustomerDemo.Coach;

public class App {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("apco.xml");
			PoolCoach theCoach = context.getBean("theCoach", PoolCoach.class);
			
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			System.out.println("Age:"+theCoach.getAge());
			System.out.println("email: "+theCoach.getEmail());
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
}
