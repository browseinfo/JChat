package com.app.jchat.model;

public class StaticText {
	long staticTextId;
	long parentId;
	String name;
	String type;
	int order;
	String image;
	String created;
	String modified;
	int enebled;
	public long getStaticTextId() {
		return staticTextId;
	}
	public void setStaticTextId(long staticTextId) {
		this.staticTextId = staticTextId;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
