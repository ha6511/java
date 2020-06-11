package com.ict.study08;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		
		String	pathname	=	"C:\\study\\util\\school.txt";
		File	file		=	new File(pathname);
		
		FileOutputStream		fos		=	null;
		BufferedOutputStream	bos		=	null;
		ObjectOutputStream		oos		=	null;
		
		Scanner					sc		=	new Scanner(System.in);
		
		try {
			
			fos	=	new FileOutputStream(file);
			bos	=	new BufferedOutputStream(fos);
			oos	=	new ObjectOutputStream(bos);
			
			ArrayList<Vo> list = new ArrayList<Vo>();
			
			while (true) {
				
				System.out.print("이름 : ");
				String	name	=	sc.next();
				if	(name.trim().equalsIgnoreCase("q"))	break;
				
				System.out.print("국어 : ");
				int		kor		=	sc.nextInt();
				
				System.out.print("영어 : ");
				int		eng		=	sc.nextInt();
				
				System.out.print("수학 : ");
				int		math	=	sc.nextInt();
				
				Vo	vo	=	new Vo(name, kor, eng, math);
				
				list.add(vo);
			}
			
			oos.writeObject(list);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				System.out.println("***** The End *****");
				oos.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

	
}
