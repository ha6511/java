package com.ict.edu09;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Input {

	
	public static void main(String[] args) {
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io13.txt";
		File file = new File(pathname);
		
		FileInputStream		fis	=	null;
		BufferedInputStream	bis	=	null;
		ObjectInputStream	ois	=	null;
		
		try {
			fis	=	new FileInputStream(file);
			bis	=	new BufferedInputStream(fis);
			ois	=	new ObjectInputStream(bis);
			
			Vo vo = (Vo) ois.readObject();
			
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
		
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
