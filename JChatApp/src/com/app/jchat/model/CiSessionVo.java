package com.app.jchat.model;

public class CiSessionVo {
	String sessionId;
	String ipAddress;
	String urgentAgent;
	int lastActivity;
	String userData;
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUrgentAgent() {
		return urgentAgent;
	}
	public void setUrgentAgent(String urgentAgent) {
		this.urgentAgent = urgentAgent;
	}
	public int getLastActivity() {
		return lastActivity;
	}
	public void setLastActivity(int lastActivity) {
		this.lastActivity = lastActivity;
	}
	public String getUserData() {
		return userData;
	}
	public void setUserData(String userData) {
		this.userData = userData;
	}

}
