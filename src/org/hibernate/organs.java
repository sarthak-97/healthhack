package org.hibernate;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class organs {
	@Id
	String UserId;
	String Organ;
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
