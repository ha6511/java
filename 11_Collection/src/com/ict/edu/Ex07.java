package com.ict.edu;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex07 {
	public static void main(String[] args) {

		//	로또번호 : 1 ~ 45, 랜덤, 중복 안됨, 6 자리
		
		HashSet<Integer> lotto = new HashSet<Integer>();
//		TreeSet<Integer> lotto = new TreeSet<Integer>(); // 정렬하고자 할때는 TreeSet 
		
		
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random() * 45) + 1; // 0 ~ 44 를 구하여 1을 1 ~ 45 를 구한다.
			if (!lotto.add(k)) {
				i--;
			}
		}
		System.out.println(lotto);
		
	}
}
