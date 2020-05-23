//	2020-05-14

package com.ict.edu;

public class Ex05_main {

	public static void main(String[] args) {
		
		System.out.println(Ex05.k1);
		System.out.println(Ex05.k2);
		System.out.println(Ex05.k3);
		//	static 이더라도  private 은 접근 못함
//		System.out.println(Ex05.k4);	 
		
		Ex05 ex05 = new Ex05();
		
		System.out.println(ex05.s1);
		System.out.println(ex05.s2);
		System.out.println(ex05.s3);
		//	객체를 생성해도 private 은 접근 못함 
//		System.out.println(ex05.s4);
	}
}
