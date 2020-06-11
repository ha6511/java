package com.ict.edu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {

	static Connection 	conn 	= null;
	static Statement 	stmt 	= null;
	static ResultSet 	rs 		= null;
	static int 			result 	= 0;
	static 	Scanner 	sc 		= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		try {
		  
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 접속정보
			String url ="jdbc:oracle:thin:@203.236.220.59:1521:xe";
			String user = "c##ha6511";
			String password ="1111";  

			conn = DriverManager.getConnection(url, user, password);

			// SQL를 담아서 보낼 구분 생성
			stmt = conn.createStatement();
			
			loop_01 :
			while (true) {
				
				System.out.println();
				System.out.println("***members 테이블 작업***");
				System.out.println("1. 보기");
				System.out.println("2. 추가");
				System.out.println("3. 삭제");
				System.out.println("4. 나이 수정");
				System.out.println("그외. 종료");
				System.out.print("위의 작업 중 선택하세요 >> ");
				
				String acc = sc.next();

				System.out.println();
				
				switch (acc) {
				case "1" :	inq(true); break;
				case "2" :	ins(); break;
				case "3" :	del(); break;
				case "4" :	upd(); break;
				default  : break loop_01;
				}	
				System.out.println();
			}
			
		} catch (Exception e) {
			
		} finally {
			System.out.println("***** 작업종료 *********");
		  try {
				conn.close();
				stmt.close();
				rs.close();
		} catch (Exception e2) {
			
		}	
		}
	}

	private static 	void	stmt_upd(String sql, String str)	{
		
		try {
			
			// 구분에 SQL를 담아서 보내고 결과를 받는다.
			// SQL 문이 select 일때 
			result = stmt.executeUpdate(sql);
			
			if (result > 0)	{
				System.out.println(str + "성공");
				inq	(false);
			}
			else	{
				System.out.println(str + "실패1");
			}

		} catch (Exception e) {
			System.out.println(str + "실패2");
			System.out.println(e);
		}
	}	
	
	private static		void	inq	(boolean main_call)	{
		
		if (main_call)	{
			System.out.println("*** 조회처리 ***");
		}
		
		try {
		
			// SQL 작성
			String sql = "select * from members order by idx";
			
			// 구분에 SQL를 담아서 보내고 결과를 받는다.
			// SQL 문이 select 일때 
			rs = stmt.executeQuery(sql);
			
			System.out.println("--------------------------------------------------");
			System.out.println("순번\t아이디\tPWD\t이름\t나이\t일자");
			System.out.println("--------------------------------------------------");
			    
			 while(rs.next()) {
				 System.out.print(rs.getInt("idx")+"\t");
				 System.out.print(rs.getString("m_id")+"\t");
				 System.out.print(rs.getString("m_pw")+"\t");
				 System.out.print(rs.getString("m_name")+"\t");
				 System.out.print(rs.getInt("m_age")+"\t");
				 System.out.println(rs.getString("m_reg").subSequence(0, 10));
			 }
			 
			System.out.println("--------------------------------------------------");
			
		} catch (Exception e) {
			System.out.println("조회 오류");
			System.out.println(e);
		} finally {
		}
		
	}
	
	private static		void	ins	()	{
		
		System.out.println("*** 등록처리 ***");
		
		System.out.print("아이디 : ");
		int v_id = sc.nextInt();

		System.out.print("패스워드 : ");
		String v_pw = sc.next();
		
		System.out.print("이름 : ");
		String v_name = sc.next();
		
		System.out.print("나이 : ");
		int v_age = sc.nextInt();
		
		// SQL 작성
		String sql = "insert into members(idx,m_id,m_pw,m_name,m_age,m_reg)  values(members_seq.nextval," + String.valueOf(v_id) + ", " + v_pw + ", " + v_name + ", " + v_age + ", sysdate )";
		
		stmt_upd(sql, "삽입");
		
	}

	private static		void	del	()	{
		
		System.out.println("*** 삭제처리 ***");
		
		inq	(false);
		
		System.out.print("삭제할 아이디 : ");
		int v_id = sc.nextInt();

		// SQL 작성
		String sql = "delete from members where idx = " + String.valueOf(v_id);
		
		stmt_upd(sql, "삭제");

	}
	private static		void	upd	()	{
		
		System.out.println("*** 수정처리 ***");
		
		inq	(false);
		
		System.out.print("수정할 아이디 : ");
		int v_id = sc.nextInt();

		System.out.print("수정할 나이 : ");
		int v_age = sc.nextInt();

		
		// SQL 작성
		String sql = "update members set m_age = " + v_age + " where idx = " + String.valueOf(v_id);

		stmt_upd(sql, "수정");

		
	}

	
}


