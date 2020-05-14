// 2020-05-14

package com.ict.edu;

public class Ex07_name {
	public static void main(String[] args) {

			Ex07	ex07	=	new	Ex07();
			
			//	 이름과 가격을 출력하자
			//	private 이므로 직접 가져오지 못한다.
//			System.out.println(ex07.name);
//			System.out.println(ex07.price);
			
			System.out.println(ex07.getName());			
			System.out.println(ex07.getPrice());
			
			//	커피우유를 딸기우유로 변경해서 출력 
			ex07.setName("딸기우유");
			System.out.println(ex07.getName());			
			System.out.println("====================");
			
			Ex07	e2	=	new	Ex07();
			System.out.println(e2.getName());
	}
}
