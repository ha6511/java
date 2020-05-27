package com.ict.edu05;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

//OutputStreamWriter : OutputStream => Writer (바이트스트림 => 문자스트림)
//OutputStream => OutputStreamWriter => Writer => BufferedWriter
public class Ex02_OutputStreamWriter {
	
	public static void main(String[] args) {
		
//		System.out.println("Hello World");
		
		OutputStreamWriter	osw		=	null;
		BufferedWriter		bw		=	null;
		
		try {
			
			osw	=	new OutputStreamWriter(System.out);
			bw	=	new BufferedWriter(osw);
			
			bw.write("Welcom 대한민국");
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				osw.close();
				
			} catch (Exception e2) {
				
			}
		}
	}

}
