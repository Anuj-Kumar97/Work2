package com.JDBC;
import java.sql.*;

public class Dbtest {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","rahul@123");
		System.out.println("Connection established");
		Statement stmt=dbcon.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEE");
		while(rs.next()) {
			int id=rs.getInt("Id");
			String name=rs.getString("Name");
			double salary=rs.getDouble("Salary");
			System.out.println(id+"--"+name+"--"+salary);
		}
		String sql="Update Employee set name= 'Amit' where id=11";
		stmt.executeUpdate(sql);
		/*String sql1="Delete Employee name='Akshay'";
		stmt.executeUpdate(sql1);*/
		rs.close();
		stmt.close();
		dbcon.close();
	}

}
