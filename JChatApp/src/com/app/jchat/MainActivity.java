 package com.app.jchat;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static String TAG = MainActivity.class.getSimpleName();
	 
	ListView mDrawerListLeft, mDrawerListRight;
	RelativeLayout mDrawerPaneLeft,mDrawerPaneRight;
	private ActionBarDrawerToggle mDrawerToggle;
	private DrawerLayout mDrawerLayout;
	 
	ArrayList<NavItem> mNavItems = new ArrayList<NavItem>();
    ArrayList<NavItem> mNavRightItems = new ArrayList<NavItem>();
    private ChatArrayAdapter chatArrayAdapter;
    
    ImageButton btnSendMsg;
    ListView chatHistoryList;
    EditText etChatText;
    private boolean side = true;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    getActionBar().setDisplayHomeAsUpEnabled(true);
	    
	    mNavItems.add(new NavItem("CHANNELS", "", 0));
	    mNavItems.add(new NavItem("  # general", "", 0));
	    mNavItems.add(new NavItem("  # random", "", 0));
	    mNavItems.add(new NavItem("DIRECT MESSAGES", "", 0));
	    mNavItems.add(new NavItem("  @jchat", "", 0));
	    mNavItems.add(new NavItem("PRIVATE GROUPS", "", 0));
		 
		 
	    // DrawerLayout
	    mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
	 
	    // Populate the Navigtion Drawer with options
	    mDrawerPaneLeft = (RelativeLayout) findViewById(R.id.drawerPane);
	    mDrawerPaneRight = (RelativeLayout) findViewById(R.id.drawerPaneRight);
	    
	    mDrawerListLeft = (ListView) findViewById(R.id.navListLeft);
	    LeftDrawerListAdapter adapter = new LeftDrawerListAdapter(this, mNavItems);
	    mDrawerListLeft.setAdapter(adapter);
	    mDrawerListLeft.setDividerHeight(0);
	    
	    // Drawer Item click listeners
	    mDrawerListLeft.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	        @Override
	        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	            selectItemFromDrawerLeft(position);
	        }
	    });
	    
	    mNavRightItems.add(new NavItem("Recent Mentions", "", R.drawable.ic_icon));
        mNavRightItems.add(new NavItem("Your Files", "", R.drawable.ic_icon));
        mNavRightItems.add(new NavItem("All Files", "", R.drawable.ic_icon));
        mNavRightItems.add(new NavItem("Starred Items", "", R.drawable.ic_starred));
        mNavRightItems.add(new NavItem("Team Directory", "", R.drawable.ic_icon));
        mNavRightItems.add(new NavItem("Settings", "", R.drawable.ic_icon));

	    mDrawerListRight = (ListView) findViewById(R.id.navListRight);
	    RightDrawerListAdapter adapterRight = new RightDrawerListAdapter(this, mNavRightItems);
	    mDrawerListRight.setAdapter(adapterRight);
	 
	    // Drawer Item click listeners
	    mDrawerListRight.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	        @Override
	        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	            selectItemFromDrawerRight(position);
	        }
	    });
	    
	    mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,android.R.drawable.ic_lock_lock, R.string.drawer_open, R.string.drawer_close) {
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
	    
	    btnSendMsg = (ImageButton) findViewById(R.id.btnSend);
	    chatHistoryList  = (ListView) findViewById(R.id.chatHistory);
	    etChatText = (EditText) findViewById(R.id.chatText);
	    setButtonClickListener();
	    setListAdapter();

	}
	
	private void setListAdapter() {
		// TODO Auto-generated method stub
		chatArrayAdapter = new ChatArrayAdapter(getApplicationContext(), R.layout.chat_bubble);
        chatHistoryList.setAdapter(chatArrayAdapter);
        chatHistoryList.setDividerHeight(0);
	}

	public void setButtonClickListener() {
		// TODO Auto-generated method stub
		btnSendMsg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendChatMessage();
			}
		});
	}

	protected boolean sendChatMessage() {
		// TODO Auto-generated method stub
		chatArrayAdapter.add(new ChatMessage(side, etChatText.getText().toString(),getResources().getDrawable(R.drawable.ic_launcher)));
        etChatText.setText("");
//        side = !side;
        return true;
	}

	// Called when invalidateOptionsMenu() is invoked
	public boolean onPrepareOptionsMenu(Menu menu) {
	    // If the nav drawer is open, hide action items related to the content view
//	    boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerListLeft);
//	    menu.findItem(R.id.action_search).setVisible(!drawerOpen);
	    return super.onPrepareOptionsMenu(menu);
	}

	public void selectItemFromDrawerLeft(int position) {
		// TODO Auto-generated method stub
		Fragment fragment = new Fragment();
		 switch (position) {
		case 0:
			fragment = new ChatViewFragment();
			break;

		default:
			break;
		}
	    FragmentManager fragmentManager = getFragmentManager();
	    fragmentManager.beginTransaction()
	            .replace(R.id.mainContent, fragment)
	            .commit();
	 
	    mDrawerListLeft.setItemChecked(position, true);
	    setTitle(mNavItems.get(position).mTitle);
	 
	    // Close the drawer
	    mDrawerLayout.closeDrawer(mDrawerPaneLeft);
	
	}
	
	public void selectItemFromDrawerRight(int position) {
		// TODO Auto-generated method stub
		Fragment fragment = null;
		 switch (position) {
		case 0:
			fragment = new PreferenceFragment();
			break;
			
		case 1:
			fragment = new ChatViewFragment();
			break;
			
		default:
			break;
		}
		 
		if(fragment != null){
	    FragmentManager fragmentManager = getFragmentManager();
	    fragmentManager.beginTransaction()
	            .replace(R.id.mainContent, fragment)
	            .commit();
	    
//	    LayoutInflater inflater = getLayoutInflater();
//	    RelativeLayout container = (RelativeLayout) findViewById(R.id.mainContent);
//	    inflater.inflate(R.layout.fragment_chat_view, container);
		}
	    mDrawerListRight.setItemChecked(position, true);
	    setTitle(mNavRightItems.get(position).mTitle);
	 
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
	 
	    public LeftDrawerListAdapter(Context context, ArrayList<NavItem> navItems) {
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
	            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	            view = inflater.inflate(R.layout.drawer_item, null);
	        }
	        else {
	            view = convertView;
	        }
	 
	        TextView titleView = (TextView) view.findViewById(R.id.title);
//	        TextView subtitleView = (TextView) view.findViewById(R.id.subTitle);
//	        ImageView iconView = (ImageView) view.findViewById(R.id.icon);
	 
	        titleView.setText( mNavItems.get(position).mTitle );
//	        subtitleView.setText( mNavItems.get(position).mSubtitle );
//	        iconView.setImageResource(mNavItems.get(position).mIcon);
	 
	        return view;
	    }
	}
	
	class RightDrawerListAdapter extends BaseAdapter {
		 
	    Context mContext;
	    ArrayList<NavItem> mNavItems;
	 
	    public RightDrawerListAdapter(Context context, ArrayList<NavItem> navItems) {
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
	            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	            view = inflater.inflate(R.layout.drawer_item_right, null);
	        }
	        else {
	            view = convertView;
	        }
	 
	        TextView titleView = (TextView) view.findViewById(R.id.title);
//	        TextView subtitleView = (TextView) view.findViewById(R.id.subTitle);
	        ImageView iconView = (ImageView) view.findViewById(R.id.icon);
	 
	        titleView.setText( mNavItems.get(position).mTitle );
//	        subtitleView.setText( mNavItems.get(position).mSubtitle );
	        iconView.setImageResource(mNavItems.get(position).mIcon);
	 
	        return view;
	    }
	}
}
