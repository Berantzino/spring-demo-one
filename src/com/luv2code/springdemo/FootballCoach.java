package com.luv2code.springdemo;

public class FootballCoach implements Coach{

	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Throw 50 TDs";
	}

	@Override
	public String getDailyFortune() {
		return "Step Up: " + fortuneService.getFortune();
	}
}