package com.ict.edu02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	//	테이터 베이스 내용 출력 
	public static void listPrn(ArrayList<VO> list) {
		
		System.out.println("--------------------------------------------------");
		System.out.println("순번\t아이디\tPWD\t이름\t나이\t일자");
		System.out.println("--------------------------------------------------");

		for (VO vo : list) {
			System.out.print(vo.getIdx() + "\t");
			System.out.print(vo.getid() + "\t");
			System.out.print(vo.getpw() + "\t");
			System.out.print(vo.getname() + "\t");
			System.out.print(vo.getage() + "\t");
			System.out.print(vo.getreg() + "\n");
		}
		System.out.println("--------------------------------------------------");
	}

	// 메인 메소드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = null;
		
		String idx = null;
		String id = null;
		String pw = null;
		String name = null;
		String age = null;

		ESC_01 :
		while(true) {
			
			System.out.println();
			System.out.println("============================");
			System.out.println("선택하시오");
			System.out.println("1. 테이블 데이터 보기");
			System.out.println("2. 테이블 데이터 삽입");
			System.out.println("3. 테이블 데이터 삭제");
			System.out.println("4. 테이블 데이터 수정");
			System.out.println("5. 로그인");
			System.out.println("0. 종료");
			System.out.print(">>>   ");
			
			String str = sc.next();
			
			switch (str) {
				case "1": 
					list = DAO.getInstance().getSelect(); 
					if (list != null) {
						listPrn(list);
					}
					break;
					
				case "2": 
					System.out.println("*** 등록처리 ***");
					
					System.out.print("아이디 : ");
					id = sc.next();

					System.out.print("패스워드 : ");
					pw = sc.next();
					
					System.out.print("이름 : ");
					name = sc.next();
					
					System.out.print("나이 : ");
					age = sc.next();
					
					list  = DAO.getInstance().getInsert(id, pw, name, age);
					if (list != null) {
						System.out.println("---- 등록결과 -----");
						listPrn(list);
					}
					break;
					
				case "3":   
					System.out.println("*** 삭제처리 ***");
					
					list  = DAO.getInstance().getSelect();
					listPrn(list);
					
					System.out.print("삭제할 아이디 : ");
					idx = sc.next();				
					
					list  =	DAO.getInstance().getDelete(idx);
					if (list != null) {
						System.out.println("----- 삭제결과 -----");
						listPrn(list);
					}
					break;
					
				case "4":   
					System.out.println("*** 수정처리 ***");
					
					list  = DAO.getInstance().getSelect();
					listPrn(list);
					
					System.out.print("수정할 아이디 : ");
					idx = sc.next();

					System.out.print("수정할 나이 : ");
					age = sc.next();
					
					list = DAO.getInstance().getUpdate(idx, age);
					
					if (list != null) {
						System.out.println("----- 수정결과 -----");
						listPrn(list);
					}
					break;
					
				case "5":   
					System.out.println("*** 로그인 ***");
					
					System.out.print("ID : ");
					id = sc.next();

					System.out.print("PASSWORD : ");
					pw = sc.next();
					
					System.out.println();
					
					list = DAO.getInstance().getLogIn(id, pw);
					
					if (list.size() == 1) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패");
					}
					
					break;
					
				case "0" : 
					break ESC_01;
				
				default	:
					System.out.println();
					System.out.println("다시 선택하세요...");
					System.out.println();
					continue ESC_01;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("수고 하셨습니다.");
	}	
}
