package com.ict.edu05;

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
			System.out.print(vo.getM_id() + "\t");
			System.out.print(vo.getM_pw() + "\t");
			System.out.print(vo.getM_name() + "\t");
			System.out.print(vo.getM_age() + "\t");
			System.out.print(vo.getM_reg() + "\n");
		}
		System.out.println("--------------------------------------------------");
	}

	// 메인 메소드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = null;
		
		String idx = null;
		String m_id = null;
		String m_pw = null;
		String m_name = null;
		String m_age = null;

		ESC_01 :
		while(true) {
			
			System.out.println();
			System.out.println("============================");
			System.out.println("선택하시오");
			System.out.println("1. 테이블 데이터 보기");
			System.out.println("2. 테이블 데이터 삽입");
			System.out.println("3. 테이블 데이터 삭제");
			System.out.println("4. 테이블 데이터 수정");
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
					m_id = sc.next();

					System.out.print("패스워드 : ");
					m_pw = sc.next();
					
					System.out.print("이름 : ");
					m_name = sc.next();
					
					System.out.print("나이 : ");
					m_age = sc.next();
					
					list  = DAO.getInstance().getInsert(m_id, m_pw, m_name, m_age);
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
					m_age = sc.next();
					
					list = DAO.getInstance().getUpdate(idx, m_age);
					
					if (list != null) {
						System.out.println("----- 수정결과 -----");
						listPrn(list);
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
