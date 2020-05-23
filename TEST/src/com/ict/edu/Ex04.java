package com.ict.edu;

public class Ex04 {
	
	final static int LIMIT = 8;			//	기본근로시간 
	final static int BASE = 8590;		//	시간당 기본급
	final static double OVER = 1.5;		//	초과 근로 수당 비율 
	
	public static void main(String[] args) {
		
		int	work = 10;			//	현재 근무한 시간
		int pay  = 0;			//	받는 급여 
		
		if (work > LIMIT) {		//	근무시간이 8시간을 초과한 경우 
			
			pay = ( (int) (( work - LIMIT ) * OVER) * BASE )+ (LIMIT * BASE) ;    
			
		} else {				//	근무시간이 8시간을 초과하지 않은 경우 
			
			pay = work * BASE;	
					
		}
		
		System.out.println(work + " 시간의 급여는 " + pay + " 원 이다 ");
	}
}
