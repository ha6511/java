//	2020-05-19

package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DcaPhone dca =  new DcaPhone();
		dca.call();		//	부모
		dca.sms();		//	부모
		dca.dca();		//	자식
		
		Mp3Phone mp3	=	new	Mp3Phone();
		mp3.call();  	//	부모
		mp3.sms(); 		//	부모
		mp3.sound();   	//	자식
		
		//	자식클래스	=	자식클래스() 
		GamePhone game	=	new GamePhone();
		game.call(); 	//	부모
		game.sms(); 	//	부모
		game.play(); 	//	자식
		
		//	부모클래스	=	new 자식클래스() 
		phone	p1	=	new	DcaPhone();
		p1.call();		//	부모 
		p1.sms();		//	부모
		// 자식클래스의 메소드를 못 쓰고 부모 클래스 것만 사용가능 
		//p1.dca();		//	자식
		
		phone	p2	=	new Mp3Phone();
		p2.call();
		p2.sms();
		//p2.sound()
		
		
	}
}
