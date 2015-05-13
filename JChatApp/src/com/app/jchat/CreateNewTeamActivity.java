package com.app.jchat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CreateNewTeamActivity extends Activity {

	Button btnContinue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_new_team);

		btnContinue = (Button) findViewById(R.id.btnCreateNewTeam);

//		setButtonClickListener();
	}


	public void setButtonClickListener() {
		// TODO Auto-generated method stub
		btnContinue.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				Intent loginActivity = new Intent(getApplicationContext(), LoginActivity.class); 
//				startActivity(loginActivity);
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
