package com.ict.homework;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 퀴즈 : 010-7777-9999 => 010-7777-XXXX
		String	str	=	"010-7777-9999";
		int 	i	=	str.indexOf('-', str.indexOf('-')+1);
		String	out	=	str.substring(0, str.indexOf('-', str.indexOf('-')+1)+1)+ "XXXX";
		System.out.println(out);		
				
				
						
	}

}
