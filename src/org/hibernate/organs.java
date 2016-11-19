package org.hibernate;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class organs {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	String id;
	String UserId;
	String Organ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
