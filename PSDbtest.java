package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PSDbtest {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","rahul@123");
		System.out.println("Connection established");
		PreparedStatement pstmt=dbcon.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?)");
		pstmt.setInt(1,226);
		pstmt.setString(2,"Yash");
		pstmt.setDouble(3, 12000);
		int update=pstmt.executeUpdate();
		pstmt.setInt(1,225);
		pstmt.setString(2,"Rahul");
		pstmt.setDouble(3, 27345.97);
		update=pstmt.executeUpdate();
		PreparedStatement pstmt1=dbcon.prepareStatement("DELETE FROM EMPLOYEE WHERE Id=(?)");
		pstmt1.setInt(1,10);
		update=pstmt1.executeUpdate();
		PreparedStatement pstmt2=dbcon.prepareStatement("UPDATE EMPLOYEE SET NAME=(?) WHERE ID=(?)");
		pstmt2.setString(1, "Mark");
		pstmt2.setInt(2,20);
		update=pstmt2.executeUpdate();
		pstmt.close();
		dbcon.close();
	}
}
