
public class Ex12_t {
	public static void main(String[] args) {

		// 3689 초 는 몇시 몇분 몇초 인가?
		int	time	=	3689;
		int	h		=	0;
		int	m		=	0;
		int	s		=	0;
		int	res		=	0;
		
		h	=	time / ( 60 * 60) ;
		res	=	time % (60 * 60);
		m	=	res	/ 60;
		s	=	res % 60;
		
		System.out.println(time + "초는 " + h + "시간 " + m + "분 " + s + "초 이다" );
		
		int	out	=	h * (60*60) + m * 60 + s;
		
		System.out.println(h + "시간 " + m + "분 " + s + "초는 " + out + "초 이다" );
		
	}
}

