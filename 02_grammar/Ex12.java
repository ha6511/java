class	Ex12{

	public static void main(String[] args) {

		// 3989 초 는 몇시 몇분 몇초 인가?
		// 1시간 = 3600초 ( 60분 * 60초)
		// 시간 = 3989 / 3600 = 1
		// 나머지 3989 % 3600 = 389


		int	time	=	3689;
		int	h	=	0;
		int	m	=	0;
		int	s	=	0;
		int	res	=	0;	// 나머지 
		
		// 시간 구하기 = 몫 (3600 으로 나눈 몫이 시간)
		h	=	time / 3600;   // int(몫) = int / int
		
		// 나머지 구하기 
		res	=	time % 3600;

		// 분 구하기 = 몫 
		m	=	res / 60;

		// 초 구하기 = 나머지 
		s	=	res % 60;

		// 출력하기
		System.out.println(time + "초는 " + h + "시 " + m + "분 " + s + "초");

	}
}