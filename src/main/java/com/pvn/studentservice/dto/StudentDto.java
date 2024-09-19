package com.pvn.studentservice.dto;

public class StudentDto {
	private int akid;
	private String name;
	private String branch;
	private String mobileNumber;
	private String email;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAkid() {
		return akid;
	}
	public void setAkid(int akid) {
		this.akid = akid;
	}
	@Override
	public String toString() {
		return "Student [akid=" + akid + ", name=" + name + ", branch=" + branch + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", address=" + address + "]";
	}
	
	

}
