
public class Ex15_t {
	public static void main(String[] args) {

		int	su1	=	10;
		int	su2	=	7;
		boolean	result	=	false;
		
		// AND 는 false 를 만나면 결과는 false 이고, 뒤의 조건은 연산하지 않는다.
		result	=	((su1 = su1+2) < su2 ) && (su1 == (su2 = su2 + 5));
		//                  12        7 
		System.out.println("결과 = " + result);		//	false  
		System.out.println("su1 = " + su1); 		//	12
		System.out.println("su2 = " + su2);			//	7
		
	}
}
