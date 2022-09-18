package com.entity;

public class Patient {
	private int patient_id;
	private String patient_name;
	private String disease;
	private String gender;
	private String admit_status;
	private int age;
	Patient(){
		
	}
	
	public Patient(String patient_name, String disease, String gender, String admit_status, int age) {
		super();
		this.patient_name = patient_name;
		this.disease = disease;
		this.gender = gender;
		this.admit_status = admit_status;
		this.age = age;
	}

	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdmit_status() {
		return admit_status;
	}
	public void setAdmit_status(String admit_status) {
		this.admit_status = admit_status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
