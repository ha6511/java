package com.ict.edu01;

//	추상클래스 : 추상메소드를 가지고 있는 클래스

/*
 * 
abstract class Abs {
	int data = 10000;
	public abstract void printData();
}

lass absTest extends Abs {
	@Override
	public void printData() {
		System.out.println("data1 : " + data);
	}
}

*/

interface Abs {
	int data = 10000;
	public abstract void printData();
}

class absTest implements Abs {
	@Override
	public void printData() {
		System.out.println("data1 : " + data);
	}
}




class AbsTest2 {
	//	추상클래스를 상속받지 않고 바로 객체 생성 
	Abs abs = new Abs() {
		
		@Override
		public void printData() {
			
			System.out.println("data2 : " + data);
			
		}
	};
}

class AbsTest3 {
	public void play() {
		
		new Abs() {

			@Override
			public void printData() {
				System.out.println("data3 : "+ data);
				
			} // 메소드 끝 
			
		}.printData(); //class 끝 
		
	}
}

public class Ex07 {
	
	public static void main(String[] args) {
		
		absTest absTest =  new absTest();
		absTest.printData();
		System.out.println("===================");
		
		AbsTest2 absTest2 =  new AbsTest2();
		absTest2.abs.printData();
	}
}
