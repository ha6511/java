package com.ict.test;

public class Ex09 {

	public static void main(String[] args) {

		char[][] ch = new char[3][];
		char[] c1 = {'j','a','v','a'};
		char[] c2 = {'j','s','p'};
		char[] c3 = {'a','d','r','o','i','d'};
		
		ch[0] = c1;
		ch[1] = c2;
		ch[2] = c3;
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		
		

	}
}
