package com.app.jchat;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.jchat.socket.ChatMessage;

public class ChatArrayAdapter extends BaseAdapter {

	private Context context;
	private ImageView userImage;
	private List<ChatMessage> chatMessageList = new ArrayList<ChatMessage>();
	private LinearLayout singleMessageContainer;

//	@Override
//	public void add(ChatMessage object) {
//		chatMessageList.add(object);
//		super.add(object);
//	}

	public ChatArrayAdapter(Context context, List<ChatMessage> messageList) {
		this.context = context;
		this.chatMessageList = messageList;
	}

	public int getCount() {
		return this.chatMessageList.size();
	}

	public ChatMessage getItem(int index) {
		return this.chatMessageList.get(index);
	}
	
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		if (row == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.chat_bubble, parent, false);
		}
		singleMessageContainer = (LinearLayout) row.findViewById(R.id.singleMessageContainer);
		ChatMessage chatMessageObj = getItem(position);
		
		TextView tvFromName = (TextView) row.findViewById(R.id.lblMsgFrom);		
		TextView chatText = (TextView) row.findViewById(R.id.singleMessage);
		
		tvFromName.setText(chatMessageObj.getFromName());
		chatText.setText(chatMessageObj.message);
		chatText.setBackgroundResource(chatMessageObj.isSelf() ? R.drawable.chat_background_right : R.drawable.chat_background_left);
		
//		userImage = (ImageView) row.findViewById(R.id.userImage);
//		userImage.setBackground(chatMessageObj.drawableResource);
		
		singleMessageContainer.setGravity(chatMessageObj.isSelf() ? Gravity.RIGHT : Gravity.LEFT);
		return row;
	}

	public Bitmap decodeToBitmap(byte[] decodedByte) {
		return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
	}

	

	/*
		private Context context;
		private List<Message> messagesItems;

		public ChatArrayAdapter(Context context, List<Message> navDrawerItems) {
			this.context = context;
			this.messagesItems = navDrawerItems;
		}

		@Override
		public int getCount() {
			return messagesItems.size();
		}

		@Override
		public Object getItem(int position) {
			return messagesItems.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@SuppressLint("InflateParams")
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			/**
			 * The following list not implemented reusable list items as list items
			 * are showing incorrect data Add the solution if you have one
			 * *

			Message m = messagesItems.get(position);

			LayoutInflater mInflater = (LayoutInflater) context
					.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

			// Identifying the message owner
			if (messagesItems.get(position).isSelf()) {
				// message belongs to you, so load the right aligned layout
				convertView = mInflater.inflate(R.layout.chat_bubble,
						null);
			} else {
				// message belongs to other person, load the left aligned layout
				convertView = mInflater.inflate(R.layout.chat_bubble,
						null);
			}

			TextView lblFrom = (TextView) convertView.findViewById(R.id.lblMsgFrom);
			TextView txtMsg = (TextView) convertView.findViewById(R.id.singleMessage);

			txtMsg.setText(m.getMessage());
			lblFrom.setText(m.getFromName());

			return convertView;
		}
*/

}