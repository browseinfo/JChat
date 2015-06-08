package com.app.jchat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class UserSession {
	    static final String PREF_SESSION_ID= "session_id";

	    static SharedPreferences getSharedPreferences(Context ctx) {
	        return PreferenceManager.getDefaultSharedPreferences(ctx);
	    }

	    public static void setSessionId(Context ctx, String userName) 
	    {
	        Editor editor = getSharedPreferences(ctx).edit();
	        editor.putString(PREF_SESSION_ID, userName);
	        editor.commit();
	    }

	    public static String getSessionId(Context ctx)
	    {
	        return getSharedPreferences(ctx).getString(PREF_SESSION_ID, "");
	    }
	    
	    public static String getValueFromKey(Context ctx, String prefKey)
	    {
	        return getSharedPreferences(ctx).getString(prefKey, "");
	    }
	    
	    public static void clearSessionId(Context ctx) 
	    {
	        Editor editor = getSharedPreferences(ctx).edit();
	        editor.clear(); //clear all stored data
	        editor.commit();
	    }
	    
	    public static boolean containsKey(Context ctx, String prefKey) {
			return getSharedPreferences(ctx).contains(prefKey);
		}
	}