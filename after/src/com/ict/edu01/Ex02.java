package com.ict.edu01;

public class Ex02 {

		public static void main(String[] args) {
			
			//	선언 -> 생성 -> 저장 -> 출력 
//			char[] su2;
//			su2 = new char[4];
			
			//	 선언과 생성을 한번에 
			char[]	su2	=	new	char[4];
			
			//	데이터 저장 
			su2[0] = 'a';
			su2[1] = 'b';
			su2[2] = 'c';
			su2[3] = 'd';
			
			for (int i = 0; i < su2.length; i++) {
				System.out.println(su2[i]);
			}
			
			for (char k : su2) {
				System.out.println(k);
			}
			System.out.println("====================");
			
			//	선언과 생성과 데이터저장 한번에 
			int[] su4 = {10,200,3000,4000};
			for (int k : su4) {
				System.out.println(k);
			}
			System.out.println("====================");
			
			//	String배열에 저장내용은 "java", "jsp","html", "css", "jquery"
			String[] str = {"java","jsp","html","css","jquery"};
			
			for (String k : str) {
				System.out.println(k);
			}
			System.out.println("====================");
			
			
		}
}
