package com.app.jchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PasswordInputActivity extends Activity {

	Button btnContinue;

//	EditText etUsername;
//	EditText etPassword;
//	DatabaseHelper db;
	boolean b = true;

	@Override
	protected void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.password_page);
		
		btnContinue = (Button) findViewById(R.id.btnContinue);

		setButtonClickListener();

	}

	public void setButtonClickListener() {
		// TODO Auto-generated method stub
		btnContinue.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class); 
				startActivity(mainActivity);
				finish();
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
