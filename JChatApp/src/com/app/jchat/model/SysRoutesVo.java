package com.app.jchat.model;

public class SysRoutesVo {
	long sysRoutesId;
	String slug;
	String controller;
	String type;
	long websiteId;
	long coupanID;
	long categoryId;
	String created;
	String modified;
	int enebled;
	public long getSysRoutesId() {
		return sysRoutesId;
	}
	public void setSysRoutesId(long sysRoutesId) {
		this.sysRoutesId = sysRoutesId;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getController() {
		return controller;
	}
	public void setController(String controller) {
		this.controller = controller;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getWebsiteId() {
		return websiteId;
	}
	public void setWebsiteId(long websiteId) {
		this.websiteId = websiteId;
	}
	public long getCoupanID() {
		return coupanID;
	}
	public void setCoupanID(long coupanID) {
		this.coupanID = coupanID;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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
