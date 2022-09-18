package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.entity.Doctor;
import com.service.ConnectionProvider;

public class DoctorDao {
	public static boolean insertDoctorValue(Doctor dc) {
		boolean f=false;
		try {
			//JDBC connection
			Connection c=ConnectionProvider.createConnection();
			String query="insert into Doctor(doc_name,specilist,timing,qualification,room_no)values(?,?,?,?,?)";
		    //dynamic query
			PreparedStatement presta=c.prepareStatement(query);
			presta.setString(1, dc.getDoc_name());
			presta.setString(2, dc.getSpecilist());
			presta.setString(3, dc.getTiming());
			presta.setString(4, dc.getQualification());
			presta.setInt(5, dc.getRoom_no());
			presta.executeUpdate();
			f=true;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteDoctorValue(int id) {
		boolean f1=false;
		try {
			Connection c1=ConnectionProvider.createConnection();
			String query1="delete from Doctor where doc_id=?";
			PreparedStatement presta=c1.prepareStatement(query1);
			presta.setInt(1,id);
			presta.executeUpdate();
			f1=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f1;
		
	}

	public static void showDoctorValue() {
		try {
			Connection c=ConnectionProvider.createConnection();
			String query="select * from Doctor";
			Statement sta=c.createStatement();
			ResultSet set=sta.executeQuery(query);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String specilization=set.getString(3);
				String timing=set.getString(4);
				String qualification=set.getString(5);
				int room_no=set.getInt(6);
				System.out.println("Id: "+id+", Name: "+name+", Specilization: "+specilization+", Timing: "+timing+", Qualification: "+qualification+", Room-no: "+room_no);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		public static boolean UpdateDoctorDetail(int id,String changed_attr) {
			boolean f1=false;
			
			try {
				Connection c1=ConnectionProvider.createConnection();
				String query1="update Doctor set timing=? where doc_id=?";
				PreparedStatement presta=c1.prepareStatement(query1);
				presta.setString(1,changed_attr);
				presta.setInt(2,id);
				presta.executeUpdate();
				f1=true;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return f1;
		
		
	}


}
