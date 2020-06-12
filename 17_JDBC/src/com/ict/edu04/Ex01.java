package com.ict.edu04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// 1. 자바와 오라클을 연결하기 위한 라이브러리를  프로젝트에 등록하기 
public class Ex01 {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		
		// 2. SQL 작성, 구분 생성
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		// 3. select문를 사용할때 결과를 받는 클래스 
		//    select문의 결과는 항상 테이블 상태이다. 나머지는 숫자로 받는다.
		ResultSet rs = null; // select문 일때 사용
		int result = 0 ;     // select문 제외할 때 사용
		
		try {
			// 4. jdbc 드라이버 로딩 : 오라클, MySQL 각 DBMS 마다 내용이 다르다.
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 접속하기 위한 정보 저장
			String url ="jdbc:oracle:thin:@203.236.220.59:1521:xe";
			String user = "c##ha6511";
			String password ="1111";  
			
			// 5. 오라클 접속
			conn = DriverManager.getConnection(url, user, password);
			
			// 6. SQL 작성
			String sql = "select * from members";
			
			// 7. SQL를 담아서 보낼 구분 생성
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			
			
			// 8. 구분에 SQL를 담아서 보내고 결과를 받는다.
			// SQL 문이 select 일때 
			//  rs = stmt.executeQuery(sql);
				rs = pstmt.executeQuery();
			    
			    
			// SQL 문이 select가 아닐 때 
			//  result = stmt.executeUpdate(sql);
			//	result = pstmt.executeUpdate();
			    
			 while(rs.next()) {
				 System.out.print(rs.getInt(1)+"\t");
				 System.out.print(rs.getString(2)+"\t");
				 System.out.print(rs.getString(3)+"\t");
				 System.out.print(rs.getString(4)+"\t");
				 System.out.print(rs.getInt(5)+"\t");
				 System.out.println(rs.getString(6));
				 /*
				 System.out.print(rs.getInt("idx")+"\t");
				 System.out.print(rs.getString("m_id")+"\t");
				 System.out.print(rs.getString("m_pw")+"\t");
				 System.out.print(rs.getString("m_name")+"\t");
				 System.out.print(rs.getInt("m_age")+"\t");
				 System.out.println(rs.getString("m_reg"));
				 */
			 }
			    
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
