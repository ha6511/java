// 2020-05-18
package com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//	날짜 관련 클래스 : 
		//	Date 클래스 ( deprecate => 언제든지 지원을 끊을 수 있다.)
		//	Calender 클래스 => Date 클래스 대신 사용 중인 클래스
		
		Date	date	=	new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf1	=	new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2	=	new SimpleDateFormat("yy.M.dd hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		System.out.println(date.getYear() + " 년");  // 2020 - 1900 = 120
		System.out.println(date.getYear()+1900 + " 년");  
		
		System.out.println(date.getMonth() + " 월"); // 0 ~ 11 
		System.out.println(date.getMonth() + 1 + " 월");
		
		System.out.println(date.getDate() + " 일");
		
		System.out.println(date.getHours() + " 시");
		System.out.println(date.getMinutes() + " 분");
		System.out.println(date.getSeconds() + " 초");
		
		int k = date.getDay(); // 0 ~ 6  0:일요일, 6:토요일 
		switch (k) {
		case 0: System.out.println("일요일");break;
		case 1: System.out.println("월요일");break;
		case 2: System.out.println("화요일");break;
		case 3: System.out.println("수요일");break;
		case 4: System.out.println("목요일");break;
		case 5: System.out.println("금요일");break;
		case 6: System.out.println("토요일");break;
		default:
			break;
		}
		System.out.println("======================");
		
		//	Calender 클래스
		//	new 예약어를 사용하지 않고 객체 생성한다.
		//	년, 월, 일, 시, 분, 초 호출방법 : get(참조변수 필드 또는 Calender 필드)
		Calendar	now	=	Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR) 	+ "년");
		System.out.println(now.get(Calendar.MONTH)+1 + "월"); // 0 ~ 11
		System.out.println(now.get(Calendar.DATE) + "일");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println("======================");
		System.out.println(now.get(Calendar.HOUR) + "시");			//	12시간제
		System.out.println(now.get(Calendar.HOUR_OF_DAY) + "시");	//	24시간제 
		//	am=>0, pm=>1
		int res = now.get(Calendar.AM_PM);
		if	(res == 0)	{
			System.out.println("오전 " + now.get(Calendar.HOUR) + "시");			//	12시간제
		}	else	{
			System.out.println("오후 " + now.get(Calendar.HOUR) + "시");			//	12시간제
		}
		System.out.println(now.get(Calendar.MINUTE) + "분") ;
		System.out.println(now.get(Calendar.SECOND) + "초") ;
		
		res = now.get(Calendar.DAY_OF_WEEK);
		switch (res) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;

		default:
			break;
		}
		
	}
	
}


//	높음, 낮음 
//	가위, 바위, 보 