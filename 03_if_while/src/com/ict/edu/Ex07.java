package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while �� : for �� �� ���� �ݺ���
		//	����1	:
		//		�ʱ��
		//		while(���ǽ�) {
		//			���ǽ��� ���϶� ����;
		//			������;
		//		}
		//		while�� ���� ������ ������ ���ǽ����� ����.
		//
		//	����2	:
		//		�ʱ�� 
		//		while(true) {
		//			if	(�������� ����)		break;
		//			���ǽ��� ���϶� ����;
		//			������;
		//		}
		//		while�� ���� ������ ������ ���ǽ����� ����.
		
		//	0 ~ 10 ���� ���
//		for (int i = 0; i < 11; i++) {
//			System.out.print(i+ " ");
//		}
//		
//		System.out.println("\n****************");
//		
//		int k1=0;		
//		while (k1 < 11) {
//			System.out.print(k1 + " ");
//			k1++;
//		}
//		
//		System.out.println("\n****************");
//		int	k2=0;
//		while(true) {
//			if	(k2 >10)	{
//				break;
//			}
//			k2++;
//			System.out.println(k2 + " ");
//		}

		//	0 - 10 ���� ¦�� ����ϱ�
		System.out.println("\n====== 0 - 10 ���� ¦�� ����ϱ�");
		int i=0;
		while (i<11) {
			if	(i%2==0)	{
				System.out.print(i+"\t");
			}
			i++;
		}
		
		//	0 - 10 ���� Ȧ�� ����ϱ�
		System.out.println("\n====== 0 - 10 ���� Ȧ�� ����ϱ�");
		i=0;
		while (i<11) {
			if	(i%2==1)	{
				System.out.print(i+"\t");
			}
			i++;
		}
		
		//	0 ~ 50 ���� 7�� ��� ����ϱ�  
		System.out.println("\n====== 0 ~ 50 ���� 7�� ��� ����ϱ�");
		i=0;
		while (i<=50) {
			if	(i%7==1)	{
				System.out.print(i+"\t");
			}
			i++;
		}
	
		// a ~ g 
		System.out.println("\n====== a ~ g ������ ����ϱ�");
		char ch = 'a';
		while	(ch<='g')	{
			System.out.print(ch + "\t");
			ch++;
		}
		
		// 5�� ����ϱ� 
		System.out.println("\n====== 5�� ����ϱ�");
		i = 1;
		while (i<10) {
			System.out.println(5 + " * " + i + " = " + 5*i);
			i++;
		}
		
		// ***********
		System.out.println("\n==================");
		i=0;
		while (i< 4)	{
			int j=0;
			while (j<4)	{
				System.out.print("0 ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("\n====== 0 ~ 10 �����հ�");
		
		System.out.println("\n====== 0 ~ 10 Ȧ���� �հ�");
					
		System.out.println("\n====== 0 ~ 10 ¦���� �հ�");

		System.out.println("\n====== 0 ~ 10 Ȧ��, ¦�� �� �հ�");
		
		System.out.println("\n====== 7! ( 7 * 6 * 5 * 4 * 3 * 2 * 1 )");
		

	}
}