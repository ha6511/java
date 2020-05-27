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
		BufferedInputStream		bis		=	null;

		FileOutputStream		fos		=	null;
		BufferedOutputStream	bos		=	null;
		
		try {
			fis	=	new	FileInputStream(fileI);
			bis	=	new	BufferedInputStream(fis);
			
			fos	=	new	FileOutputStream(fileO);
			bos	=	new BufferedOutputStream(fos);
			
			int k = 0 ; // 1 Byte 씩 읽으므로 int로 저장된다.
			
			while (( k = bis.read() ) != -1 ) {
				bos.write(k);
			}
			
			bos.flush();  // 다 쓰고 나서 한번에 밀어 넣어 준다.
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			
				try {
					
					if	(bos != null )  bos.close();
					if 	(fos != null )	fos.close();

					if	(bis != null )  bis.close();
					if 	(fis != null )	fis.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}	
		
		System.out.println("작업 끝");

	
	}
	
	
	

}
