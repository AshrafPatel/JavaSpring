package com.ashraf.springdemo;

public class FootballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes kicking a football";
	}
}
