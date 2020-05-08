
public class Ex19 {
	public static void main(String[] args) {
		// 삼항연산자 예제 등 
		// int k1가 홀수인지 짝수인지 판별하자
		int k1 = 7;
		String result1 =  ( (k1%2) == 0)  ?  "짝수" : "홀수";
		System.out.println("k1은 "+ result1 +"입니다");
		
		// int k2가 60 이상이면 합격 아니면 불합격
		int k2 = 76;
		String result2 = (k2 >= 60) ? "합격" : "불합격";
		System.out.println("k2는 "+ result2 +"입니다");
		
		
		// chark3 = 대문자 인지 대문자가 아닌지 판별하자 
		int k3 ='H';
		String result3 = ((k3 >= 'A') && (k3 <='Z')) ? "대문자" : "대문자 아님";
		System.out.println("k3는 "+ result3 +"입니다");
		
		// 근무시간이 8시간까지는 시간당 8,590 원이고
		// 8시간 초과한 시간만큼 1.5배 지급한다.
		// 현재근무시간이 10 이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int dan = 8590;
		int limit = 8;
		
		int pay = (time > limit ) ? (int)((limit* dan) + (time-limit) * dan* 1.5): time * dan;
		System.out.println("결과 : "+ pay );
	}
}

