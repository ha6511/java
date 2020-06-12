package com.ict.edu04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 접속정보
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "c##nohsam";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);

			// SQL 문
			String sql = "update members set m_age = ? where idx = ?";

			// 구문 생성
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "24");
			pstmt.setString(2, "181");
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("갱신 성공");
				
				sql = "select * from members order by idx";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.println(rs.getString(6).substring(0, 10));
				}
				
			}else {
				System.out.println("갱신 실패 1");
			}
		} catch (Exception e) {
			System.out.println("갱신 실패 2");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println("Close 실패");
			}
		}
	}
}
