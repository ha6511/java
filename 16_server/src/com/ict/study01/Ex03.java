package com.ict.study01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03 implements Runnable{

	ServerSocket	ss	=	null;

	public Ex03() {
		
		try {
			
			ss	=	new ServerSocket(7777);
			System.out.println("서버 대기중");
			
			new Thread(this).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		try {
			Socket	s	=	ss.accept();
			
			System.out.println("ip : " + s.getInetAddress().getHostAddress());
			System.out.println(Thread.currentThread().getName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Ex03();
	}
	
	

}
