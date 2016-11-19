package org.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class donor {
     @Id
	private String UserId;
	private String latitude;
	private String longitude;

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
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
