package com.ict.edu02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String idx = null;
		String m_id = null;
		String m_pw = null;
		String m_name = null;
		String m_age = null;
		
		System.out.println("선택하시오");
		System.out.println("1. 테이블 데이터 보기");
		System.out.println("2. 테이블 데이터 삽입");
		System.out.println("3. 테이블 데이터 삭제");
		System.out.println("4. 테이블 데이터 수정");
		System.out.print(">>>   ");
		int su = sc.nextInt();
		
		switch (su) {
			case 1: 
				DAO.getInstance().getSelect();  
				break;
				
			case 2: 
				System.out.println("*** 등록처리 ***");
				
				System.out.print("아이디 : ");
				m_id = sc.next();

				System.out.print("패스워드 : ");
				m_pw = sc.next();
				
				System.out.print("이름 : ");
				m_name = sc.next();
				
				System.out.print("나이 : ");
				m_age = sc.next();
				
				DAO.getInstance().getInsert(m_id, m_pw, m_name, m_age);
				break;
				
			case 3:   
				System.out.println("*** 삭제처리 ***");
				
				DAO.getInstance().getSelect();
				
				System.out.print("삭제할 아이디 : ");
				idx = sc.next();				
				
				DAO.getInstance().getDelete(idx);
				
				break;
				
			case 4:   
				System.out.println("*** 수정처리 ***");
				
				DAO.getInstance().getSelect();
				
				System.out.print("수정할 아이디 : ");
				idx = sc.next();

				System.out.print("수정할 나이 : ");
				m_age = sc.next();
				
				DAO.getInstance().getUpdate(idx, m_age);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("수고 하셨습니다.");
	}	
}
