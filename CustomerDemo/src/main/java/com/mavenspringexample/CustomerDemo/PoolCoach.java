package com.mavenspringexample.CustomerDemo;

public class PoolCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	private int age;
	
	public PoolCoach() {
		super();
	}
	public void setFortuneService(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Pin atleast 3 solid balls in a go.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

	
}
