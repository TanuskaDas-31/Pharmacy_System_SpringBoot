package com.pharma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class BookMedicine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String bookname;
	private String email;
	private String number;
	private String city;
	private String address;
	private String medname;
	public BookMedicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookMedicine(int id, String bookname, String email, String number, String city, String address,
			String medname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.email = email;
		this.number = number;
		this.city = city;
		this.address = address;
		this.medname = medname;
	}
	@Override
	public String toString() {
		return "BookMedicine [id=" + id + ", bookname=" + bookname + ", email=" + email + ", number=" + number
				+ ", city=" + city + ", address=" + address + ", medname=" + medname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
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
	public String getMedname() {
		return medname;
	}
	public void setMedname(String medname) {
		this.medname = medname;
	}
	
	
	
	

}
