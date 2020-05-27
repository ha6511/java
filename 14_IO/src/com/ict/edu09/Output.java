package com.ict.edu09;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Output {
	
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io13.txt";
		File file = new File(pathname);

		FileOutputStream		fos	=	null;
		BufferedOutputStream	bos	=	null;
		ObjectOutputStream		oss	=	null;
		
		try {
			
			fos = new FileOutputStream(file);
			bos	=	new	BufferedOutputStream(fos);
			oss	=	new	ObjectOutputStream(bos);
			
			Vo	vo	=	new Vo("태권브이", 24, 190.1, true);
			oss.writeObject(vo);
			oss.flush();
			
			
		} catch (Exception e) {

		} finally {
			try {
				oss.close();
				bos.close();
				fos.close();
				
				
			} catch (Exception e2) {
			}
		}
		
		
	}

}
