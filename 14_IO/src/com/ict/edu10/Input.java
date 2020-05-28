package com.ict.edu10;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	
	public static void main(String[] args) {
		
		String 				pathname 	= 	"C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		File				file		=	new File(pathname);

		FileInputStream		fis			=	null;
		BufferedInputStream	bis			=	null;
		ObjectInputStream	ois			=	null;
		
//		String 				savepath 	= 	"E:" + File.separator + "study" + File.separator + "util" + File.separator + "io15.txt";
//		File				file2		=	new File(savepath);
//		
//		FileWriter			fw			=	null;
//		BufferedWriter		bw			=	null;
		
		try {

			fis	=	new FileInputStream(file);
			bis	=	new BufferedInputStream(fis);
			ois	=	new ObjectInputStream(bis);
			
//			fw	=	new FileWriter(file2);
//			bw	=	new	BufferedWriter(fw);
			
			
			
			
			ArrayList<Vo> list = (ArrayList<Vo>) ois.readObject();
//
//			System.out.println("이름\t총점\t평균\t학점");
//			
			for (Vo k : list) {
				
				System.out.print(k.getName() + "\t");
				System.out.print(k.getSum() + "\t");
				System.out.print(k.getAvg() + "\t");
				System.out.println(k.getHak() );
				
//				bw.write(k.getName() +"\t");	
//				bw.write(k.getSum() + "\t");
//				bw.write(k.getAvg() + "\t");
//				bw.write(k.getHak() + "\n");
			
			
			}
			
//			bw.flush();
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				
//				fw.close();
//				bw.close();
				
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		
	}

}
