package com.entity;

public class Doctor {
	private int doc_id;
	private String doc_name;
	private String specilist;
	private String Timing;
	private String qualification;
	private int room_no;
	Doctor(){
		
	}
	
	public Doctor(String doc_name, String specilist, String timing, String qualification, int room_no) {
		super();
		this.doc_name = doc_name;
		this.specilist = specilist;
		this.Timing = timing;
		this.qualification = qualification;
		this.room_no = room_no;
	}

	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public String getSpecilist() {
		return specilist;
	}
	public void setSpecilist(String specilist) {
		this.specilist = specilist;
	}
	public String getTiming() {
		return Timing;
	}
	public void setTiming(String timing) {
		Timing = timing;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	
	

}
