package com.ict.study01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02 implements Runnable{

	static	ServerSocket	ss;
	public static void main(String[] args) {
		
		try {
			ss		=	new ServerSocket(7777);
			System.out.println("서버 대기중");
			
			Ex02	ex02	=	new	Ex02();
			Thread	thread	=	new Thread(ex02);
			thread.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		while (true) {
			
			try {
				Socket	s	=	ss.accept();
				System.out.println("ip : "+ s.getInetAddress());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
