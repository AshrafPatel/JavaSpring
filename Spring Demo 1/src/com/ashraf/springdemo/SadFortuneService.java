package com.ashraf.springdemo;

public class SadFortuneService implements FortuneService {
	
	String[] arr  = {"a", "b", "c"};
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return arr[0];
	}

}
