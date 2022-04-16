package com.example.address.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Address entity class to save address data of friend in Finland 
@Entity
public class Address {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	
	private String name;  
	private String street;
	private int houseNumber;
	private char block;
	private int postalCode;
	
	private String city;

	public Address() {
		
	}

	public Address(String name, String street, int houseNumber, char block, int postalCode,
			String city) {
		super();
		this.name = name;
		this.street = street;
		this.houseNumber = houseNumber;
		this.block = block;
		this.postalCode = postalCode;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public char getBlock() {
		return block;
	}

	public void setBlock(char block) {
		this.block = block;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + ", street=" + street + ", houseNumber=" + houseNumber
				+ ", block=" + block + ", postalCode=" + postalCode + ", city=" + city + "]";
	}
	
	

}
