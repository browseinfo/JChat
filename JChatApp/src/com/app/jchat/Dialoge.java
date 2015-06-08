package com.app.jchat;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Dialoge extends Activity {
	Button btn1;
	 final Context context=this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.dialog);
	    btn1=(Button)findViewById(R.id.button_clik);
	    btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final CharSequence[] items = { "Create Channel"};
				 AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(Dialoge.this);
				alertDialogBuilder.setTitle("Channels");
				
				 alertDialogBuilder.setItems(items, new DialogInterface.OnClickListener(){
					 public void onClick(DialogInterface dialog, int id) {
						 LayoutInflater li = LayoutInflater.from(context);
						 //TextView tx_name=(TextView)findViewById(R.id.textView_name);
						 EditText et_name=(EditText)findViewById(R.id.editText_name);
							final View promptsView = li.inflate(R.layout.dialog_create_channel, null);
							AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Dialoge.this);
							 alertDialogBuilder.setTitle("Create New Channel");
							 alertDialogBuilder.setMessage("");
							 alertDialogBuilder.setView(promptsView);
							 
								final EditText userInput = (EditText) promptsView
										.findViewById(R.id.editText_name);
								alertDialogBuilder .setPositiveButton("Create",new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,int id) {
									}
								  });
								alertDialogBuilder.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,int id) {
										// if this button is clicked, just close
										// the dialog box and do nothing
										dialog.cancel();
									}
								});
									 
									           
									 
									          AlertDialog alertDialog = alertDialogBuilder.create();
									 
									          // show alert
									 
									          alertDialog.show();
									 
									     }
									});
			 
				
					 
				 alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener(){
						public void onClick(DialogInterface dialog, int item) {
						}
				}).show();
				 }
		});
	}
	
    
				public void upload_dialog(){ 
					final CharSequence[] items = { "Take Photo", "Take Video", "Choose From Gallery", "Upload a File", };
					 final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Dialoge.this);
					alertDialogBuilder.setNegativeButton("Cancel",  new DialogInterface.OnClickListener(){
						 public void onClick(DialogInterface dialog, int item) {
							
					 alertDialogBuilder.setItems(items, new DialogInterface.OnClickListener(){
					        public void onClick(DialogInterface dialog, int item) {
				}
					        
				}).show();
						 }
					});
				}
	}
		
				

	    
	
			
				
	



