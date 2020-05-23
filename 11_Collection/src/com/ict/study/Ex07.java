package com.ict.study;

import java.util.HashSet;

public class Ex07 {

	public static void main(String[] args) {
		
		//		로또번호 : 1 ~ 45, 랜덤, 중복 안됨, 6 자리
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random() * 45) + 1;
			if (! lotto.add(k)) {
				--i;
			}
		}
		System.out.println(lotto);
		
		
	}
	
	
	
}
