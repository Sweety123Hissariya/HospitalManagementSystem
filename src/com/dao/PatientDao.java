package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.entity.Patient;
import com.service.ConnectionProvider;

public class PatientDao {

	
	public static boolean insertPatientValue(Patient patient) {
		
		boolean f=false;
		try {
		
			Connection c=ConnectionProvider.createConnection();
			String query="insert into Patient(patient_name,disease,gender,admit_status,age)values(?,?,?,?,?)";
		    //dynamic query
			PreparedStatement presta=c.prepareStatement(query);
			presta.setString(1, patient.getPatient_name());
			presta.setString(2, patient.getDisease());
			presta.setString(3, patient.getGender());
			presta.setString(4, patient.getAdmit_status());
			presta.setInt(5, patient.getAge());
			presta.executeUpdate();
			f=true;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deletePatientValue(int id) {
		boolean f1=false;
		try {
			Connection c1=ConnectionProvider.createConnection();
			String query1="delete from Patient where patient_id=?";
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

	public static void showPatientDetails() {
		try {
			Connection c=ConnectionProvider.createConnection();
			String query="select * from Patient";
			Statement sta=c.createStatement();
			ResultSet set=sta.executeQuery(query);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String disease=set.getString(3);
				String gender=set.getString(4);
				String admit_status=set.getString(5);
				int age=set.getInt(6);
				System.out.println("Id: "+id+" Patient-Name: "+name+" Disease: "+disease+" Gender: "+gender+" Admit Status: "+admit_status+" Age: "+age);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	public static boolean UpdatePatientDetail(int id,String changed_attr) {
		boolean f1=false;
		//Patient p=new Patient();
		try {
			Connection c1=ConnectionProvider.createConnection();
			String query1="update Patient set admit_status=? where patient_id=?";
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
	
