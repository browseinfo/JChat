package com.app.jchat;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.view.Menu;

public class displa extends PreferenceActivity {

	CheckBoxPreference systemDefault;
	CheckBoxPreference Lato;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		addPreferencesFromResource(R.xml.display_settings);

		systemDefault = (CheckBoxPreference) findPreference("display_setting_systemdefault");
		Lato = (CheckBoxPreference) findPreference("display_setting_lato");

		systemDefault
		.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			@Override
			public boolean onPreferenceChange(Preference preference,
					Object newValue) {
				// TODO Auto-generated method stub

				systemDefault.setChecked(true);
				Lato.setChecked(false);

				return true;
			}

		});

		Lato.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			@Override
			public boolean onPreferenceChange(Preference preference,
					Object newValue) {
				// TODO Auto-generated method stub

				systemDefault.setChecked(false);
				Lato.setChecked(true);

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
