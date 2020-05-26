package com.ict.study01;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	
	public static void main(String[] args) {
		
		String	pathname1	=	"C:"+File.separator +"study"+File.separator + "util"+File.separator +"test.txt";

		File	file1		=	new File(pathname1);
		
		try {
			boolean		res	=	file1.createNewFile();
			if	(res)	{
				System.out.println(pathname1 + " 파일생성 성공");
			}	else	{
				System.out.println(pathname1 + " 파일생성 실패");
			}
			
		} catch (IOException e) {
			System.out.println(pathname1 + " 파일 경로가 틀렸습니다.");
		}
		
		
		System.out.println("===================");
		
		String	pathName2	=	"C:"+File.separator +"study"+File.separator + "util"+File.separator +"test";
		
		File	file2		=	new	File(pathName2);
		
		boolean		res2	=	file2.mkdir();
		
		if (res2) {
			System.out.println(pathName2 + " 디렉트리 생성 성공");
		} else {
			System.out.println(pathName2 + " 디렉트리 생성 실패");
		}
	
		System.out.println("===================");
		
		String	pathname3	=	"C:"+File.separator +"study"+File.separator + "util"+File.separator +"test.txt";

		File	file3		=	new File(pathname3);
		
		boolean		res3	=	file3.delete();
		if	(res3)	{
			System.out.println(pathname3 + " 파일삭제 성공");
		}	else	{
			System.out.println(pathname3 + " 파일삭제 실패");
		}
			
		System.out.println("===================");
		
		String	pathname4	=	"C:"+File.separator +"study"+File.separator + "util"+File.separator +"test";
		
		File	file4		=	new	File(pathname4);
		
		boolean		res4	=	file4.delete();
		
		if (res4) {
			System.out.println(pathname4 + " 디렉토리 삭제 성공");
		} else {
			System.out.println(pathname4 + " 디렉토리 삭제 실패");
		}
		
	}

	
	
	
}
