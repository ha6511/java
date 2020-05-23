package com.ict.edu;

public class Ex12 {

	public static void main(String[] args) {
		// break label 과 continue label
		// break lable : 레이블이 지정한 블록을 탈출한다.
		// continue lable : 레이블이 지정한 블록 수행문을 포기하고 다음회차로 진행
		// lable 지정방법 => 레이블이름 :
		// 뒤나 밑에는 반복문 만 올 수 있다.

		// 1~10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();

		// i가 6일때 break 사용하기
		for (int i = 1; i < 11; i++) {
			if (i == 6) break;
			System.out.print(i + "\t");
		}
		System.out.println();

		// i가 6일때 break lable 사용하기
		// for문이 하나일때는 break 나 break label 이 같은 결과를 낸다.
		// 그러므로  for 문이 하나일때는 break label  을 사용할 필요가 없다.
		// continue 문도 마찬가지 이다.
		esc: for (int i = 1; i < 11; i++) {
				if (i == 6)	break esc;
				System.out.print(i + "\t");
			}
		System.out.println();

		// i가 6일때 continue 사용하기
		for (int i = 1; i < 11; i++) {
			if (i == 6) continue;
			System.out.print(i + "\t");
		}
		System.out.println();

		// i가 6일때 continue label사용하기
		esc2: for (int i = 1; i < 11; i++) {
			if (i == 6)	continue esc2;
			System.out.print(i + "\t");
		}
		System.out.println();
		
		System.out.println("=======================================");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println(i + ", "+ j);
			}
		}
		System.out.println("=======================================");

		// j=3 일때 break;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j==3) break;
				System.out.println(i + ", "+ j);
			}
		}
		System.out.println("=======================================");

		// j=3 일때 break lable
		esc3 : for (int i = 1; i < 4; i++) {
					for (int j = 1; j < 6; j++) {
						if (j==3) break esc3;
						System.out.println(i + ", "+ j);
					}
				}
		System.out.println("=======================================");
		
		// j=3 일때 continue;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j==3) continue;
				System.out.println(i + ", "+ j);
			}
		}
		System.out.println("=======================================");

		// j=3 일때 continue lable
		esc4 : for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j==3) continue esc4;
				System.out.println(i + ", "+ j);
			}
		}
		System.out.println("=======================================");
		
	}
}
