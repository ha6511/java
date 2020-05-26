package com.ict.study01;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
	
	public static void main(String[] args) {
		
		String 	pathname 	= 	"C:"+ File.separator + "study" + File.separator +"util" + File.separator + "io03.txt";

		File	file		=	new	File(pathname);
		
		FileOutputStream		fos		=	null;
		BufferedOutputStream	bos		=	null;
		
		try {
			
			fos	=	new FileOutputStream(file, true);
			bos	=	new	BufferedOutputStream(fos);
			
			bos.write('\n');
			bos.write('a');
			bos.write('b');
			bos.write('c');
			
			byte[] b = {'z','z','z'};
			bos.write(b);
			
			String str = "\nHello";
			byte[] c = str.getBytes();
			bos.write(c);
			
			bos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		

	}

}
