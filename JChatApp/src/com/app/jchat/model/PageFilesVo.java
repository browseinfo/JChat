package com.app.jchat.model;

public class PageFilesVo {
	long pageFilesId;
	String slideLang;
	int order;
	String fileName;
	String fileType;
	String link;
	String description;
	long pageId;
	String created;
	String modified;
	public long getPageFilesId() {
		return pageFilesId;
	}
	public void setPageFilesId(long pageFilesId) {
		this.pageFilesId = pageFilesId;
	}
	public String getSlideLang() {
		return slideLang;
	}
	public void setSlideLang(String slideLang) {
		this.slideLang = slideLang;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPageId() {
		return pageId;
	}
	public void setPageId(long pageId) {
		this.pageId = pageId;
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
	

}
