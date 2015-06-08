package com.app.jchat.util;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.app.jchat.UserSession;

public class Utility {

	private static final String FLAG_MESSAGE = "message";
	private Context context;

	public Utility(Context context) {
		this.context = context;
	}
	
	public String getSendMessageJSON(String message) {
		String json = null;

		try {
			JSONObject jObj = new JSONObject();
			jObj.put("flag", FLAG_MESSAGE);
			jObj.put("sessionId", UserSession.getSessionId(context));
			jObj.put("message", message);

			json = jObj.toString();
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return json;
	}
}
