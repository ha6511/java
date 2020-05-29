package com.ict.edu03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable {

	ServerSocket	ss;
	
	//	정보를 받기 위한 Stream
	InputStream				in;
	InputStreamReader		isr;
	BufferedReader			br;
	
	OutputStream			out;
	OutputStreamWriter		osw;
	BufferedWriter			bw;

	//	여러명의 접속자 정보를 받아서 처리하기 위한 컬랙션
	ArrayList<Player> list;
	
	
	public Server() {
		
		try {
			
			list = new ArrayList<Player>();
			
			ss	=	new ServerSocket(7788);
			System.out.println("멀티 서버 대기 중 ....");
			new Thread(this).start();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			while (true) {
				
				Socket	s	= ss.accept();
				
				Player player	= new Player(s, this);
				
				list.add(player);
				
				new Thread(player).start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//	리스트 안에 있는 모든 클라이언트에게 메시지 전달하기
	public	void	sendMsg(String msg) {
		
		try {
			msg += System.getProperty("line.separator");
			System.out.println(list.size());
			
			for (Player k : list) {
				k.bw.write(msg);
				k.bw.flush();
			}
			
		} catch (Exception e) {
		}
		
	}
	
	public static void main(String[] args) {
		
		new Server();
	}
}
