package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	
	public static void main(String[] args) {
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		File file = new File(pathname);

		
		FileOutputStream		fos		=	null;
		BufferedOutputStream	bos		=	null;
		ObjectOutputStream		oos		=	null;
		
		Scanner	sc	=	new Scanner(System.in);
		
		ArrayList<Vo> list =  new ArrayList<Vo>();
		
		try {
			fos	=	new FileOutputStream(file);
			bos	=	new BufferedOutputStream(fos);
			oos	=	new ObjectOutputStream(bos);
			
			int num = 0;
			
			while (true) {
				
				System.out.println("====== " + ++num + " 번째 ===========");
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("국어 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어 : ");
				int eng = sc.nextInt();
				
				System.out.print("수학 : ");
				int math = sc.nextInt();
				
				Vo vo = new Vo(name, kor, eng, math);
				list.add(vo);
				
				System.out.print("계속 할까요? (Y/N)");
				String res = sc.next();
				
				if (res.equalsIgnoreCase("n")) break;
			}
			
			oos.writeObject(list);
			
			oos.flush();
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				
				System.out.println(e2);
			}
		}
		
	}
	

}
