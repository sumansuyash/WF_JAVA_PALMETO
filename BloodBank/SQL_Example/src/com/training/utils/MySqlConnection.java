package com.training.utils;
import java.sql.*;
public class MySqlConnection {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wells","root","root");
		System.out.println(con);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return con;
	}
	public static void main(String[] args){
		
	}
}
