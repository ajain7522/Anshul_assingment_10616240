package com.pojo;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  


@XmlRootElement  
public class Taxinfo {

	String name;
	  String address;
	  String dob;
	  String pan;
	  double assesment_year;
	  double income;
	  double taxdeducted;
	  
	public Taxinfo(String name, String address,String pan, String dob, double ayear,
			double income, double taxd) {
		super();
		this.name = name;
		this.address = address;
		this.pan = pan;
		this.dob = dob;
		this.assesment_year = ayear;
		this.income = income;
		this.taxdeducted = taxd;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public void setPan(String pan) {
		this.pan = pan;
	}


	public void setAssesment_year(double assesment_year) {
		this.assesment_year = assesment_year;
	}


	public void setIncome(double income) {
		this.income = income;
	}


	public void setTaxdeducted(double taxdeducted) {
		this.taxdeducted = taxdeducted;
	}


	@XmlElement
	public String getName() {
		return name;
	}

	@XmlElement
	public String getAddress() {
		return address;
	}

	@XmlElement
	public String getDob() {
		return dob;
	}

	@XmlElement
	public String getPan() {
		return pan;
	}

	@XmlElement
	public double getAssesment_year() {
		return assesment_year;
	}

	@XmlElement
	public double getIncome() {
		return income;
	}

	@XmlElement
	public double getTaxdeducted() {
		return taxdeducted;
	}


	public Taxinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
