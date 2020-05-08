
public class Ex20 {
	public static void main(String[] args) {
		// 중첩 삼항연산자 : 삼항연산자가 중첩된 것
		// char k1이 대문자, 소문자, 기타문자 인지 판별하자
		char k1 = 'p';
		String res = (k1 >= 'A' && k1 <='Z')?"대문자":(k1 >= 'a' && k1 <='z')?"소문자":"기타문자";
		System.out.println(k1 + "는 " + res + "이다");
		
		// int k2 가 90 이상이면 A 학점, 80 이상이면 B학점, 나머지는 F학점
		int k2 = 94;
		String res2 = (k2 >= 90) ? "A학점" : (k2 >=80) ? "B학점" : "F학점";
		System.out.println( k2 + "는 " + res2 + "이다");
		
		// int k3 가 1또는 3이면 남자, 2또는 4이면 여자, 나머지는 외국인
		int k3 = 3;
		String res3 = (k3 == 1 || k3 == 3) ? "남자" : (k3 == 2 || k3 == 4) ? "여자" : "외국인";
		System.out.println( k3 + "는 " + res3 + "이다");
		
		// int k4 가 1또는 3이면 남자, 2또는 4이면 여자, 나머지는 외국인
		// 1 또는 2이면 1900년대생, 3또는 4이면 2000년대생 
		int k4 = 4;
		String res4 = 	(k4 == 1 || k4 == 3) ? 
						(k4 == 1) ? "1900년대 태어난 남자" : "2000년대 태어난 남자" :
						(k4 == 2 || k4 == 4) ?
						(k4 == 2) ? "1900년대 태어난 여자" : "2000년대 태어난 여자" :
						"외국인";
		System.out.println( k4 + "는 " + res4 + "이다");
	}
}
