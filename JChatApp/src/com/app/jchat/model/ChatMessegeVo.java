package com.app.jchat.model;

import java.sql.Date;

public class ChatMessegeVo { 
	int messegeId;
	String messegeContent;
	int userId;
	String userName;
	String recipint;
	String recipintType;
	int recipintId;
	Date messegeTime;
	int read;
	String createDate;
	public int getMessegeId() {
		return messegeId;
	}
	public void setMessegeId(int messegeId) {
		this.messegeId = messegeId;
	}
	public String getMessegeContent() {
		return messegeContent;
	}
	public void setMessegeContent(String messegeContent) {
		this.messegeContent = messegeContent;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRecipint() {
		return recipint;
	}
	public void setRecipint(String recipint) {
		this.recipint = recipint;
	}
	public String getRecipintType() {
		return recipintType;
	}
	public void setRecipintType(String recipintType) {
		this.recipintType = recipintType;
	}
	public int getRecipintId() {
		return recipintId;
	}
	public void setRecipintId(int recipintId) {
		this.recipintId = recipintId;
	}
	public Date getMessegeTime() {
		return messegeTime;
	}
	public void setMessegeTime(Date messegeTime) {
		this.messegeTime = messegeTime;
	}
	public int getRead() {
		return read;
	}
	public void setRead(int read) {
		this.read = read;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	
	

}
