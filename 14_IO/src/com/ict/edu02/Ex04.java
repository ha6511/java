package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		
		String	pathname	=	"C:"+ File.separator +"study"+ File.separator +"util"+ File.separator +"IO2.txt";
		
		File	file		=	new File(pathname);
		
		FileOutputStream	fos		=	null;
		
		try {
			fos = new FileOutputStream(file);
			
			String	str	=	"전화 : 010-3714-8492\n" +
							"이름 : 하중구\n" +
							"나이 : 56";
			
			byte[]	b	=	str.getBytes();
			fos.write(b);
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
