package com.ashraf.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TheApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach fCoach = context.getBean("fCoach", Coach.class);
		System.out.println(fCoach.getDailyWorkout());
		Coach cCoach = context.getBean("cCoach", Coach.class);
		System.out.println(cCoach.getDailyWorkout());
		Coach gCoach = context.getBean("gCoach", Coach.class);
		System.out.println(gCoach.getDailyFortune());
		context.close();
		
	}

}
