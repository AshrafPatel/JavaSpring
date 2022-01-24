package com.ashraf.springdemo;

public class GolfCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public GolfCoach(FortuneService fService) {
		this.fortuneService = fService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Golf " + fortuneService.getFortune();
	}

}
