package com.ict.edu;

import java.util.LinkedList;

public class Ex10 {

	public static void main(String[] args) {
		//	Queue (큐) : 인터페이스 : FIFO (First In First Out) => 먼저 들어 온 것이 먼저 나간다.
		//		구현클래스 : linkedList 
		
		LinkedList<String> list = new LinkedList<String>();
		
		// 추가 삽입 : add, addFrist, addLast, offer, offerFirst, offerLast
		System.out.println("====추가 삽입 : add, addFrist, addLast, offer, offerFirst, offerLast========");
		list.add("고길동");
		list.offer("도우너");
		list.addFirst("둘리");
		list.offerFirst("희동이");
		list.addLast("둘리");
		list.addLast("희동이");
		
		System.out.println(list);
		
		//	검색 	 
		System.out.println("====검색==============");
		if (list.contains("둘리")) {
			System.out.println("둘리 위치: " + list.indexOf("둘리")  );
			System.out.println("둘리 마지막 위치: " + list.lastIndexOf("둘리") );
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			System.out.println(list.get(list.indexOf("둘리")));
		}
		
		//	삭제 : remove(Object). remove(index), removeFirst(), removeLast()	 
		System.out.println("====삭제 : remove(Object). remove(index), removeFirst(), removeLast()	 ==");
		list.removeFirst();
		System.out.println(list);
		list.remove("둘리");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
		//	출력 
		System.out.println("====출력 ==");
		for (String k : list) {
			System.out.println(k);
		}
	}
}
