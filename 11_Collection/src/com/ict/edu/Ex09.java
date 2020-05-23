package com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.lang.model.element.Element;

public class Ex09 {

	public static void main(String[] args) {
		
		//	List 인터페이스 : 배열과 흡사한 구조, 
		//		-. 삽입, 삭제, 추가가 자유롭다.
		//		-. 크기를 미리 정하지 않아도 된다.
		
		//	관련 클래스 : Stack, ArryList, Vector(동기화 해주는 것, 온라인 예약등에서 사용)
		
		//	ArrayList : 멀티스레드 동기화 지원하지 않음 
		//	Vector	  :	멀티스레드 동기화 지원함
		//	ArryList 와 Vector 사용법은 같다.
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 추가, 삽입 : add
		list.add("박찬호");
		list.add("손홍민");
		list.add("류현진");
		list.add(1, "기성용");
		
		System.out.println(list);
		System.out.println("================");
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("기성용");
		vector.add("류현진");
		vector.add("손홍민");
		vector.add(2, "박찬호");
		
		System.out.println(vector);
		System.out.println("================");
		
		if (list.contains("박찬호")) {
			System.out.println(list.lastIndexOf("박찬호") + " 번째 위치");
			System.out.println(list.get(2));
			System.out.println(list.lastIndexOf("박찬호") + " 번째 위치");
			System.out.println(list.set(0,  "박세리"));  // 박찬호 대신 박세리로 변경 
			list.set(0,  "박세리");
			// search, elementAt. firstElement, lastElement  : List 없음 
			// elementAt. firstElement, lastElement  : Vector 에는 존재 
			
		} else {
			System.out.println("존재하지 않음");
		}
		System.out.println("================");
		
		System.out.println(list);
		
		System.out.println("====vector============");

		if (vector.contains("기성용")) {
			System.out.println("기성용위치 : " + vector.indexOf("기성용"));
			System.out.println(vector.get(2));
			System.out.println(vector.lastIndexOf("기성용")+"번째 위치");
			System.out.println(vector.elementAt(1));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		} 
		System.out.println("====vector= 치환===========");
		vector.set(1,"차두리");
		vector.setElementAt("박세리", 2);
		System.out.println(vector);

		System.out.println("====vector= 크기===========");
		System.out.println(list.size());
		System.out.println(vector.size());
		
		System.out.println("====vector= 출력===========");
		for (String k : vector) {
			System.out.println(k);
		}
		System.out.println("--------------------------- ");
		
		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(res);
			
		}
	}

}
