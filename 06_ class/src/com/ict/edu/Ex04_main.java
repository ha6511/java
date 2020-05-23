//	2020-05-14

package com.ict.edu;

public class Ex04_main {
	public static void main(String[] args) {
		
		Ex04 ex04 = new Ex04();
		
		ex04.add();
		System.out.println(ex04.k1);
		
		ex04.plus(5);
		System.out.println(ex04.k1);
		
		ex04.calc(100, 4);
		System.out.println(ex04.k1);
		
		ex04.s_add("호돌이");
		System.out.println(ex04.str);
	}
}
