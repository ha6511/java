class Ex10{
	public static void main(String[] args){
	
		// 증감연산자 : 1증가 또는 1감소 하는 연산자
		// char,  정수형, 실수형에 사용가능
		// ++ 변수 : 현재값을 먼저 1증가하고 나머지 실행
		// 변수++  : 현재값 가지고 연산 후 나중에 1증가 

		int su1 = 10;
		int su2 = 10;

		System.out.println(++ su1);
		System.out.println(su2 ++);

		System.out.println(su1);
		System.out.println(su2);
	}
}