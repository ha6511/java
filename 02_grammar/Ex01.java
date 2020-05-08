class Ex01{
	public static void main(String[] args){
	
	// boolean형 데이터를 저장하고 출력하는 방법
	// 1. 선언 : 자료형 이름;  // 선언은 처음 한번만 하면 된다.
		boolean result;

	// 2. 데이터 저장 : 이름 = 데이타(boolean형);
		result = true;

	// 3. 데이터를 가지고 있는 변수 출력하기
	//    변수를 호출하면 변수가 가지고 있는 데이터가 나온다.
		System.out.println(result);

	// 선언된 변수는 다시 선언하지 않고 사용가능
		result = false;
		System.out.println(result);

	//	result = "true";
	//	System.out.println(result);
	}
}

