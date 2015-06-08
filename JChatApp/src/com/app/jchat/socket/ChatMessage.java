package com.app.jchat.socket;

import android.graphics.drawable.Drawable;

public class ChatMessage {
	public boolean left;
	public String message;
	public Drawable drawableResource;
	private String fromName;
	private boolean isSelf;

	public ChatMessage() {

	}
	
	public ChatMessage(String fromName, String message, boolean isSelf) {
//		this.left = left;
		this.message = message;
//		this.drawableResource = drawable;
		this.fromName = fromName;
		this.isSelf = isSelf;
	}
	
	    public String getFromName() {
	        return fromName;
	    }
	 
	    public void setFromName(String fromName) {
	        this.fromName = fromName;
	    }
	 
	    public String getMessage() {
	        return message;
	    }
	 
	    public void setMessage(String message) {
	        this.message = message;
	    }
	 
	    public boolean isSelf() {
	        return isSelf;
	    }
	 
	    public void setSelf(boolean isSelf) {
	        this.isSelf = isSelf;
	    }
	 
}