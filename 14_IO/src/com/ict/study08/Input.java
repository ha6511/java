package com.ict.study08;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {

	
	public static void main(String[] args) {
		
		String	pathname	=	"E:\\study\\util\\school.txt";
		File	file		=	new File(pathname);

		FileInputStream		fis		=	null;
		BufferedInputStream	bis		=	null;
		ObjectInputStream	ois		=	null;
		
		Scanner				sc		=	new Scanner(System.in);
		
		String				outpath	=	"E:\\study\\util\\school2.txt";
		File				file2	=	new File(outpath);
		
		FileWriter 			fw		=	null;
		BufferedWriter		bw		=	null;
		
		String				title	=	null;
		
		try {
			fis	=	new	FileInputStream(file);
			bis	=	new BufferedInputStream(fis);
			ois	=	new	ObjectInputStream(bis);
			
			fw	=	new	FileWriter(file2);
			bw	=	new BufferedWriter(fw);
			
			ArrayList<Vo> list	=	(ArrayList<Vo>) ois.readObject();

			//	순위
			for (int i = 0; i < list.size() ; i++) {
				
				for (int j = 0; j < list.size(); j++) {
					
					if (list.get(i).getLank() < list.get(j).getLank()) {
						
						Vo	vo	=	new Vo();
						
						vo	=	list.get(i);
						
						int lank = vo.getLank()+1;
						
						vo.setLank(lank);
						
						list.set(i, vo);
						
					}
						
					
				}
					
			}

			//	정렬 
			for (int i = 0; i < list.size() - 1; i++) {
				
				for (int j = i; j < list.size(); j++) {
					
					if (list.get(i).getLank() > list.get(j).getLank()) {
						
						Vo vo	=	new	Vo();
						
						vo	=	list.get(i);
						list.set(i, list.get(j));
						list.set(j, vo);
					}
				}
			}

			//	출력 
			
			title	=	"이름\t총점\t평균\t학점\t순위\n";
			System.out.print(title);
			bw.write(title);
			
			for (Vo k : list) {
				
				System.out.print(k.getName() + "\t");
				System.out.print(k.getSum() + "\t");
				System.out.print(k.getAvg() + "\t");
				System.out.print(k.getHak() + "\t");
				System.out.print(k.getLank() + "\n");
				
				bw.write(k.getName() + "\t");
				bw.write(k.getSum() + "\t");
				bw.write(k.getAvg() + "\t");
				bw.write(k.getHak() + "\t");
				bw.write(k.getLank() + "\n");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				bw.close();
				fw.close();
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	
			
	
}
