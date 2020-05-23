package com.ict.edu;

public class Ex01_Collection {
	
	//	제네닉과 컬렉션 (자료구조)
	//	제네닉 : 컬렉션이 어떤 객체들로 이루어져 있는지 표시하는 객체 타입(클래스)을 말한다.
	//			 객체들이 어떤 타입으로 되어 있는지 표시 (변수로 말하면 자료형)
	//	컬렉션 : 객체들을 모아서 관리하는 인터페이스들을 말한다.
	
	//	API : 	<T> => 객체타입 ,  <E> => 요소, 컬렉션 안에 존재하는 객체하나를 뜻한다.
	//			Map 형식 : <K,V> => Key(키값), Value(데이터값)
	//						Key와 Value는 1:1 대응 => Key를 호출하면 Value가 나온다.
	//	형식 : 컬렉션<제네닉>
	
	//	최상위 컬렉션은 Collection<E> ,  Map<K,V>
	//	Collection<E> 을 상속받은 자식들 : Set<E> , List<E>, Queue<E>
	
	//	Commection 의 주요 메소드 
	//	add(E e) : boolean	
	//		=> 해당 컬렉션에 객체 추가 , 성공하면 true, 실패하면 false
	//		   보통은 리턴값을 잘 받지 않는다.
	//	addAll(Collection<? extends E> c) : boolean	
	//		=> 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가 
	//	clear() : void 
	//		=> 모든 요소 삭제 
	//	contains(Object o) : boolean
	//		=>	해당 컬렉션에 인자로 들어온 객체가 존재하면 true, 존재하지 않으면 false
	//	isEmpty() : boolean
	//		=>	해당 컬렉션이 비어 있으면 true, 비어 있지 않으면  false
	//	iterator() : Iterator<E>
	//		=>	컬렉션 안에 존재하는 객체들을 순서대로 접근하기 위한  Iterator 객체 반환
	//			컬렉션 안에 존재하는 객체들를 하나씩 꺼내서 작업할때 사용 (이터레이터)
	//	remove(Object o) : boolean
	//		=>	인자로 들어오는 객체 삭제. 성공하면 true, 실패하면 false
	//	size() : int
	//		=>	컬렉션 안에 존재하는 객체의 수 (for문에서 사용)
	//	toArray() : Object[]
	//		=>	컬렉션을 배열로 만들때 사용한다. 
	//	 
	
	
}
