//	2020-05-15

package com.ict.edu;

public class Ex11_main {
	
	public static void main(String[] args) {
		
		//	객체생성 
		Ex11	t1	=	new	Ex11("둘리");
		
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getAdd());
		System.out.println("========================");
		
		// 	t1 의 데이터를 변경하자
		//	둘리, 5000, 남극으로 변경하자
		t1.setName("둘리");
		t1.setAge(5000);
		t1.setAdd("남극");
		
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getAdd());
		System.out.println("========================");

		Ex11 t2 = new Ex11();
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		System.out.println(t2.getAdd());
		System.out.println("========================");
		
		Ex11 t3 = new Ex11("장길산", 47, "함경도");
		System.out.println(t3.getName());
		System.out.println(t3.getAge());
		System.out.println(t3.getAdd());
	}
	
}
