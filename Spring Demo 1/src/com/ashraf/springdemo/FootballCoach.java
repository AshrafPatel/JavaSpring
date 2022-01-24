package com.ashraf.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService service) {
		fortuneService = service;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes kicking a football";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Football " + fortuneService.getFortune();
	}
}
