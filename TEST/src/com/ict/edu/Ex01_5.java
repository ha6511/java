package com.ict.edu;

public class Ex01_5 {

	// int su = 24  일때  삼항연산자를 활용해서 홀수인지, 짝수인지 판별할 수 있는 코딩을 쓰시오
	
	public static void main(String[] args) {

		int su = 24;
		
		String result = ( su % 2 ) == 0 ? "짝수" : "홀수";
		System.out.println(su + "는 " + result + " 이다.");
				
	}
}
