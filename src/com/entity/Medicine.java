package com.entity;

public class Medicine {
	private int id;
	private String med_name;
	private String med_comp;
	private String exp_date;
	private int med_quantity;
	Medicine(){
		
	}
	public Medicine(String med_name, String med_comp, String exp_date, int med_quantity) {
		super();
		this.med_name = med_name;
		this.med_comp = med_comp;
		this.exp_date = exp_date;
		this.med_quantity = med_quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMed_name() {
		return med_name;
	}
	public void setMed_name(String med_name) {
		this.med_name = med_name;
	}
	public String getMed_comp() {
		return med_comp;
	}
	public void setMed_comp(String med_comp) {
		this.med_comp = med_comp;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	public int getMed_quantity() {
		return med_quantity;
	}
	public void setMed_quantity(int med_quantity) {
		this.med_quantity = med_quantity;
	}
	
	

}
