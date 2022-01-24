package com.ashraf.springannot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach fCoach = context.getBean("theFCoach", Coach.class);
		
		Coach cCoach = context.getBean("cricketCoach", Coach.class);
		
		System.out.println(fCoach.getDailyWorkout());
		
		System.out.println(cCoach.getDailyWorkout());
		
		context.close();
	}

}
