package com.app.jchat;

import java.io.InputStream;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

public class ChatViewFragment extends Fragment {


//	public static final int RESULT_OK = 100;

	private static final int HALF = 2;

	private static final int REQUEST_CAPTURE_IMAGE = 101;
	private static final int REQUEST_CAPTURE_VIDEO = 102;
	public static final int REQUEST_IMAGE_GALLERY = 103;

	ImageButton btnSendMsg, btnUpload;

	ListView chatHistoryList;
	EditText etChatText;
	private ChatArrayAdapter chatArrayAdapter;
	private boolean side = true;
	//	View chatView;
	private Context context;

	public ChatViewFragment(Context context) {
		// Required empty public constructor
		this.context = context;
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.chat_view, container, false);

		return view;
	}

	@Override
	public void	onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		setButtonClickListener();
		setListAdapter();

	}

	public void setButtonClickListener() {
		// TODO Auto-generated method stub
		View chatView = getView();
		btnSendMsg = (ImageButton) chatView.findViewById(R.id.btnSend);
		btnUpload = (ImageButton) chatView.findViewById(R.id.btnUploadDialog);

		chatHistoryList  = (ListView) chatView.findViewById(R.id.chatHistory);
		etChatText = (EditText) chatView.findViewById(R.id.chatText);

		btnSendMsg.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendChatMessage();
			}
		});

		btnUpload.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				uploadButtonDialog();
			}
		});
	}

	public ImageButton getBtnSendMsg() {
		return btnSendMsg;
	}


	public ImageButton getBtnUpload() {
		return btnUpload;
	}


	protected boolean sendChatMessage() {
		// TODO Auto-generated method stub
		if(!etChatText.getText().toString().trim().equals("")){
			chatArrayAdapter.add(new ChatMessage(side, etChatText.getText().toString(),getResources().getDrawable(R.drawable.ic_launcher)));
			etChatText.setText("");
		}
		//        side = !side;
		return true;
	}

	public void uploadButtonDialog(){

		final CharSequence[] items = { "Take Photo", "Take Video", "Choose From Gallery", "Upload a File" };

		final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
		alertDialogBuilder.setTitle("Upload");

		alertDialogBuilder.setItems(items, new DialogInterface.OnClickListener(){
			public void onClick(DialogInterface dialog, int item) {
				switch (item) {
				case 0:
//					Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE); 
//		            cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
		            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		            startActivityForResult(cameraIntent, REQUEST_CAPTURE_IMAGE);
//					startActivityForResult(intent, REQUEST_CAPTURE_IMAGE);
					
					break;

				case 1:
		            Intent videoIntent = new Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
		            startActivityForResult(videoIntent, REQUEST_CAPTURE_VIDEO);
					
					break;
					
				case 2:
					//					Intent i = new Intent(
					//							Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
					//					startActivityForResult(i, REQUEST_IMAGE_GALLERY);

					Intent imgIntent = new Intent();
					imgIntent.setAction(Intent.ACTION_GET_CONTENT);
					imgIntent.addCategory(Intent.CATEGORY_OPENABLE);
					imgIntent.setType("image/*");
					startActivityForResult(imgIntent, REQUEST_IMAGE_GALLERY);

					break;
				default:
					break;
				}
			}
		});

		alertDialogBuilder.setNegativeButton("Cancel",  new DialogInterface.OnClickListener(){
			public void onClick(DialogInterface dialog, int item) {

			}
		});

		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();

		//		new UploadButtonDialog().getDialog().show();

		//		FragmentManager fm = getFragmentManager();
		//        UploadButtonDialog testDialog = new UploadButtonDialog();
		//        testDialog.setRetainInstance(true);
		//        testDialog.show(fm, "fragment_name");

	}

	public void setListAdapter() {
		// TODO Auto-generated method stub
		chatArrayAdapter = new ChatArrayAdapter(getView().getContext(), R.layout.chat_bubble);
		chatHistoryList.setAdapter(chatArrayAdapter);
		chatHistoryList.setDividerHeight(0);
	}


	//	public class DFragment extends FragmentActivity {
	//		@Override
	//		public void onCreate(Bundle savedInstanceState) {
	//			
	//			final CharSequence[] items = { "Take Photo", "Take Video", "Choose From Gallery", "Upload a File" };
	//			
	//			final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
	//			alertDialogBuilder.setItems(items, new DialogInterface.OnClickListener(){
	//				public void onClick(DialogInterface dialog, int item) {
	//				}
	//			});
	//
	//			alertDialogBuilder.setNegativeButton("Cancel",  new DialogInterface.OnClickListener(){
	//				public void onClick(DialogInterface dialog, int item) {
	//
	//				}
	//			});
	//
	//			
	//		}
	//	}

		@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		InputStream stream = null;
		if (requestCode == REQUEST_IMAGE_GALLERY && resultCode == Activity.RESULT_OK) {
			try {

				stream = getActivity().getContentResolver().openInputStream(data.getData());

				Bitmap original = BitmapFactory.decodeStream(stream);

//					        ((ImageView)findViewById(R.id.imageview)).setImageBitmap(Bitmap.createScaledBitmap(original,
//					original.getWidth()/HALF, original.getHeight()/HALF, true));
				openImageView(original);
			} catch (Exception e) {

				e.printStackTrace();

			}

			if (stream != null) {
				try {

					stream.close();

				} catch (Exception e) {

					e.printStackTrace();

				}

			}
		}else if (requestCode == REQUEST_CAPTURE_IMAGE && resultCode == Activity.RESULT_OK) {
			try {

//				stream = getActivity().getContentResolver().openInputStream(data.getData());
				Bitmap photo = (Bitmap) data.getExtras().get("data");
//				Bitmap original = BitmapFactory.decodeStream(stream);

//					        ((ImageView)findViewById(R.id.imageview)).setImageBitmap(Bitmap.createScaledBitmap(original,
//					original.getWidth()/HALF, original.getHeight()/HALF, true));
				openImageView(photo);
			} catch (Exception e) {

				e.printStackTrace();

			}

//			if (stream != null) {
//				try {
//
//					stream.close();
//
//				} catch (Exception e) {
//
//					e.printStackTrace();
//
//				}
//
//			}
		}else if (requestCode == REQUEST_CAPTURE_VIDEO && resultCode == Activity.RESULT_OK) {
			try {

//				stream = getActivity().getContentResolver().openInputStream(data.getData());
//				Bitmap photo = (Bitmap) data.getExtras().get("data");
//				Bitmap original = BitmapFactory.decodeStream(stream);

//					        ((ImageView)findViewById(R.id.imageview)).setImageBitmap(Bitmap.createScaledBitmap(original,
//					original.getWidth()/HALF, original.getHeight()/HALF, true));
//				openImageView(photo);
				Intent intent = new Intent(context, UploadToTeamActivity.class);
//				intent.putExtra("image", original);
				startActivity(intent);
			} catch (Exception e) {

				e.printStackTrace();

			}
		}
	}
		public void openImageView(Bitmap original) {
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
					context);
			alertDialogBuilder.setTitle("Image");

			LayoutInflater li = LayoutInflater.from(context);
			// TextView tx_name=(TextView)findViewById(R.id.textView_name);

			final View promptsView = li.inflate(
					R.layout.image_view, null);
			alertDialogBuilder.setView(promptsView);

			final ImageView image = (ImageView) promptsView
					.findViewById(R.id.imageview);
			
			image.setImageBitmap(Bitmap.createScaledBitmap(original,
					original.getWidth()/HALF, original.getHeight()/HALF, true));
			
			alertDialogBuilder.setNeutralButton("Cancel",
					new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					// if this button is clicked, just close
					// the dialog box and do nothing
					dialog.cancel();
				}
			});
			AlertDialog alertDialog = alertDialogBuilder.create();

			// show alert

			alertDialog.show();
			
			Intent intent = new Intent(context, UploadToTeamActivity.class);
			intent.putExtra("image", original);
			startActivity(intent);

		}


}