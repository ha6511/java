package com.ict.edu;

import java.util.Arrays;

public class Ex03_t {
	public static void main(String[] args) {
		
		// 배열 정렬하기 
		int[] su = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		int	tmp;
		
		for (int i = 0; i < su.length-1; i++) {
			for (int j = i+1; j < su.length; j++) {
				if (su[i] > su[j])	{
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		
		for (int k : su) {
			System.out.print(k + "\t");
		}
		
		System.out.println("\n***********************");
		
		int[] su2 = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		Arrays.sort(su2);
		
		for (int k : su2) {
			System.out.print(k + "\t");
		}

	}
}
