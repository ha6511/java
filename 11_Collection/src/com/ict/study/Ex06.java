package com.ict.study;

import java.util.HashSet;

public class Ex06 {
	
	public static void main(String[] args) {
		
		String[] str = {"java", "JAVA", "Java", "자바"};
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();

		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1);
		
		set2.addAll(set1);
		System.out.println(set2);
		
		
		
	}

}
