package com.ict.edu;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		// Random 클래스를 활용해서 정수 1-10 사이의 난수를 구하시오 
		
		Random ran = new Random();
		
		int su = ran.nextInt(10) + 1;
		
		System.out.println("정수 1-10 사이의 난수 : " + su);
	}	
}
