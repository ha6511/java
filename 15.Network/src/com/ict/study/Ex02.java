package com.ict.study;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	
	public static void main(String[] args) {
		
		InputStream			is		=	null;
		InputStreamReader	isr		=	null;
		BufferedReader		br		=	null;
		
		
		try {
			URL	url	=	new URL("https://www.naver.com");
			
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트 : " + url.getPort());
			System.out.println("path : " + url.getPath());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("안내 : " + url.getUserInfo());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				
				br.close();
				isr.close();
				is.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
				
	
	}
}
