package com.dxc.ms.users;

import java.io.Serializable;

public class Users implements Serializable{
	private static final long serialVersionUID = 1L;
	private String usersFname;
	private String usersLname;
	private String usersShortId;
	private Long mobile;
	private String address;
	
	public String getUsersFname() {
		return usersFname;
	}
	public void setUsersFname(String usersFname) {
		this.usersFname = usersFname;
	}
	public String getUsersLname() {
		return usersLname;
	}
	public void setUsersLname(String usersLname) {
		this.usersLname = usersLname;
	}
	public String getUsersShortId() {
		return usersShortId;
	}
	public void setUsersShortId(String usersShortId) {
		this.usersShortId = usersShortId;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Users() {
		
	}
	
	public Users(String usersFname, String usersLname, String usersShortId, long mobile, String address) {
		this.usersFname = usersFname;
		this.usersLname = usersLname;
		this.usersShortId = usersShortId;
		this.mobile = mobile;
		this.address = address;
	}
}

