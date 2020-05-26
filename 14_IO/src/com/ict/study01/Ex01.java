package com.ict.study01;

import java.io.File;

public class Ex01 {
	
	public static void main(String[] args) {
	
		String	pathname	=	"C:"+File.separator+"study"+File.separator+"util";
		
		File	file		=	new	File(pathname);
		
		String[]	arr		=	file.list();
		
		for (String k : arr) {
			
			File	file2	=	new File(file, k);
			
			if (file2.isDirectory()) {
				System.out.println( file2 +"\t\t" + "<Dir>");
			} else {
				System.out.println( file2 +"\t\t" + file2.length());
			}
		}
	}

}
