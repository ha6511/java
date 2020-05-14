// 2020-05-13

package com.ict.edu;

public class Ex08 {

	public static void main(String[] args) {
		
		// 다차원 배열 : 1차원 배열이 여러개 모인 것 
		// 고정길이 배열 : 1차원 배열안에 존재하는 배열의 수가 일정
		
		// 선언과 생성을 한번에 
		//	char[][] ch;
		//	ch = new char[3][2];
		char[][] ch = new char[3][2];
		
		//	데이터 저장 (고정길이에서만 가능)
		ch[0][0] 	=	'a';
		ch[0][1]	=	'A';
		ch[1][0] 	=	'b';
		ch[1][1]	=	'B';
		ch[2][0] 	=	'c';
		ch[2][1]	=	'C';
		
		// 출력 
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		//	생성, 선언, 데이터 저장을 한번에 
		//	int[][] k1 = new int[3][2];
		int[][] k1 = {{1,2},{10,20},{100,200}};
		char[][] k2 = {{'a','A'},{'b','B'},{'c','C'}};
		String[][] k3 = {{"java","jsp","andorid"},{"html","css","js"}};
		
		for (int i = 0; i < k3.length; i++) {
			for (int j = 0; j < k3[i].length; j++) {
				System.out.print(k3[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		//	1차원 배열을 만들어서 배열에 넣기 (고정길이, 가변길이 모두 사용가능
		int[][] su = new int[2][4];
		
		int[] su1 = {1,2,3,4};
		int[] su2 = {10,20,30,40};
		
		su[0]	=	su1;
		su[1]	=	su2;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	} 
	
}
