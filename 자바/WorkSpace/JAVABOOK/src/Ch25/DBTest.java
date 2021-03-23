package Ch25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DBTest {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String password = "12345";
		
		int cnt = 0;
		
		String sql;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = null;
		
		try {
			Class.forName(driver);
			System.out.println("Driver Loading Success!!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connected..");
			System.out.println("-------------------LOGIN Table에 ID/PW 생성하기-------------------");
			Scanner scan = new Scanner(System.in);
			System.out.print("계정 생성 개수 입력 : ");
			int num = scan.nextInt();
			int i = 0;
			while(i < num) {
				System.out.print((i+1) + "번째 ID : ");
				String ID = scan.next();
				System.out.print((i+1) + "번째 PW : ");
				String PW = scan.next();
				pstmt = con.prepareStatement("INSERT INTO LOGIN VALUES((SELECT NVL(MAX(NO),0)+1 FROM LOGIN), ?, ?)");
				pstmt.setString(1, ID);
				pstmt.setString(2, PW);
				pstmt.executeUpdate();
				i++;
			}
			System.out.println("-------------------LOGIN Table에 ID/PW 조회하기-------------------");
			sql = "SELECT * FROM LOGIN";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			cnt = 0;
			
			while(rs.next()) {
				System.out.print(rs.getInt("NO") + "\t");
				System.out.print(rs.getString("ID") + "\t");
				System.out.println(rs.getString("PW"));
				cnt++;
			}
			
			if(cnt > 0) {
				System.out.println("정상 조회되었습니다.");
			} else {
				System.out.println("해당 자료가 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs != null) {
					rs.close();
				}
			}catch(Exception e) {}
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(Exception e2) {}
			try {
				if(con != null) {
					con.close();
				}
			}catch(Exception e3) {}
		}
	}
}