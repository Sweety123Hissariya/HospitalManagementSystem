package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.entity.Doctor;
import com.entity.Medicine;
import com.service.ConnectionProvider;

public class MedicineDao {
	public static boolean addMedicine(Medicine md) {
		boolean f=false;
		try {
			//JDBC connection
			Connection c=ConnectionProvider.createConnection();
			String query="insert into Medicine(med_name,med_comp,exp_date,med_quantity)values(?,?,?,?)";
		    //dynamic query
			PreparedStatement presta=c.prepareStatement(query);
			presta.setString(1, md.getMed_name());
			presta.setString(2, md.getMed_comp());
			presta.setString(3, md.getExp_date());
			presta.setInt(4, md.getMed_quantity());
			presta.executeUpdate();
			f=true;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static void ExpiryDateMedicine() {
		try {
			Connection c1=ConnectionProvider.createConnection();
			String query1="select * from Medicine where exp_date<curdate(); ";
			Statement st=c1.createStatement();
			ResultSet set=st.executeQuery(query1);
			while(set.next()) {
				int id=set.getInt(1);
				String med_name=set.getString(2);
				String med_comp=set.getString(3);
				String exp_date=set.getString(4);
				int med_quan=set.getInt(5);
				System.out.println("id:"+id);
				System.out.println("Medicine Name: "+med_name);
				System.out.println("Medicine Composition: "+med_comp);
				System.out.println("Expiray date: "+exp_date);
				System.out.println("Medicine Quantity: "+med_quan);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void outOfStockMedicine() {
		try {
		Connection c=ConnectionProvider.createConnection();
		String query="select med_name,med_quantity from Medicine where med_quantity<20";
		Statement s=c.createStatement();
		ResultSet set=s.executeQuery(query);
		while(set.next()) {
		    String name=set.getString(1);
		    int quantity=set.getInt(2);
		    System.out.println("Medicine name: "+name+ "     "+"Quantity: "+quantity);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}


}
