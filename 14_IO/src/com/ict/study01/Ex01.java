package com.ict.study01;

import java.io.File;

public class Ex01 {
	
	public static void main(String[] args) {
		
		String	pathname	=	"E:\\study\\util";
		
		File	file		=	new File(pathname);
		
		String	arr[]		=	file.list();
		
		for (String k : arr) {
			
			System.out.println(k);
			
			File	file2	=	new File(pathname, k);
			
			if	(file2.isDirectory())	{
				System.out.println("디렉토리" + file2 );
			}
			else	{
				System.out.println("파일 : " + file2 + "크기 : " + file2.length());
			}
			
		}
		
		
		
	}
	
}
