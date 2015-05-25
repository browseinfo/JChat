package com.app.jchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class EmailAddressInputActivity extends Activity {

	Button btnContinue;

	EditText etEmailAddress;
//	EditText etPassword;
//	DatabaseHelper db;
	boolean b = true;

	@Override
	protected void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.email_address_page);
		
		etEmailAddress = (EditText)findViewById(R.id.etEmailAddress);
		btnContinue = (Button) findViewById(R.id.btnContinue);

		setButtonClickListener();

	}

	public void setButtonClickListener() {
		// TODO Auto-generated method stub
		btnContinue.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent passwordActivity = new Intent(getApplicationContext(), PasswordInputActivity.class);
				passwordActivity.putExtra("userEmail", etEmailAddress.getText().toString().trim());
				startActivity(passwordActivity);
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
