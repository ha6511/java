class Ex14{
	public static void main(String[] args)	{
	
		// 비교연산지 : >, <, >=, <=, ==, !=, 
		// 비교연산자를 사용할 수 있는자료형 : char. 정수, 실수 
		// boolean형 과 String은 비교연산을 하지 않는다.
		// 연산 결과는 무조건 boolean형 (true, false) => 조건식에 사용된다.

		int	su1	=	90;
		int	su2	=	80;

		char	su3	=	'a';
		char	su4	=	'A';

		double	su5	=	97.0;
		double	su6	=	78.0;

		boolean result	=	false;

		result		=	su1 > su2;
		System.out.println("결과 : " + result);

		result		=	su3 > su4;
		System.out.println("결과 : " + result);

		result		=	su5 > su6;
		System.out.println("결과 : " + result);

		result		=	su1 > su3;
		System.out.println("결과 : " + result);

		result		=	su1 > su5;
		System.out.println("결과 : " + result);

		result		=	su3 == su5;
		System.out.println("결과 : " + result);
	}
}