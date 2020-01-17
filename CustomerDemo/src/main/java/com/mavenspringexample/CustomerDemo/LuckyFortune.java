package com.mavenspringexample.CustomerDemo;

public class LuckyFortune implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Live your day to its fullest.";
	}

}
