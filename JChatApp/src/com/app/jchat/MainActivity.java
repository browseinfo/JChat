package com.app.jchat;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.jchat.socket.ChatMessage;

public class MainActivity extends Activity {

	private static String TAG = MainActivity.class.getSimpleName();

	ListView mDrawerListLeft, mDrawerListRight;
	RelativeLayout mDrawerPaneLeft, mDrawerPaneRight;
	private ActionBarDrawerToggle mDrawerToggle;
	private DrawerLayout mDrawerLayout;

	ArrayList<NavItem> mNavItems = new ArrayList<NavItem>();
	ArrayList<NavItem> mNavRightItems = new ArrayList<NavItem>();
	ArrayList<ChatMessage> messageList;
	private ChatArrayAdapter chatArrayAdapter;

	ImageButton btnSendMsg, btnUpload;

	ListView chatHistoryList;
	EditText etChatText;
	private boolean side = true;
	final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		mNavItems.add(new NavItem("CHANNELS", "", R.drawable.ic_add_new));
		mNavItems.add(new NavItem("  # general", "", 0));
		mNavItems.add(new NavItem("  # random", "", 0));
		mNavItems
		.add(new NavItem("DIRECT MESSAGES", "", R.drawable.ic_add_new));
		mNavItems.add(new NavItem("  @jchat", "", 0));
		mNavItems.add(new NavItem("PRIVATE GROUPS", "", R.drawable.ic_add_new));

		// DrawerLayout
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

		// Populate the Navigtion Drawer with options
		mDrawerPaneLeft = (RelativeLayout) findViewById(R.id.drawerPane);
		mDrawerPaneRight = (RelativeLayout) findViewById(R.id.drawerPaneRight);

		mDrawerListLeft = (ListView) findViewById(R.id.navListLeft);
		LeftDrawerListAdapter adapter = new LeftDrawerListAdapter(this,
				mNavItems);
		mDrawerListLeft.setAdapter(adapter);
		mDrawerListLeft.setDividerHeight(0);

		// Drawer Item click listeners
		mDrawerListLeft
		.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				selectItemFromDrawerLeft(position);
			}
		});

		mNavRightItems.add(new NavItem("Recent Mentions", "",
				R.drawable.ic_icon));
		mNavRightItems.add(new NavItem("Your Files", "", R.drawable.ic_icon));
		mNavRightItems.add(new NavItem("All Files", "", R.drawable.ic_icon));
		mNavRightItems.add(new NavItem("Starred Items", "",
				R.drawable.ic_starred));
		mNavRightItems
		.add(new NavItem("Team Directory", "", R.drawable.ic_icon));
		mNavRightItems.add(new NavItem("Settings", "", R.drawable.ic_icon));

		mDrawerListRight = (ListView) findViewById(R.id.navListRight);
		RightDrawerListAdapter adapterRight = new RightDrawerListAdapter(this,
				mNavRightItems);
		mDrawerListRight.setAdapter(adapterRight);

		// Drawer Item click listeners
		mDrawerListRight
		.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				selectItemFromDrawerRight(position);
			}
		});

		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				android.R.drawable.ic_lock_lock, R.string.drawer_open,
				R.string.drawer_close) {
			@Override
			public void onDrawerOpened(View drawerView) {
				super.onDrawerOpened(drawerView);

				invalidateOptionsMenu();
				mDrawerToggle.syncState();
			}

			@Override
			public void onDrawerClosed(View drawerView) {
				super.onDrawerClosed(drawerView);
				Log.d(TAG, "onDrawerClosed: " + getTitle());

				invalidateOptionsMenu();
				mDrawerToggle.syncState();
			}
		};

		mDrawerLayout.setDrawerListener(mDrawerToggle);
		
	}

	
	// Called when invalidateOptionsMenu() is invoked
	public boolean onPrepareOptionsMenu(Menu menu) {
		// If the nav drawer is open, hide action items related to the content
		// view
		// boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerListLeft);
		// menu.findItem(R.id.action_search).setVisible(!drawerOpen);
		return super.onPrepareOptionsMenu(menu);
	}

	public void selectItemFromDrawerLeft(int position) {
		// TODO Auto-generated method stub
		Fragment fragment = null;
		switch (position) {
		case 0:

			break;
		case 1:
			PreferenceFragment prefFragment = new PreferenceFragment();
			fragment = prefFragment;
			break;
		case 4:
			ChatViewFragment chatViewFragment = new ChatViewFragment(this,mNavItems.get(position).mTitle);
			fragment = chatViewFragment;
			// View view = chatViewFragment.getView();
			// btnSendMsg = chatViewFragment.getBtnSendMsg();
			// btnUpload = chatViewFragment.getBtnUpload();
			// chatViewFragment.setButtonClickListener(this);
			// setButtonClickListener(chatViewFragment.getView());
			// chatViewFragment.setListAdapter();

			break;
		default:
			break;
		}

		if (fragment != null) {
			FragmentManager fragmentManager = getFragmentManager();
			fragmentManager.beginTransaction()
			.replace(R.id.mainContent, fragment).commit();

			// btnSendMsg = (ImageButton) findViewById(R.id.btnSend);
			// btnUpload = (ImageButton) findViewById(R.id.btnUploadDialog);
			//
			// chatHistoryList = (ListView) findViewById(R.id.chatHistory);
			// etChatText = (EditText) findViewById(R.id.chatText);
			// setListAdapter();

			mDrawerListLeft.setItemChecked(position, true);
			setTitle(mNavItems.get(position).mTitle);
		}
		// Close the drawer
		mDrawerLayout.closeDrawer(mDrawerPaneLeft);

	}

	public void selectItemFromDrawerRight(int position) {
		// TODO Auto-generated method stub
		Fragment fragment = null;
		switch (position) {
		case 0:
			// fragment = new PreferenceFragment();
			break;

		case 1:
			// fragment = new ChatViewFragment();
			break;
		case 5:
			Intent intent = new Intent(context, title.class);
			startActivity(intent);
			break;
		default:
			break;
		}

		if (fragment != null) {
			FragmentManager fragmentManager = getFragmentManager();
			fragmentManager.beginTransaction()
			.replace(R.id.mainContent, fragment).commit();

			// LayoutInflater inflater = getLayoutInflater();
			// RelativeLayout container = (RelativeLayout)
			// findViewById(R.id.mainContent);
			// inflater.inflate(R.layout.fragment_chat_view, container);
			mDrawerListRight.setItemChecked(position, true);
			setTitle(mNavRightItems.get(position).mTitle);
		}

		// Close the drawer
		mDrawerLayout.closeDrawer(mDrawerPaneRight);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class NavItem {
		String mTitle;
		String mSubtitle;
		int mIcon;

		public NavItem(String title, String subtitle, int icon) {
			mTitle = title;
			mSubtitle = subtitle;
			mIcon = icon;
		}
	}

	class LeftDrawerListAdapter extends BaseAdapter {

		Context mContext;
		ArrayList<NavItem> mNavItems;

		public LeftDrawerListAdapter(Context context,
				ArrayList<NavItem> navItems) {
			mContext = context;
			mNavItems = navItems;
		}

		@Override
		public int getCount() {
			return mNavItems.size();
		}

		@Override
		public Object getItem(int position) {
			return mNavItems.get(position);
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view;

			if (convertView == null) {
				LayoutInflater inflater = (LayoutInflater) mContext
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				view = inflater.inflate(R.layout.drawer_item, null);
			} else {
				view = convertView;
			}

			TextView titleView = (TextView) view.findViewById(R.id.title);
			// TextView subtitleView = (TextView)
			// view.findViewById(R.id.subTitle);
			ImageView iconView = (ImageView) view.findViewById(R.id.icon);

			titleView.setText(mNavItems.get(position).mTitle);
			// subtitleView.setText( mNavItems.get(position).mSubtitle );
			iconView.setImageResource(mNavItems.get(position).mIcon);

			if ((mNavItems.get(position).mTitle).equalsIgnoreCase("Channels")) {
				iconView.setVisibility(View.VISIBLE);
				iconView.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						openChannelDialogbox();
					}
				});
			} else if ((mNavItems.get(position).mTitle)
					.equalsIgnoreCase("Direct Messages")) {
				iconView.setVisibility(View.VISIBLE);
				iconView.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						openDirectMessageDialogbox();
					}
				});
			} else if ((mNavItems.get(position).mTitle)
					.equalsIgnoreCase("Private Groups")) {
				iconView.setVisibility(View.VISIBLE);
				iconView.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						openGroupDialogbox();
					}
				});
			} else {
				iconView.setVisibility(View.GONE);
			}
			return view;
		}
	}

	public void openChannelDialogbox() {
		final CharSequence[] items = { "Create Channel" };
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);
		alertDialogBuilder.setTitle("Channels");

		alertDialogBuilder.setItems(items,
				new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				LayoutInflater li = LayoutInflater.from(context);
				// TextView
				// tx_name=(TextView)findViewById(R.id.textView_name);
				EditText et_name = (EditText) findViewById(R.id.editText_name);
				final View promptsView = li.inflate(
						R.layout.dialog_create_channel, null);
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);
				alertDialogBuilder.setTitle("Create New Channel");
				// alertDialogBuilder.setMessage("");
				alertDialogBuilder.setView(promptsView);

				final EditText userInput = (EditText) promptsView
						.findViewById(R.id.editText_name);
				alertDialogBuilder.setPositiveButton("Create",
						new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,
							int id) {
					}
				});
				alertDialogBuilder.setNegativeButton("Cancel",
						new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,
							int id) {
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

		alertDialogBuilder.setNeutralButton("Cancel",
				new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int item) {
			}
		}).show();
	}

	public void openGroupDialogbox() {
		final CharSequence[] items = { "Create Group" };
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);
		alertDialogBuilder.setTitle("Groups");

		alertDialogBuilder.setItems(items,
				new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				LayoutInflater li = LayoutInflater.from(context);
				// TextView
				// tx_name=(TextView)findViewById(R.id.textView_name);
				EditText et_name = (EditText) findViewById(R.id.editText_name);
				final View promptsView = li.inflate(
						R.layout.dialog_create_channel, null);
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);
				alertDialogBuilder.setTitle("Create New Private Group");
				// alertDialogBuilder.setMessage("");
				alertDialogBuilder.setView(promptsView);

				final EditText userInput = (EditText) promptsView
						.findViewById(R.id.editText_name);
				alertDialogBuilder.setPositiveButton("Create",
						new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,
							int id) {
					}
				});
				alertDialogBuilder.setNegativeButton("Cancel",
						new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,
							int id) {
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

		alertDialogBuilder.setNeutralButton("Cancel",
				new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int item) {
			}
		}).show();
	}

	public void openDirectMessageDialogbox() {
		final CharSequence[] items = { "Open DM" };
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);
		alertDialogBuilder.setTitle("Open DM");

		LayoutInflater li = LayoutInflater.from(context);
		// TextView tx_name=(TextView)findViewById(R.id.textView_name);
		EditText et_name = (EditText) findViewById(R.id.editText_name);
		final View promptsView = li.inflate(
				R.layout.custom_dialog_direct_messages, null);
		alertDialogBuilder.setView(promptsView);

		final EditText userInput = (EditText) promptsView
				.findViewById(R.id.editText_name);
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

	}

	class RightDrawerListAdapter extends BaseAdapter {

		Context mContext;
		ArrayList<NavItem> mNavItems;

		public RightDrawerListAdapter(Context context,
				ArrayList<NavItem> navItems) {
			mContext = context;
			mNavItems = navItems;
		}

		@Override
		public int getCount() {
			return mNavItems.size();
		}

		@Override
		public Object getItem(int position) {
			return mNavItems.get(position);
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view;

			if (convertView == null) {
				LayoutInflater inflater = (LayoutInflater) mContext
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				view = inflater.inflate(R.layout.drawer_item_right, null);
			} else {
				view = convertView;
			}

			TextView titleView = (TextView) view.findViewById(R.id.title);
			// TextView subtitleView = (TextView)
			// view.findViewById(R.id.subTitle);
			ImageView iconView = (ImageView) view.findViewById(R.id.icon);

			titleView.setText(mNavItems.get(position).mTitle);
			// subtitleView.setText( mNavItems.get(position).mSubtitle );
			iconView.setImageResource(mNavItems.get(position).mIcon);

			return view;
		}
	}
}
