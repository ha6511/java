package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02_set {
	public static void main(String[] args) {
		//	 Set 인터페이스 구현한 클래스 : HashSet, TreeSet
		//	 특정 : 중복안됨, 정렬안됨 (단, TreeSet은 항상 오름차순 상태)
		
		//	컬렉션 생성 :  HashSet<제네닉=객체타입=클래스> 참조변수 = new HashSet<제네닉>() ;
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 =  new HashSet<Boolean>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		TreeSet<String> h5 = new TreeSet<String>();
		
		//	해당 컬렉션에 객체 넣기 (일반 객체로 만든 후 넣어야 한다.)
		//	1. 객체 만들기
		Integer k1 = new Integer(10); // 박싱
		Integer k2 = new Integer("20"); 
		
		//	2. 컬랙션에 넣기
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		h1.add(50);		//	오토박싱 : 자료형 int 10 을 자동으로 객체로 만든다.
		h1.add(60);
		
		// Double 넣기
		Double	d1	=	new	Double(10);
		Double	d2	=	new Double("20");
		
		h2.add(d1);
		h2.add(d2);
//		h2.add(10); 	//	오토박싱은 무조건 자료형이 맞아야 들어간다.  
		h2.add(10.0);
		
		h3.add(true);
		h3.add(false);
		h3.add(true);	//	오류는 나지 않지만 중복된 값은 들어 가지 않는다. (중복허용 안함)
		
		h4.add('j');
		h4.add('a');
		h4.add('v');
		h4.add('a');	//	오류는 나지 않지만 중복된 값은 들어 가지 않는다. (중복허용 안함)
		
		h5.add("java");
		h5.add("html");
		h5.add("jsp");
		h5.add("css");
		h5.add("db");
		
		System.out.println("=======================");
		
		System.out.println("== 전체 내용 보기 ==");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		
		System.out.println("=======================");
		
		System.out.println("== 하나씩 보기<개선FOR> ==");

		for (Integer k : h1) {
			System.out.print(k+" ");
		}
		System.out.println();
		//	언박싱 : 객체를 일반적으로 사용하는 자료형으로 변환 시킨다.
		for (int k : h1) {
			System.out.print(k+" ");
		}
		System.out.println();

		for (char k : h4) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		for (String k : h5) {
			System.out.print(k+ " ");
		}
		System.out.println();
		
		System.out.println("== 하나씩 보기<Iterator> ==");		
		Iterator<Double> it = h2.iterator();
		
		//	hashNext() 다음 객체가 존재하면  True
		while (it.hasNext())	{
			// 다음객체를 꺼내기 위해서 이동하고 반환한다.
			double res = (double)  it.next();
			System.out.print(res + " ");
		}
		
		System.out.println();
		
		Iterator<Character> ic = h4.iterator();
		while (ic.hasNext()) {
			char res = (char) ic.next();
			System.out.print(res + " ");
		}
		System.out.println();
		
		Iterator<String> is = h5.iterator();
		while (is.hasNext()) {
			String res = (String) is.next();
			System.out.print(res + " ");
		}
		
		
	}
}
