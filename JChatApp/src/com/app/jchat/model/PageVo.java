package com.app.jchat.model;

import java.sql.Date;

public class PageVo {
	long pageId;
	long regionId;
	long ParentID;
	int topMenu;
	int bottomMenu;
	int isBanner;
	int order;
	String menuLocation;
	String image;
	String type;
	Date date;
	Date datePublish;
	String templet;
	String slug;
	int repositoryId;
	long routeId;
	String created;
	String modified;
	int enabled;
	public long getPageId() {
		return pageId;
	}
	public void setPageId(long pageId) {
		this.pageId = pageId;
	}
	public long getRegionId() {
		return regionId;
	}
	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}
	public long getParentID() {
		return ParentID;
	}
	public void setParentID(long parentID) {
		ParentID = parentID;
	}
	public int getTopMenu() {
		return topMenu;
	}
	public void setTopMenu(int topMenu) {
		this.topMenu = topMenu;
	}
	public int getBottomMenu() {
		return bottomMenu;
	}
	public void setBottomMenu(int bottomMenu) {
		this.bottomMenu = bottomMenu;
	}
	public int getIsBanner() {
		return isBanner;
	}
	public void setIsBanner(int isBanner) {
		this.isBanner = isBanner;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getMenuLocation() {
		return menuLocation;
	}
	public void setMenuLocation(String menuLocation) {
		this.menuLocation = menuLocation;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDatePublish() {
		return datePublish;
	}
	public void setDatePublish(Date datePublish) {
		this.datePublish = datePublish;
	}
	public String getTemplet() {
		return templet;
	}
	public void setTemplet(String templet) {
		this.templet = templet;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public int getRepositoryId() {
		return repositoryId;
	}
	public void setRepositoryId(int repositoryId) {
		this.repositoryId = repositoryId;
	}
	public long getRouteId() {
		return routeId;
	}
	public void setRouteId(long routeId) {
		this.routeId = routeId;
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
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	

}
