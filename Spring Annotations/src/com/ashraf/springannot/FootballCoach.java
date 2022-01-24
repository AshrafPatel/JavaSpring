package com.ashraf.springannot;

import org.springframework.stereotype.Component;

@Component("theFCoach")
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Your Legwork";
	}

}
