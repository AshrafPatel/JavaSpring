package com.ashraf.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fService) {
		this.fortuneService = fService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 min batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket " +  fortuneService.getFortune();
	}

}
