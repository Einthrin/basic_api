package com.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userDetail")
public class UserDetail {

	private int _userDetailId;
	private String _firstName;
	private String _lastName;
	private Date _birthOfDate;

	public UserDetail() {

	}

	public UserDetail(int userDetailId, String firstName, String lastName, Date birtOfDate) {
		super();
		this._userDetailId = userDetailId;
		this._firstName = firstName;
		this._lastName = lastName;
		this._birthOfDate = birtOfDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getUserDetailId() {
		return _userDetailId;
	}

	public void setUserDetailId(int userDetailId) {
		this._userDetailId = userDetailId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
	}

	public Date getBirthOfDate() {
		return _birthOfDate;
	}

	public void setBirtOfDate(Date birtOfDate) {
		this._birthOfDate = birtOfDate;
	}

}