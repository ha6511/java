//	2020-05-14

package com.ict.edu;

public class Ex06_name {
	public static void main(String[] args) {
		Ex06 ex06 = new Ex06();
		
		System.out.println(ex06.name);
		String s = ex06.s_name();
		System.out.println(s);
		System.out.println();
		
		System.out.println(ex06.age);
		int age = ex06.s_age();
		System.out.println(age);
		System.out.println();
		
		//	weight 이 private 이기때문에 바로 접근할 수 없다.
//		System.out.println(ex06.weight());
		
		//	메소드를 이용해서 접근한다. 
		//	이때 사용되는 메소드가 getter 이다.
		double weight = ex06.s_weight();
		System.out.println(weight);
		System.out.println();
		System.out.println("=====================");
		
		//	이름을 둘리로 변경하자
		ex06.re_name("둘리");
		//	확인 
		System.out.println(ex06.name);
		s = ex06.s_name();
		System.out.println(s);
		System.out.println();
		
		//	나이를 5000 살로 변경하자 
		ex06.re_age(5000);
		//	확인 
		System.out.println(ex06.age);
		age = ex06.s_age();
		System.out.println(age);
		System.out.println();
		
		//	몸무게를 10000 으로 변경하자
		//	int는 double에 저장할 수 있다
		ex06.re_weight(10000);
		//	확인
		weight	=	ex06.s_weight();
		System.out.println(weight);
	}
}
