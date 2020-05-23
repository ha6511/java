package com.ict.edu5;

// 	Tiger 클래스가 있기는 하지만 그냥 추상클래스로 body를 완성하지 않았다.
//	Tiger 를 상속받은 cat은 Tiger가 완성하지 않은 Body 를 완성해야 한다.
class Cat extends Tiger {

	@Override
	public void like() {
		
		System.out.println("그루밍 하기");

	}

}


class Cat2 extends Tiger2 {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		
	}
	
}