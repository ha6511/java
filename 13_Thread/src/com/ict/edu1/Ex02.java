package com.ict.edu1;

public class Ex02 {
	public void play() {
		 
		System.out.println("Ex02.play() :" +  Thread.currentThread().getName());
		System.out.println("Ex02의 plsy");
		
	}
	
	public String sound() {
		
		System.out.println("Ex02.sound() :" +  Thread.currentThread().getName());;
		return "Hello";
		
	}

}
