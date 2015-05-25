package com.app.jchat;

import android.app.Activity;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;

public class SetPrefActivity extends PreferenceActivity  {
	CheckBoxPreference pref_opt1;
	CheckBoxPreference pref_opt2;
	CheckBoxPreference pref_opt3;
	CheckBoxPreference pref_opt4;
	CheckBoxPreference pref_opt5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.pref);
		pref_opt1 =(CheckBoxPreference) findPreference("pref_opt1");
		pref_opt2 =(CheckBoxPreference) findPreference("pref_opt2");
		pref_opt3 =(CheckBoxPreference) findPreference("pref_opt3");
		pref_opt4 =(CheckBoxPreference) findPreference("pref_opt4");
		pref_opt5 =(CheckBoxPreference) findPreference("pref_opt5");
		
		
		pref_opt1.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			
			@Override
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				// TODO Auto-generated method stub
				
				 pref_opt1.setChecked(true);
			     pref_opt2.setChecked(false);
			     pref_opt3.setChecked(false);
			     pref_opt4.setChecked(false);
			     pref_opt5.setChecked(false);


			        return true;
	
			}
		});
		
		pref_opt2.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			
			@Override
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				// TODO Auto-generated method stub
				pref_opt1.setChecked(false);
			     pref_opt2.setChecked(true);
			     pref_opt3.setChecked(false);
			     pref_opt4.setChecked(false);
			     pref_opt5.setChecked(false);
				return true;
			}
		});
		pref_opt3.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			
			@Override
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				// TODO Auto-generated method stub
				pref_opt1.setChecked(false);
			     pref_opt2.setChecked(false);
			     pref_opt3.setChecked(true);
			     pref_opt4.setChecked(false);
			     pref_opt5.setChecked(false);
				return true;
			}
		});
		pref_opt4.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			
			@Override
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				// TODO Auto-generated method stub
				pref_opt1.setChecked(false);
			     pref_opt2.setChecked(false);
			     pref_opt3.setChecked(false);
			     pref_opt4.setChecked(true);
			     pref_opt5.setChecked(false);
				return true;
			}
		});
		pref_opt5.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			
			@Override
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				// TODO Auto-generated method stub
				pref_opt1.setChecked(false);
			     pref_opt2.setChecked(false);
			     pref_opt3.setChecked(false);
			     pref_opt4.setChecked(false);
			     pref_opt5.setChecked(true);
				
				return true;
			}
		});
	}
}
