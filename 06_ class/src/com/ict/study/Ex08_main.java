package com.ict.study;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Ex08_main {
	
	public static void main(String[] args) {
		
		Ex08[] arr	=	new Ex08[4];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = new Ex08();
			
			switch (i) {
			case 0 : arr[i].setName("커피");  
					 arr[i].setPrice(1000);
					 break;
			case 1 : arr[i].setName("이온");  
					 arr[i].setPrice(1500);
					 break;
			case 2 : arr[i].setName("탄산");  
					 arr[i].setPrice(1700);
					 break;
			case 3 : arr[i].setName("과일");  
					 arr[i].setPrice(2000);
					 break;
			}
		}

		System.out.println("< 메 뉴 판 >");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + " (" + arr[i].getPrice() +"원)");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("금액을 투입하세요 >> ");
		int	input	=	sc.nextInt();

		int	output 	= 	0;
	
		if	(input < 1000)	{
			System.out.println("금액이 부족합니다.\n\n");
		}	else	{
			
			System.out.println("\n\n** 구매 가능 메뉴 **");
			for (int i = 0; i < arr.length; i++) {
				if (input >= arr[i].getPrice()) {
					arr[i].setOn(true);
					System.out.print(arr[i].getName()+"\t");
				}	else	{
					arr[i].setOn(false);
				}
			}
			
			System.out.println();
			System.out.print("\n원하는 메뉴를 선택하세요 >> ");
			String menu = sc.next();
			
			boolean find = false;
			for (int i = 0; i < arr.length; i++) {
				if	(arr[i].getName().equals(menu))	{
					find = true;
					if	(!arr[i].isOn())	{
						System.out.println("선택할 수 없는 메뉴입니다.");
						output = input;
						break;
					}	else	{
						output = input - arr[i].getPrice(); 
						break;
					}
				}
			}
			
			if	(find==false)	{
				System.out.println("메뉴선택이 잘못 되었습니다.\n");
				output = input;
			}
		}
		
		System.out.println("\n잔돈 ==> " + output);
		
	}
}
