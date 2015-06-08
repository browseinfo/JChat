package com.app.jchat.model;

public class SocialLinks {
	long socialLinkId;
	String name;
	String tye;
	String title;
	String link;
	String created;
	String modified;
	int enebled;
	public long getSocialLinkId() {
		return socialLinkId;
	}
	public void setSocialLinkId(long socialLinkId) {
		this.socialLinkId = socialLinkId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTye() {
		return tye;
	}
	public void setTye(String tye) {
		this.tye = tye;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public int getEnebled() {
		return enebled;
	}
	public void setEnebled(int enebled) {
		this.enebled = enebled;
	}
	

}
