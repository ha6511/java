package com.ict.edu;

import java.util.Calendar;

public class Ex06 {

	public static void main(String[] args) {

		// Calendar를 활용해서 오늘날짜, 시간, 분, 요일을 구하시오 
		
		Calendar curr = Calendar.getInstance();
		
		int year = curr.get(Calendar.YEAR);			// 년도 
		
		int month = curr.get(Calendar.MONTH) + 1;	// 월 
		
		int date = curr.get(Calendar.DATE);			// 일 
		
		int	time = curr.get(Calendar.HOUR_OF_DAY);	// 시간 
		
		int minute = curr.get(Calendar.MINUTE);		// 분
		
		String week = null;							// 요일 
		switch (curr.get(Calendar.DAY_OF_WEEK)) {
		case 1 : week = "일요일"; break;
		case 2 : week = "월요일"; break;
		case 3 : week = "화요일"; break;
		case 4 : week = "수요일"; break;
		case 5 : week = "목요일"; break;
		case 6 : week = "금요일"; break;
		case 7 : week = "토요일"; break;
		default: break;
		}
		
		System.out.print("현재는 ");
		System.out.print(year + "년 " + month + "월 "+ date + "일 ");
		System.out.print(time + "시 " + minute + "분 ");		
		System.out.print(week + " 입니다.");		
				
		
	}
}
