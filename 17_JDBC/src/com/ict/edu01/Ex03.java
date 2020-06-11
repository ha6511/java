package com.ict.edu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 접속정보
			String url ="jdbc:oracle:thin:@203.236.220.59:1521:xe";
			String user = "c##ha6511";
			String password ="1111";  
			

			conn = DriverManager.getConnection(url, user, password);

			// SQL 문
			String sql = "insert into members values(members_seq.nextval,'kkkk','1111','희동이',3 ,sysdate, null )";
			
			// 구문 생성
			stmt = conn.createStatement();
			
			// insert, delete, update
			result = stmt.executeUpdate(sql);
			
			if(result>0) {
				
				System.out.println("삽입 성공");
				
				sql = "select * from members order by idx";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.println(rs.getString(6));
				}
			}else {
				System.out.println("삽입 실패1");
			}
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("삽입실패2");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
