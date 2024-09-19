package com.pvn.studentservice.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {
	@Id
	@Column(name="akid")
	private int akid;
	@Column(name ="name")
	private String name;
	@Column(name ="branch")
	private String branch;
	@Column(name ="mobile_number")
	private String mobileNumber;
	@Column(name ="email")
	private String email;
	@Column(name ="address")
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
