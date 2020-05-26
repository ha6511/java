package com.ict.edu;

import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("손성은");
		list1.add("우아원");
		list1.add("정복교");
		list1.add("정우철");
		list1.add("정환찬");
		list1.add("하중구");
		
		list2.add("김설화");
		list2.add("서준수");
		list2.add("송영석");
		list2.add("유혜원");
		list2.add("이수연");
		list2.add("임건우");
		list2.add("장형욱");
		list2.add("추형석");
		list2.add("창원홍");
		
		
		for (int i = 0; i < 3; i++) {
			String team = "";
			for (int j = 0; j < 2; j++) {
				int k = (int)(Math.random()*list1.size());
				String name = list1.get(k);
				team += name+", " ;
				list1.remove(name);
			}
			System.out.println(i+1+"조 : "+ team);
		}
		System.out.println("==================");
		
		for (int i = 0; i < 3; i++) {
			String team = "";
			for (int j = 0; j < 3; j++) {
				int k = (int)(Math.random()*list2.size());
				String name = list2.get(k);
				team += name+", " ;
				list2.remove(name);
			}
			System.out.println(i+1+"조 : "+team);
		}
	}
}











