package com.app.jchat.model;

public class NewsLetersVo { 
	long newsLetterId;
	String email;
	String modified;
	String created;
	int enebled;
	public long getNewsLetterId() {
		return newsLetterId;
	}
	public void setNewsLetterId(long newsLetterId) {
		this.newsLetterId = newsLetterId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public int getEnebled() {
		return enebled;
	}
	public void setEnebled(int enebled) {
		this.enebled = enebled;
	}
	

}
