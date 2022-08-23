package com.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User{

	private int _userId;
	private String _userName;
	private String _password;
	private Date _creationDate;
	private boolean _active;
	private UserDetail _userDetail;

	public User() {

	}

	public User(int userId, String userName, String password, Date creationDate) {
		this._userId = userId;
		this._userName = userName;
		this._password = password;
		this._creationDate = creationDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getUserId() {
		return _userId;
	}

	public void setUserId(int userId) {
		this._userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		this._userName = userName;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		this._password = password;
	}

	public Date getCreationDate() {
		return _creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this._creationDate = creationDate;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		this._active = active;
	}

	public UserDetail getUserDetail() {
		return _userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this._userDetail = userDetail;
	}
}