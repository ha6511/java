package com.ict.edu04;

import java.io.File;
import java.io.FileWriter;

//	문자스트림 	: 	모든 처리를 2Byte 씩 처리
//		대상 			: 세계 모든 언어로 구성된 문서파일을 출력할 때 적합
//		최상위 클래스 	: Reader(입력), Writer(출력)

//	FileOutputStream	:	1 Byte 처리		write(int)		write(byte[] b)
//	FileWriter			:	2 Byte 처리		write(int)		write(char[] b), write(String str)

public class Ex01_FileWriter {
	
	public static void main(String[] args) {
		
		String 		pathname = "C:"+ File.separator + "study" + File.separator +"util" + File.separator + "io06.txt";
		
		File 		file 	= 	new 	File(pathname);

		FileWriter	fw		=	null;
		
		try {
			
			fw	=	new FileWriter(file);

			//	숫자 
			fw.write(97);
			//	char
			fw.write('c');
			
			//	배열 
			char[]	c	=	{'j','a','v','a'};
			fw.write(c);
			
			//	String
			fw.write("Korea\n");
			fw.write("대한민국\n");
			fw.write("大韓\n");
			fw.write("12345\n");
			
			fw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				
				fw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	
	}

}
