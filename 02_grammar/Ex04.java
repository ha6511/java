class Ex04{
	public static void main(String[] args){

	// ���� : ������(�Ҽ����� ����) < �Ǽ���(�Ҽ����� ����)

	// ������ : byte < short < int < long
	// ������ �⺻�� int

	// �Ǽ��� : floar < double
	// �Ǽ��� �⺻�� double

	// byte :  ������ �� ���� ���� ����
	//         -128 ~ 127 ������ ���ڸ� ���尡��
	byte b1 = 127;
	System.out.println(b1);

	// ������ ����� ����ȴ�.
	// byte b2 = 15 + 120;
	// System.out.println(b2);

	// short : -32768 ~ 32767 ������ ���� ���� 
	short s1 = -32768;
	System.out.println(s1);

	short s2 = 32767;
	System.out.println(s2);

	// int �� long �� ���ڹ����� �ܿ��ʿ� ����.
	// ������ �Ϲ����� ������  int�� ���
	// ����ū ������ ����� ����   long�� ���
	int su1 = 247;
	int su2 = 7777777;
	System.out.println(s1);
	System.out.println(s2);

	// long : int���� �� ���� ������ ������ ����
	//	  �⺻������ ���� �ھ�  �� �Ǵ�  L �� ���δ�. (��������)

	long num1 = 124L;
	System.out.println(num1);

	// ���� �ڷ����� ū�ڷ����� ����Ǵ� ���� ������ ���� �ʴ´�.
	long num2 = 124;
	System.out.println(num2);

	//  ���� su1 ��  num3�� ���� 
	long num3 = su1;
	System.out.println(num3);

	// short s1�� long num4�� ���� 
	long num4 = s1;
	System.out.println(num4);
		
	// short s1�� int su3�� ���� 
	long su3 = s1;
	System.out.println(su3);
		
	char c1 = '��';
	System.out.println(c1);

	int  su4 = c1;
	System.out.println(su4);



	}
}