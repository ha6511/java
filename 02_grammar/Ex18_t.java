
public class Ex18_t {

	public static void main(String[] args) {
		
		// 삼항연산자 (조건연산자)
		// 형식 : 자료형 저장변수 = 조건식 ? 참일때 실행문장 : 거짓일때 실행문장 
		// 조건식에 들어가는 연산 : boolean형 => 비교연산, 놀히연산, boolean
		// 저장변수, 참일때 실행결과, 거짓일때 실행결과 모두 같은 자료형이어야 한다.
		
		String	str	=	true ? "합격" : "불합격";
		System.out.println("결과 : "+ str);
		
		// 평균이 90이상이면 A학점, 아니면 B학점 
		double avg = 87.6;
		str = (avg >= 90 ? "A학점" : "B학점"); System.out.println(avg + "는 " + str + "입니다."); 
		
	}

}
