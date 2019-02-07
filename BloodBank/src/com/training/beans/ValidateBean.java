package com.training.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.training.utils.MySqlConnection;

public class ValidateBean {

	private String userName;
	private String passWord;
	public ValidateBean() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public boolean validate() {
		boolean result=false;	
		String str="select * from users where userName=? and passWord=?";
		Connection con=MySqlConnection.getConnection();
		try {
			PreparedStatement pstmt=con.prepareStatement(str);
			pstmt.setString(1,this.getUserName());
			pstmt.setString(2,this.getPassWord());
	
			ResultSet rst=pstmt.executeQuery();
			if(rst.next()) {
				result=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
