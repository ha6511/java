package com.ict.edu8;

public class Ex02_interface {
	
	public static void main(String[] args) {
		
		//	객체생성 없이 호출가능 => static 이라는 증거  
		System.out.println(Ex01_interface.su1);
		System.out.println(Ex01_interface.su2);
		System.out.println(Ex01_interface.SU3);
		System.out.println(Ex01_interface.SU4);
		
		//	값 변경이 안된다. => final 이라는 증거
//		System.out.println(Ex01.su1++);
//		System.out.println(Ex01.su2++);
//		System.out.println(Ex01.SU3++);
//		System.out.println(Ex01.SU4++);
		
	}

}
