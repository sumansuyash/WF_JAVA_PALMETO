package com.training.utils;

import java.sql.*;
import java.util.*;

public class CrudExample {
	private Connection con;
	public CrudExample() {
		super();
		con=MySqlConnection.getConnection();
	}
	public int add(BloodDonar obj) {
		String sql="Insert into blooddonar values(?,?,?,?)";
		int rowAdded=0;
		
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setLong(1, obj.getMobileNumber());
			pstmt.setString(2, obj.getBloodDonarName());
			pstmt.setString(3, obj.getBloodGroup());
			pstmt.setString(4, obj.getLocation());
			
			rowAdded = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowAdded;
	}
	private List<BloodDonar> convertToObject(ResultSet rst) throws SQLException{
		List<BloodDonar> list=new ArrayList<>();
		while(rst.next())
		{
			long mNo=rst.getLong("mobileNumber");
			String bloodDonarName=rst.getString("bloodDonarName");
			String bloodGroup=rst.getString("bloodGroup");
			String location=rst.getString("location");
			BloodDonar obj=new BloodDonar(mNo,bloodDonarName,bloodGroup,location);
			list.add(obj);
		}
		return list;		
	}
	public List<BloodDonar>findAll(){
		String sql="Select * from blooddonar";
		List<BloodDonar> list=new ArrayList<>();
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(sql);
			ResultSet rst=pstmt.executeQuery();
			list=convertToObject(rst);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<BloodDonar>findBloodGroup(String bG){
		String sql="Select * from blooddonar where bloodGroup=?";
		List<BloodDonar> list=new ArrayList<>();
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bG);
			ResultSet rst=pstmt.executeQuery();
			list=convertToObject(rst);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
