package com.ict.edu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Connection 	conn 	= null;
		Statement 	stmt 	= null;
		ResultSet 	rs 		= null;
		int 		result 	= 0;
		
		try {
			
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 접속정보
			String url ="jdbc:oracle:thin:@203.236.220.59:1521:xe";
			String user = "c##ha6511";
			String password ="1111";  

			conn = DriverManager.getConnection(url, user, password);

			// SQL 문
			String sql = "update members set m_pw = '9999' where idx = 41 ";
			
			// 구문 생성
			stmt = conn.createStatement();
			
			result	=	stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("갱신 성공");
				
				sql = "SELECT * from MEMBERS ORDER BY IDX";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.println(rs.getString(6).substring(0, 10));
				}
				
				
			}else {
				System.out.println("갱신 실패 ");
			}

		
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				conn.close();
				stmt.close();
				rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		} 
		
	}
}
