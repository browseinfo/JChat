package com.app.jchat;

import android.graphics.drawable.Drawable;

public class ChatMessage {
	public boolean left;
	public String message;
	public Drawable drawableResource;

	public ChatMessage(boolean left, String message, Drawable drawable) {
		super();
		this.left = left;
		this.message = message;
		this.drawableResource = drawable;
	}
}