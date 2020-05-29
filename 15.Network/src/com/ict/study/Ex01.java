package com.ict.study;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	
	public static void main(String[] args) {
		
		
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("이름 : "+ address.getHostName());
			System.out.println("주소 : "+ address.getHostAddress());
			System.out.println("toString0 : "+ address.toString());
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
