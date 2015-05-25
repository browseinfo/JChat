package com.app.jchat;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.view.Menu;

public class setting extends PreferenceActivity {
	PreferenceScreen pr_team;
	SwitchPreference pr_status;
	PreferenceScreen pr_display;
	PreferenceScreen pr_notification;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.setting_page);
		pr_team = (PreferenceScreen) findPreference("setting_team");
		pr_status = (SwitchPreference) findPreference("setting_status");
		pr_display = (PreferenceScreen) findPreference("setting_display");
		pr_notification = (PreferenceScreen) findPreference("setting_notification");
		
		pr_team.setOnPreferenceClickListener(new OnPreferenceClickListener() {

			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(setting.this, title.class);
				startActivity(i);
				return true;

			}
		});
		
		pr_display.setOnPreferenceClickListener(new OnPreferenceClickListener() {

			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(setting.this, displa.class);
				startActivity(i);
				return true;

			}
		});
		
		pr_notification.setOnPreferenceClickListener(new OnPreferenceClickListener() {

			@Override
			public boolean onPreferenceClick(Preference arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(setting.this, SetPrefActivity.class);
				startActivity(i);
				return true;

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
