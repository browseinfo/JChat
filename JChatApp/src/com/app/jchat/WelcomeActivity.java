package com.app.jchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeActivity extends Activity {

	Button btnSignIn, btnCreateNewTeam;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);

//		if(SaveUserSession.containsKey(getApplicationContext(), SaveUserSession.PREF_USER_NAME)){
			if(!UserSession.getSessionId(getApplicationContext()).equalsIgnoreCase("")){
			Intent nextActivityIntent = new Intent(WelcomeActivity.this, MainActivity.class);
			startActivity(nextActivityIntent);
			finish();
		}
		btnSignIn = (Button) findViewById(R.id.btnSignIn);
		btnCreateNewTeam = (Button) findViewById(R.id.btnCreateNewTeam);

		setButtonClickListener();
	}


	public void setButtonClickListener() {
		// TODO Auto-generated method stub
		btnSignIn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent loginActivity = new Intent(getApplicationContext(), LoginActivity.class); 
				startActivity(loginActivity);
				finish();
			}
		});

		btnCreateNewTeam.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent createNewTeamActivity = new Intent(getApplicationContext(), CreateNewTeamActivity.class); 
				startActivity(createNewTeamActivity);
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
