
public class Ex15_t {
	public static void main(String[] args) {

		int	su1	=	10;
		int	su2	=	7;
		boolean	result	=	false;
		
		// AND �� false �� ������ ����� false �̰�, ���� ������ �������� �ʴ´�.
		result	=	((su1 = su1+2) < su2 ) && (su1 == (su2 = su2 + 5));
		//                  12        7 
		System.out.println("��� = " + result);		//	false  
		System.out.println("su1 = " + su1); 		//	12
		System.out.println("su2 = " + su2);			//	7
		
	}
}
