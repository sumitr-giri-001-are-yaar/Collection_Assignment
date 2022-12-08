package com.nissan.model;

public class Record {
	String number;
	String phoneNumber;
	public Record(String number, String phoneNumber) {
		super();
		this.number = number;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Record [number=" + number + ", Name=" + phoneNumber
				+ "]";
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
