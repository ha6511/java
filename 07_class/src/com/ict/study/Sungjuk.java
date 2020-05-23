package com.ict.study;

import java.util.Scanner;

public class Sungjuk {
	
	public static void main(String[] args) {
		
		Person[] arr = new Person[5];
		Scanner sc =  new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			
			Person temp = new Person();
			
			System.out.println("이름 : ");
			temp.setName(sc.next());
			
			System.out.println("");
			
		}
		
	}

}
