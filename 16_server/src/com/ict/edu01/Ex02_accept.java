package com.ict.edu01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02_accept implements Runnable {
	
	static	ServerSocket	ss;
	
	public static void main(String[] args)  {
		
		
		try {
			
			ss		=	new ServerSocket(7777);
			System.out.println("서버 대기중");
			
			Ex02_accept			ex02	=	new Ex02_accept();
			Thread			thread	=	new Thread(ex02);
			thread.start();				
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
	}

	@Override
	public void run() {
		
		while (true) {
			
			try {
				Socket	s	= ss.accept();
				System.out.println("ip\t: "+ s.getInetAddress().getHostAddress());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
