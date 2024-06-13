package com.example.demo;

public class UserInformation {

	private int id;
	private String name;
	private String emailId;
	public UserInformation(int id, String name, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
	
}
