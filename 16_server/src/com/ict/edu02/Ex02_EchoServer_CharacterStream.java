package com.ict.edu02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//	에코서버 : 받은 내용을 그대로 돌려준다.

public class Ex02_EchoServer_CharacterStream implements Runnable{
	
	ServerSocket			ss	=	null;
	
	//	정보를 받기 위한 스트림 처리 (문자스트림)
	InputStream				in;
	InputStreamReader		isr;
	BufferedReader			br;
	
	OutputStream			out;
	OutputStreamWriter		osw;
	BufferedWriter			bw;
			

	public Ex02_EchoServer_CharacterStream() {
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("에코 서버 대기 중 ...");
			new Thread(this).start();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	@Override
	public void run() {
		
		try {
			
			while (true) {
				
				Socket	s	= ss.accept();
				
				// 클라이어트가 글자를 보내왔다.
				in = s.getInputStream();
				
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				System.out.println(s.getInetAddress().getHostAddress() +  " : " + msg);
				
				// 클라이어트에게 보내기
				out = s.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				
				msg += System.getProperty("line.separator");
				bw.write(msg);
				bw.flush();				
				
			}
			
		} catch (Exception e) {
			
			System.out.println("run : " + e);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new	Ex02_EchoServer_CharacterStream();
		
	}
}
