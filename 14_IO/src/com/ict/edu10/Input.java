package com.ict.edu10;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	
	public static void main(String[] args) {
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		File				file	=	new File(pathname);

		FileInputStream		fis		=	null;
		BufferedInputStream	bis		=	null;
		ObjectInputStream	ois		=	null;
		
		try {

			fis	=	new FileInputStream(file);
			bis	=	new BufferedInputStream(fis);
			ois	=	new ObjectInputStream(bis);
			
			ArrayList<Vo> list = (ArrayList<Vo>) ois.readObject();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
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
