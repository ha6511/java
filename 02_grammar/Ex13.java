class Ex13{
	public static void main(String[] args) {

		// 2시간 40분 30초는 몇초인가?
		int	h	=	2;
		int	m	=	40;
		int	s	=	30;

		int	result	=	h * 60 * 60 + m * 60 + s;

		System.out.println(h + "시간 " + m + "분 " + s + "초는 " + result + "초 입니다."); 
	}
}
