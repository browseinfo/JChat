package com.app.jchat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class SaveUserSession {
	    static final String PREF_USER_NAME= "username";

	    static SharedPreferences getSharedPreferences(Context ctx) {
	        return PreferenceManager.getDefaultSharedPreferences(ctx);
	    }

	    public static void setUserName(Context ctx, String userName) 
	    {
	        Editor editor = getSharedPreferences(ctx).edit();
	        editor.putString(PREF_USER_NAME, userName);
	        editor.commit();
	    }

	    public static String getUserName(Context ctx)
	    {
	        return getSharedPreferences(ctx).getString(PREF_USER_NAME, "");
	    }
	    
	    public static String getValueFromKey(Context ctx, String prefKey)
	    {
	        return getSharedPreferences(ctx).getString(prefKey, "");
	    }
	    
	    public static void clearUserName(Context ctx) 
	    {
	        Editor editor = getSharedPreferences(ctx).edit();
	        editor.clear(); //clear all stored data
	        editor.commit();
	    }
	    
	    public static boolean containsKey(Context ctx, String prefKey) {
			return getSharedPreferences(ctx).contains(prefKey);
		}
	}