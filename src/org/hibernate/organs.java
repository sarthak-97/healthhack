package org.hibernate;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class organs {
	@Id	
	int id;
	String UserId;
	String Organ;
	public int getId() {
		return id;
	}
	public void setId(int id) { 
		this.id = id;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getOrgan() {
		return Organ;
	}
	public void setOrgan(String organ) {
		Organ = organ;
	}
	
}