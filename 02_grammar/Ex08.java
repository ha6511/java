class Ex08{
	public static void main(String[] args){
		// 참조자료형 : 클래스를 자료형으로 사용한다.
		// String 클래스 : 문자열처리하는 기능흥 가지고 있는 클래스
		// String 를래스는 기본자료형은 아니다.
		// String 클래스를 자료형처럼 사용하기 위해서는 반드시 "" 를 사용 해야 한다.

		String str = "Hello";
		System.out.println(str);


		// String + 연산 : String 에서 + 는 덧셈이 아니다. 문자 연결자 이다.
		// + 연산을 하면 결과는 무조건  String 이다.

		str = "10000" ;
		int su = 10000;

		System.out.println(str + 10);
		System.out.println(su + 10);

		int su1 = 20;
		int su2 = 4;
		System.out.println(su1+su2);
		System.out.println("결과:"+su1+su2);
		System.out.println("결과:"+(su1+su2));

		int su3 = su1 + su2;
		System.out.println("결과:"+su3);
	}
}