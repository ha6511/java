package com.ict.edu01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_LastVersion implements Runnable {

	ServerSocket	ss	=	null;
	
	public Ex03_LastVersion() {

		try {
			ss	=	new ServerSocket(7777);
			System.out.println("서버 대기중");
			
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		
		
		try {
			while (true) {
				
				System.out.println(Thread.currentThread().getName());

				Socket	s	= ss.accept();
				
				System.out.println("ip\t: "+ s.getInetAddress().getHostAddress());
				System.out.println(Thread.currentThread().getName());
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)  {
		
		new Ex03_LastVersion();
		
		System.out.println(Thread.currentThread().getName());
	}	
}
