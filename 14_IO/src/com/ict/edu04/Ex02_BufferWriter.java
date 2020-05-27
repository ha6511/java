package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//	BufferWriter : 속도향상과 줄바꾸기 메소드가 존재한다.

public class Ex02_BufferWriter {

	public static void main(String[] args) {
		
		String 			pathname = "C:"+ File.separator + "study" + File.separator +"util" + File.separator + "io07.txt";
		
		File 			file 	= 	new 	File(pathname);

		FileWriter		fw		=	null;
		BufferedWriter	bw		=	null;
		
		try {
			
			fw	=	new FileWriter(file);
			bw	=	new BufferedWriter(fw);

			//	숫자 
			bw.write(97);
			//	char
			bw.write('c');
			
			//	배열 
			char[]	c	=	{'j','a','v','a'};
			bw.write(c);
			
			//	String  : 줄바꾸기 메소드 =>  newLine();
			bw.write("Korea");
			bw.newLine();
			bw.write("대한민국");
			bw.newLine();
			bw.write("大韓");
			bw.newLine();
			bw.write("12345\n");
			
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				
				bw.close();
				fw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}	}
}
