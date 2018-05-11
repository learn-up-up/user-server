package com.bgs.mylove.userserver.entity;

import java.util.Date;

/**
 * @Author wujianwen
 * @CreateDate 20180418
 */
public class User {
	private String	id;			//自增id
	private String	username; 	//昵称
	private String	password;	//密码
	private String	email;		//邮件地址
	private String	phone;		//手机号码
	private Date	createTime;	//创建时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
