//	2020-05-14

package com.ict.test;

import com.ict.edu.Ex05;

public class Ex05_main {

	public static void main(String[] args) {
		
		//	패키지가 달라도 import를 하면 public은 사용가능  
		System.out.println(Ex05.k1);
		//	protected 와 생략은 패키지가 다르면 사용 불가 
//		System.out.println(Ex05.k2);
//		System.out.println(Ex05.k3);
		//	static 이더라도  private 은 접근 못함
//		System.out.println(Ex05.k4);	 
		
		Ex05 ex05 = new Ex05();
		
		//	패키지가 달라도 import를 하면 public은 사용가능  
		System.out.println(ex05.s1);
		//	protected 와 생략은 패키지가 다르면 사용 불가 
//		System.out.println(ex05.s2);
//		System.out.println(ex05.s3);
		//	객체를 생성해도 private 은 접근 못함 
//		System.out.println(ex05.s4);
	}
}
