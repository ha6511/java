package com.ict.study;

import java.util.Calendar;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
//		  5명의 이름, 국어, 영어, 수학을 입력받아서 
//		  이름, 총점, 평균, 학점, 순위를 구하고 정렬하자
//		  (순위와 정렬은  main에서 구함 )
//		  main()함수를 가지고 있는 클래스 : Sungjuk
//		  정보를 가지고 있는 클래스 : Person
//		  public class Person{
//		      private String name ;
//		      private int sum ;
//		      private double avg ;
//		      private String hak ;
//		      private int rank = 1 ;
//
//		      나머지는 채우세요

//1   근무시간이 8시간까지는 시간당 8590이고 
// 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
//현재 근무한 시간이 10이다. 
//얼마를 받아야 하는가? ( IF~else을 사용하시오)

		int work = 10;
		int pay = 0;
 

		if (work > 8) {
			pay = (work - 8) * (int) (8590 * 1.5) + 8590 * 8;
		} else {
			pay = 8590 * 10;
		}
		System.out.println(pay);
		
		Random ran = new Random();
		System.out.println(ran.ints(10));
	}
}
