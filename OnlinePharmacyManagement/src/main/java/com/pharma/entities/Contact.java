package com.pharma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ftname;
	private String ltname;
	private String email;
	private String number;
	private String city;
	private String address;
	private String state;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int id, String ftname, String ltname, String email, String number, String city, String address,
			String state) {
		super();
		this.id = id;
		this.ftname = ftname;
		this.ltname = ltname;
		this.email = email;
		this.number = number;
		this.city = city;
		this.address = address;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", ftname=" + ftname + ", ltname=" + ltname + ", email=" + email + ", number="
				+ number + ", city=" + city + ", address=" + address + ", state=" + state + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFtname() {
		return ftname;
	}
	public void setFtname(String ftname) {
		this.ftname = ftname;
	}
	public String getLtname() {
		return ltname;
	}
	public void setLtname(String ltname) {
		this.ltname = ltname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
