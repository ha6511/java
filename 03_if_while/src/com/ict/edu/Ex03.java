package com.ict.edu;

public class Ex03 {
	
	public static void main(String[] args) {
		//	��ø if�� : if���� ������ ����� ��
		//	����)  if  (���ǽ�1) {
		//				���ǽ�1�� ���϶� ���๮��;
		//			}else	if	(���ǽ�2)	{
		//				���ǽ�1�� �����̰� ���ǽ�2�� ���϶� ���๮�� 
		//			}else	if	(������3)	{
		//				���ǽ�1,2�� �����̰� ���ǽ�3�� ���϶� ���๮��
		//			}else	}
		//				���ǽ�1,2,3�� �����϶� �� ������ 
		//			}

		String	res	=	"";
		//	inf	k1�� ������ 90�̻��̸� A, 80�̻��̸� B,  70�̻��̸� C ������  F
		int	k1	=	75;
		if	(k1 >= 90)	{
			res	=	"A";
		}	else	if	(k1 >= 80){
			res	=	"B";
		}	else	if	(k1 >= 70){
			res	=	"C";
		}	else	{
			res	=	"F";
		}
		System.out.println(k1 +"�� "+ res + "�̴�");
		
		//	char k2 �� �빮������, �ҹ�������, ��������, ��Ÿ���� ���� �Ǻ�
		char	k2	=	'A';
		if	(k2 >= 'A' && k2 <= 'Z')	{
			res	=	"�빮��";
		}	else	if	(k2 >= 'a' && k2 <= 'z')	{
			res	=	"�ҹ���";
		}	else	if	(k2 >= '0' && k2 <= '9')	{
			res	=	"����";
		}	else	{
			res	=	"��Ÿ����";
		}
		System.out.println(k2 +"�� "+ res + "�̴�");
		
		//	char k3�� A,a �̸� ������ī, B.b �̸�  �����, C,c�̸� ĳ����, �������� �ѱ�
		char	k3	=	'a';
		if	(k3=='A'|| k3=='a')	{
			res	=	"������ī";
		}	else	if	(k3=='B'||k3=='b')	{
			res	=	"�����";
		}	else	if	(k3=='C'||k3=='c')	{
			res	=	"ĳ����";
		}	else	{
			res	=	"�ѱ�";
		}
		System.out.println(k3 +"�� "+ res + "�̴�");
		
				
		
		//	menu �� 1�̸� ī���ī�� 3500, 2�̸� ī����� 4000, 3�̸� �Ƹ޸�ī�� 3000, 
		//	4�̸� �����꽺 3500 �̴�, ģ���� 2���� 10000 ���� �Ծ���.
		//	�ܵ��� ���ΰ� (��, ��ī�� 10% ����)
		int		menu	=	2;		//  �ֹ� ��ǰ ��ȣ 
		int		count	=	2;		//	�ֹ�����
		int		input	=	10000;	//	���� �ݾ� 
		
		int		dan		=	0;		//	�ܰ�
		int		cost	=	0;		//	����
		int		change	=	0;		//	�ܵ�
		
		if	(menu== 1)	{
			res	=	"ī���ī";
			dan	=	3500;
		}else	if	(menu==2)	{
			res	=	"ī�����";
			dan	=	4000;
		}else	if	(menu==3)	{
			res	=	"�Ƹ޸�ī��";
			dan	=	3000;
		}else	if	(menu==4)	{
			res	=	"�����꽺";
			dan	=	3500;
		}
		
		cost	=	(int)(dan	* count	* 1.1);  	//  �ΰ��� 10% ���� ���� ��� 
		change	=	input	-	cost;				//	�ܵ� ��� 
		
		System.out.println( res + " " + count +"���� �ΰ��� ���� ������ " + cost + "�� �̰� " + "�ܵ��� " + change + "�� �̴�");
		
	}
}
