package com.ict.edu;

public class Ex02 {

	//	2020-05-15
		
	//	String 클래스 주요매소드
	public static void main(String[] args) {
		String str = "ICT인재개발원 2강의장";
		
		//	1. charAt(int index) : char
		//	위치정보가 숫자로 들어 오면 해당 위치의 글자를 반환한다.
		System.out.println("1. charAt(int index) : char");

		char c1	=	str.charAt(5);
		System.out.println(c1); // ==> 5번째 위치정보는 개
		
		//	모두 대문자로 만들자 ( 대문자와 소문자의 차이는 32 이다.)
		String	str2 = "대한민국 I Love You 123";
		for (int i = 0; i < str2.length(); i++) {
//			System.out.println(i +":" + str2.charAt(i));
			char c2 = str2.charAt(i);
			if ((c2 >= 'a') && (c2 <= 'z'))	{
				c2 -= 32;
				System.out.print(c2);
			}	else	{
				System.out.print(c2);
			}	
		}
		
		System.out.println();
		System.out.println("===================");
		System.out.println("2. concat(String str) : String");		
		//	2. concat(String str) : String
		//	들어온 문자열을 현재 문자열과 합친다.
		
		String	str3	= 	"대한민국";
		String	str4	=	"KOREA";
		String	result	=	str3.concat(str4);
		System.out.println(result);
		System.out.println(str3+str4);
		
		//  3. equals(Object anObject) : boolean
		//	들어온 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별)
		System.out.println("===================");
		System.out.println("3. equals(Object anObject) : boolean");
		
		String str5 = "korea";
		String str6 = "KOREA";
		if (str5.equals(str6))	{
			System.out.println("같다");
		}	else	{
			System.out.println("다르다");
		}
		
		//	4. equalsIgnoreCase(String anotherString) : boolean
		//	들어온 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구뱔 없음)
		System.out.println("===================");
		System.out.println("4. equalsIgnoreCase(String anotherString) : boolean");
		
		if (str5.equalsIgnoreCase(str6))	{
			System.out.println("같다");
		}	else	{
			System.out.println("다르다");
		}
		
		//	5. format(String format, Object... args) : static String
		//	형식을 지정하고 형식애 맞춰서 생성한다.
		System.out.println("===================");
		System.out.println("5. format(String format, Object... args) : static String");
		
		String	str7	=	"ICT 인재 개발원";
		String	res		=	String.format("%s", str7);
		System.out.println(res);

		//	남는 자리는 비워 둔다.
		res = String.format("%30s", str7);
		System.out.println(res);
		
		//	모자란 자리는 상관하지 않음 
		res = String.format("%6s", str7);
		System.out.println(res);
		
		//	6. getBytes() : byte[]
		//	해당 문자열을 byte[]로 변환시킨다.
		//	보통 입출력 할때 사용한다. (대소문자, 숫자만 가능, 영어 이외의 글자는 안됨)
		System.out.println("===================");
		System.out.println("6. getBytes() : byte[]");
		
		String	str8 = "java";
		byte[]	b	=	str8.getBytes();
		
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}
		System.out.println();
		
		//	반대로 해당 byte[]을 문자열로 만들자 
		String	str9 = new String(b);
		System.out.println(str9);
		
		//	7. indexOf(int ch), indexOf(String str) :  int	
		//	char 나 String이 들어 오면 해당문자열의 char 나 String의 위치값을 알려준다.
		//	찾는 문자열이 없으면 -1
		System.out.println("===================");
		System.out.println("7. indexOf(int ch), indexOf(String str) :  int	");

		String	str10	=	"BufferedReader";
		
		//	r의 위치 값을 찾아라.
		int	k1	=	str10.indexOf('r');
		System.out.println(k1);
		
		k1	=	str10.indexOf('k');
		System.out.println(k1);

		k1	=	str10.indexOf("er");
		System.out.println(k1);
		
		//	7. indexOf(int ch, int fromIndex) , indexOf(String str, int fromIndex) : int
		//	여기서 int fromIndex 란 시작위치를 말한다.
		//	2번째, 3번째 문자나 글자를 찾기 위함이다.
		System.out.println("===================");
		System.out.println("7. indexOf(int ch, int fromIndex) , indexOf(String str, int fromIndex) : int");
		
		//	위에서 'r'의 위치값은 5이다. 6부터 다시 'r'을 찾으면 두번째 'r'을 찾을 수 있다.
		k1 = str10.indexOf('r',6);
		System.out.println(k1);
		
		k1 = str10.indexOf('r', str10.indexOf('r')+1);
		System.out.println(k1);

		k1 = str10.indexOf("er", str10.indexOf("er")+1);
		System.out.println(k1);

		//	8. lastIndexOf(int ch), lastIndexOf(String str) : int 
		//	마지막 문자나 문자열을 찾을 때 사용 
		System.out.println("===================");
		System.out.println("8. lastIndexOf(int ch), lastIndexOf(String str) : int");
		
		k1 = str10.lastIndexOf('d');
		System.out.println(k1);
		
		k1 = str10.lastIndexOf("er");
		System.out.println(k1);
		
		//	9. length() : int
		//	해당 문자열의 길이를 구해 준다. (for문에 많이 사용된다.)
		//	1번 부터 (index가 아님)
		System.out.println("===================");
		System.out.println("9. length() : int");
		
		String	str11	=	"abcABC123가나다";
		k1 = str11.length();
		System.out.println("길이 : " + k1);
		
		//	10. replace(char oldChar, char newChar), replace(String oldStr, String newStr) :  String
		//	새로운 문자나 문자열을 받아서 치환하기 
		System.out.println("===================");
		System.out.println("10. replace(char oldChar, char newChar), replace(String oldStr, String newStr) :  String");
		
		String	str12 	=	"대한민국";
		String	str13	=	str12.replace("대한민국", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		
		str12	=	str12.replace("한", "한●");
		System.out.println(str12);
		
		//	2020-05-18
		
		//	11.contains(String s) : boolean
		//	인자로 들어온 문자열이 해당 문자열에 존재하면 true, 존재하지 않으면  false
		//	인자에 char를 넣으면 오류, 대소문자 구별한다.
		System.out.println("===================");
		System.out.println("11.contains(String s) : boolean");
		
		String	str14	=	"KOREA @ 대한민국";
		
		boolean	b1	=	str14.contains("@");
		System.out.println(b1);
		
		b1 = str14.contains("대한");
		System.out.println(b1);

		b1 = str14.contains("KOR");
		System.out.println(b1);
		
		b1 = str14.contains("kor");
		System.out.println(b1);
		
		//	12. isEmpty() : boolean
		//	해당 문자열이 비어 있으면 true, 내용이 있으면 false
		System.out.println("===================");
		System.out.println("12. isEmpty() : boolean");
		
		String	s15	=	"";
		b1	=	s15.isEmpty();
		System.out.println(b1);
		
		s15	=	"대한민국";
		b1	=	s15.isEmpty();
		System.out.println(b1);
		
		//	13. split(String regex) : String[]  	
		//		split(String regex, int limit) : String[]
		//	String regex : 구분자(나눌기준), int limit : 나눌 배열의 크기
		System.out.println("===================");
		System.out.println("13. split(String regex), split(String regex, int limit) : String[]  ");
			
		String	str16 	=	"사과,딸기,망고 오렌지,파인애플,두리안";
		String	arr1[]	=	str16.split(",");	
		
		for (String k : arr1) {
			System.out.println(k);
		}
		System.out.println("----------------");

		String	arr2[]	=	str16.split(" ");	
		
		for (String k : arr2) {
			System.out.println(k);
		}
		System.out.println("----------------");

		String	arr3[]	=	str16.split(",",3);	
		
		for (String k : arr3) {
			System.out.println(k);
		}
		System.out.println("----------------");
		
		String	arr4[]	=	str16.split(",",7);	
		
		for (String k : arr4) {
			System.out.println(k);
		}
		System.out.println("----------------");
		
		//	14.	substring(int beginIndex) : String
		//		시작위치 부터 끝까지 문자열 추출
		//	    substring(int beginIndex, int endIndex)
		//		시작위치부터 끝위치 전까지 문자열 추출
		System.out.println("===================");
		System.out.println("14. substring(int beginIndex), substring(int beginIndex, int endIndex) : String  ");
		
		String	str17	=	"010-7777-9999";
		String	msg		=	str17.substring(4);
		System.out.println(msg);
		
		msg		=	str17.substring(4,8);
		System.out.println(msg);
		
		msg		=	str17.substring(0,3);
		System.out.println(msg);
		
		String	str18	=	"770707-1";
		msg		=	str18.substring(7, 8);
		System.out.println(msg);
		
		msg		=	str18.substring(str18.indexOf('-')+1, str18.indexOf('-')+2);
		System.out.println(msg);
		

				
				
				
				
				
				
		
		//	16. toLowerCase() : String
		//		모든 대문자를 소문자로 변경시킨다.
		//		toUpperCase() : String
		//		모든 소문자를 대문자로 변경시킨다.
		System.out.println("===================");
		System.out.println("16. toLowerCase(), toUpperCase() : String  ");
		String	str19	=	"대한 KOREa 19";
		msg	=	str19.toLowerCase();
		System.out.println(msg);
		msg	=	str19.toUpperCase();
		System.out.println(msg);
		
		str	=	"KOREa";
		msg = 	str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
		System.out.println(msg);
		
		//	17. tostring() : String
		//	Object의 toString() : 모든 객체에 사용, 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드 (오버라이징 할때 배운다)
		//	String의 toString() : 문자열 자체를 반환 
		System.out.println("===================");
		System.out.println("17. tostring() : String");
		
		String	str20	=	"java 8 자바 8";
		msg	=	str20.toString();
		System.out.println(msg);
		System.out.println(str20);
	
		//	18. trim() : String
		//	해당 문자열의 앞, 뒤 공백 제거, 중간의 공백은 제거하지 못한다.
		System.out.println("===================");
		System.out.println("18. trim() : String");
		String	str21	=	"    java  자바    JAVA   ";
		msg	=	str21.trim();
		System.out.println(str21);
		System.out.println(msg);
		System.out.println(str21.length());
		System.out.println(msg.length());
		
		//	19. valueof(자료형) : static String
		//	어떤 자료형이든 String 으로 변경시킨다.
		System.out.println("===================");
		System.out.println("19. valueof(자료형) : static String");
		
		boolean	bo1		=	true;
		char	ch1		=	'a';
		int		num1	=	34;
		long	num2	=	58L;
		float	num3	=	3.14f;
		double	num4	=	342.12;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("-----------");
		
		//	자료형 + 1
		//	System.out.println(bo1+1);	=> boolean형은 +를 할 수 없다.
		System.out.println(ch1+1);
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println(num4+1);
		System.out.println("-----------");
		
		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);
		
		System.out.println("-----------");
		
		System.out.println(bo1 + "1");
		System.out.println(ch1 + "1");
		System.out.println(num1 + "1");
		System.out.println(num2 + "1");
		System.out.println(num3 + "1");
		System.out.println(num4 + "1");
		System.out.println("-----------");
		
		System.out.println(bo1 + "");
		System.out.println(ch1 + "");
		System.out.println(num1 + "");
		System.out.println(num2 + "");
		System.out.println(num3 + "");
		System.out.println(num4 + "");
		
		
		//	20. Wrapper class : 
		//	각 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경시키는 클래스들
		//	원래 의미는 기본자료형을 객체로 만들때 사용하는 클래스 (이제는 자동으로 만들어짐) 
		System.out.println("===================");
		System.out.println("20. Wrapper class : ");
		
		//	20-1. 문자열을 boolean형으로 변경 : Boolean.parseBoolean()
		//	true, false 만 사용가능 
		System.out.println("20-1. Boolean.parseBoolean()");
		String	message	=	"true";
		boolean	m1	=	Boolean.parseBoolean(message);
		
		if	(m1)	{
			System.out.println("변경 성공");
		}	else	{
			System.out.println("변경 실패");
		}
		System.out.println("-----------");
		
		//	20-2 문자열을 int형으로 변경 : Integer.parseInt() 
		System.out.println("20-2. Integer.parseInt()");
		
		message = 	"241";
		int	m2	=	Integer.parseInt(message);
		System.out.println(message + 10);
		System.out.println(m2 + 10);
		System.out.println("-----------");
		
		//	20-3 문자열을 long형으로 변경 : Long.parseLong() 
		System.out.println("20-3. Long.parseLong() ");
//		message	=	"241L";		//	오류발생
		message	=	"241";	
		long m3 =	Long.parseLong(message);
		System.out.println(message + 10);
		System.out.println(m3 + 10);
		System.out.println("-----------");
		
		//	20-4  문자열을 float로 변경 : Float.parseFloat()
		System.out.println("20-4. Float.parseFloat() ");
		message	=	"3.14f";		
		float m4 = Float.parseFloat(message);
		System.out.println(message + 10);
		System.out.println(m4 + 10);
		System.out.println("-----------");
		
		//	20-5. 문자열을 double로 변경 : Double.parseDouble()
		System.out.println("20-5. Double.parseDouble() ");
		message	=	"3.14";
		double m5 = Double.parseDouble(message);
		System.out.println(message + 10);
		System.out.println(m5 + 10);
		System.out.println("-----------");
		
		//	20-6. 문자열을 char로 변경 : 없다.
		//	String.charAt() 사용
		System.out.println("20-5. String.charAt() ");
		message	=	"A";
		char	m6	=	message.charAt(0);
		System.out.println(message);
		System.out.println(m6);
		System.out.println("-----------");
		
		//	21. toCharArray() : char[]
		//	해당 문자열을 char[] 로 만들어 줌
		//	모든 문자 사용 가능 ( getBytes()는 영어와 숫자만 가능)
		System.out.println("21. toCharArray() : char[]");
		message = "java 자바 JAVA 大韓民國 2020";
		byte[] m7 = message.getBytes(); // 숫자로 변경(영어 와 숫자만 가능)
		for (byte k : m7) {
			System.out.println(k);
		}
		System.out.println("-----------");
		
		char[] m8 = message.toCharArray(); // 숫자로 변경(영어 와 숫자만 가능)
		for (char k : m8) {
			System.out.println(k);
		}
		
		
	}
}
