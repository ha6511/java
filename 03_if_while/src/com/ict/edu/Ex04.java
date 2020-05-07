package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		
		//	switch ~ case : if���� ���� ���ǹ�
		//	if ���� ���ǽ��� boolean���̴�. �� �񱳿���, ������, boolean�� ���
		//	wwitch���� ���ڰ��� byte, short, int, char, String �϶� ���
		//
		//		switch (���ڰ�) {
		//		case ���ǰ�1 : ���ڰ��� ���ǰ�1�� ������ ������ ���� ;					
		//			break;
		//		case ���ǰ�2 : ���ڰ��� ���ǰ�2�� ������ ������ ���� ;					
		//			break;
		//		case ���ǰ�3 : ���ڰ��� ���ǰ�3�� ������ ������ ���� ;					
		//			break;
		//		case ���ǰ�4 : ���ڰ��� ���ǰ�4�� ������ ������ ���� ;					
		//			break;
		//		default:
		//			break;
		//		}
		//	break�� ������ break�� ������ ���� ��� ���๮�� ����
		// 	break�� ��Ȱ�� ���� �����ϰ� �ִ� ������ ����� ��Ȱ 
		
		String	result	=	"";
		
		//	char k1�� A �̸� ������ī, B �̸�  �����, C�̸� ĳ����, �������� �ѱ�
		char	k1	=	'A';
		switch (k1) {
		case 'A':	result	=	"������ī";			
					break;
		case 'B':	result	=	"�����";			
					break;
		case 'C':	result	=	"ĳ����";			
					break;
		default:	result	=	"�ѱ�";	
					break;
		}
		System.out.println(k1 +"�� "+ result + "�̴�");
		
		
		//	char k2�� A,a �̸� ������ī, B,b �̸�  �����, C,c�̸� ĳ����, �������� �ѱ�
		char	k2	=	'B';
		switch (k2) {
		case 'A':	
		case 'a':	result	=	"������ī";			
					break;
		case 'B':	
		case 'b':	result	=	"�����";			
					break;
		case 'C':	
		case 'c':	result	=	"ĳ����";			
					break;
		default:	
					result	=	"�ѱ�";	
					break;
		}
		System.out.println(k2 +"�� "+ result + "�̴�");
		
		
		//	int k3�� 1 �Ǵ� 3 �̸� ����, 2�Ǵ� 4�̸� ���� 
		int	k3	=	1;
		switch (k3) {
		case 1:	
		case 3:		result	=	"����";			
					break;
		case 2:	
		case 4:		result	=	"����";			
					break;
		}
		System.out.println(k3 +"�� "+ result + "�̴�");
		
		
		//  String k4 ��  �ѱ� �̸� ���� , �߱��̸� �ϰ�, �Ϻ��̸� ����, �̱��̸� ������ 
		String	k4	=	"�ѱ�";
		switch (k4) {
		case "�ѱ�":
					 result	=	"����";
					 break;
		case "�߱�":
					result	=	"�ϰ�";
					break;
		case "�Ϻ�":
			 		result	=	"����";
			 		break;
		case "�̱�":
			 		result	=	"������"; 
			 		break;
		}
		System.out.println(k4 +" ������ "+ result + "�̴�");
		
		// switch ���� ������ �о����� ������� ���� if  ���� �������
		// int k6�� ������ 90�̻��̸� A, 80�̻��̸� B, 70 �̻��̸� C, �������� F
		int 	k6	=	94;
		switch	((int)(k6/10))	{
			case	10	:
			case	9	:	result	=	"A";	break;	
			case	8	:	result	=	"B";	break;	
			case	7	:	result	=	"C";	break;	
			default		:	result	=	"F";	break;	
		}
		System.out.println(k6 +" ������ "+ result + "�̴�");
		
		
		
	}
}
