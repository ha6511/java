package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {


	public static void main(String[] args) {
		
		System.out.println("작업 시작");

		String pathnameI = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "video.mp4";
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "비디오.mp4";

		File	fileI	=	new	File(pathnameI);
		File	fileO	=	new	File(pathname2);
		
		FileInputStream			fis		=	null;
		FileOutputStream		fos		=	null;
		
		BufferedInputStream		bis		=	null;
		BufferedOutputStream	bos		=	null;
		
		try {
			fis	=	new	FileInputStream(fileI);
			bis	=	new	BufferedInputStream(fis);
			
			fos	=	new	FileOutputStream(fileO);
			bos	=	new BufferedOutputStream(fos);
			
			int k = 0 ;
			
			while (( k = bis.read() ) != -1 ) {
				bos.write(k);
			}
			
			bos.flush();
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			
				try {
					if 	(fos != null )	fos.close();
					if	(bos != null )  bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}	
		
		System.out.println("작업 끝");

	
	}
	
	
	

}
