
public class Ex16_t {
	public static void main(String[] args) {

		int	su1	=	10;
		int	su2	=	7;
		boolean	result	=	false;

		// OR �� ���� ������ true �̸� ���� ������ �������� �ʴ´�.
		result	=	((su1 = su1+2) > su2 ) || (su1 == (su2 = su2 + 5));
		//			      9          7 	
		System.out.println("��� = " + result);		//	true
		System.out.println("su1 = " + su1);			//	9
		System.out.println("su2 = " + su2);			//	7
		
		
	}
}
