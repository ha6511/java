package com.ict.study01;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	
	public static void main(String[] args) {
		
		String pathname = "C:"+ File.separator + "study" + File.separator +"util" + File.separator + "io03.txt";

		File	file	=	new	File(pathname);
		
		
		FileInputStream		fis		=	null;
		BufferedInputStream	bis		=	null;
		
		try {
			fis	=	new	FileInputStream(file);
			bis	=	new	BufferedInputStream(fis);
			
//			int	m	=	bis.read();
//			System.out.println( (char)(m)  );
			
//			int	m	=	0;
//			while ((m = bis.read()) != -1) {
//				System.out.print((char)(m));
//			}
			
//			byte[]	b	=	new	byte[(int) file.length()];
//			bis.read(b);
//			for (byte k : b) {
//				System.out.print((char) k);
//			}
			
			byte[]	b	=	new byte[(int) file.length()];
			bis.read(b);
			String	msg	=	new String(b);
			System.out.println(msg);
					
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

			
}
