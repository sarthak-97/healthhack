package org.hibernate;

public class donor {
	private String UserId;
	private String UserName;
	private String Address ;
	private String Dob;
	private String Diseases;
	private String Mob;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getDiseases() {
		return Diseases;
	}
	public void setDiseases(String diseases) {
		Diseases = diseases;
	}
	public String getMob() {
		return Mob;
	}
	public void setMob(String mob) {
		Mob = mob;
	}

}
