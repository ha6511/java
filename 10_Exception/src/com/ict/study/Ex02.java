package com.ict.study;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar curr =  Calendar.getInstance();
		
		try {
		
			int year1 = curr.get(Calendar.YEAR);
			
			System.out.print("출생년도 : ");
			String	year = sc.next();
			int year2 = Integer.parseInt(year);
			
			int		age		=	year1 - year2;
			
			System.out.println("나이 : "+ age);
			
		} catch (Exception e) {
			System.out.println("숫자만 넣어 주세요");
		} finally {
			System.out.println("고맙습니다.");
		}
		
	}

}
