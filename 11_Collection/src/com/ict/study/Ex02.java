package com.ict.study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 = new HashSet<Boolean>();
		TreeSet<Character> h4 =  new TreeSet<Character>();
		TreeSet<String> h5 =  new TreeSet<String>();
		
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("20");

		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		h1.add(50);
		h1.add(60);
		
		h2.add(10.1);
		h2.add(10.2);
		h2.add(10.3);
		h2.add(10.4);
		h2.add(10.5);
		
		h3.add(true);
		h3.add(false);;
		h3.add(true);
		
		h4.add('j');
		h4.add('a');
		h4.add('v');
		h4.add('a');
		
		h5.add("java");
		h5.add("html");
		h5.add("jsp");
		h5.add("css");
		h5.add("db");
		
		System.out.println("==전체내용보기================");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		
		System.out.println();
		
		System.out.println("==하나씩보기================");
		
		for (Integer k : h1) {
			System.out.print(k+ " ");
		}
		System.out.println();
		for (String k : h5) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		Iterator<Character> it1 = h4.iterator();
		while (it1.hasNext()) {
			Character res = (Character) it1.next();
			System.out.print(res + " ");
		}
		System.out.println();
		
		Iterator<String> ite5 = h5.iterator();
		while (ite5.hasNext()) {
			String res = (String) ite5.next();
			System.out.print(res + " ");;
		}
		System.out.println();
		
	}

	
	
	
			
			
}
