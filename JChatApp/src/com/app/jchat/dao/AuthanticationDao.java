package com.app.jchat.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.app.jchat.util.DBUtil;

public class AuthanticationDao extends SQLiteOpenHelper implements
OnAuthanticationListener {
	private final String LOGTAG = "AuthenticationDao";
	private String CREATE_ADMIN = "";
	private String CREATE_BANNERS = "";
	private String CREATE_BANNERS_LANG = "";
	private String CREATE_CATEGORY = "";
	private String CREATE_CATEGORY_LANG = "";
	private String CREATE_CHANNELS = "";
	private String CREATE_CHAT_MESSEGES = "";
	private String CREATE_CI_SESSION = "";
	private String CREATE_EMAIL = "";
	private String CREATE_LANGUAGE = "";
	private String CREATE_NEWS = "";
	private String CREATE_NEWS_LETTERS = "";
	private String CREATE_NEWS_LANGUAGE = "";
	private String CREATE_PAGE = "";
	private String CREATE_PAGE_FILES = "";
	private String CREATE_PAGE_LANGUAGE = "";
	private String CREATE_REPOSITORY = "";
	private String CREATE_ROUTES = "";
	private String CREATE_SETTING = "";
	private String CREATE_SLIDERS = "";
	private String CREATE_SOCIAL = "";
	private String CREATE_STATIC_TEXT = "";
	private String CREATE_STATIC_TEXT_LANG = "";
	private String CREATE_SYS_ROUTES = "";
	private String CREATE_USER = "";
	private String CREATE_USER_ONLINE = "";
	private String CREATE_VISITOR_ACTIVITY = "";

	private static SQLiteDatabase sqlDb = null;

	public AuthanticationDao(Context context) {
		super(context, DBUtil.DATABASE_NAME, null, DBUtil.DATABASE_VERSION);
		Log.i("AuthenticationDao", "This is AuthenticationDao constructor.....");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		CREATE_ADMIN = " CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_ADMIN
				+ " ( " + DBUtil.ADMIN_ID
				+ " int(11) NOT NULL AUTO_INCREMENT, " + DBUtil.ADMIN_NAME
				+ " varchar(200) DEFAULT '', " + DBUtil.ADMIN_PASSWORD
				+ " varchar(100) DEFAULT '', " + DBUtil.ADMIN_EMAIL
				+ " varchar(100) DEFAULT '', " + DBUtil.ADMIN_IMAGE
				+ " varchar(255) DEFAULT NULL " + DBUtil.ADMIN_TYPE
				+ " varchar(255) DEFAULT NULL, " + DBUtil.ADMIN_ROLE
				+ " enum('super admin','admin','employee') DEFAULT NULL, "
				+ DBUtil.ADMIN_BALANCE + " double DEFAULT '0', "
				+ DBUtil.ADMIN_IS_CATEGORY_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_MERCHANT_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_WEBSITE_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_COUPON_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_USER_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_SUB_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_COMMENT_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_BANNER_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_GENERAL_MANAGE + " tinyint(4) DEFAULT '0', "
				+ DBUtil.ADMIN_IS_COUPAN_REQ_MANAGE
				+ " tinyint(4) DEFAULT '0', " + DBUtil.ADMIN_ENABLED
				+ " tinyint(4) DEFAULT '1', " + DBUtil.ADMIN_STATUS
				+ " varchar(255) DEFAULT '', " + DBUtil.ADMIN_CREATED
				+ " varchar(255) DEFAULT NULL, " + DBUtil.ADMIN_MODIFIED
				+ " varchar(255) DEFAULT NULL,PRIMARY KEY ( " + DBUtil.ADMIN_ID
				+ " )," + ") )";
		db.execSQL(CREATE_ADMIN);

		CREATE_BANNERS = " CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_BANNERS
				+ " ( " + DBUtil.BANNER_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.BANNER_PARENT_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.BANNER_STATUS + " tinyint(1) DEFAULT '1', "
				+ DBUtil.BANNER_ORDER + " int(11) DEFAULT NULL, "
				+ DBUtil.BANNER_MENU_LOCATION
				+ " varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_NAME
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_DESC + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.BANNER_IMAGE + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.BANNER_TYPE
				+ " varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_DATE + " datetime DEFAULT NULL, "
				+ DBUtil.BANNER_DATE_PUBLISH + " datetime DEFAULT NULL, "
				+ DBUtil.BANNER_TEMPLET
				+ " varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_SLUG
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_REPOSITORY_ID + " int(11) DEFAULT NULL, "
				+ DBUtil.BANNER_ROUTE_ID + " bigint(20) DEFAULT NULL, "
				+ DBUtil.BANNER_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_ENABLED
				+ " tinyint(4) DEFAULT '1',PRIMARY KEY ( " + DBUtil.BANNER_ID
				+ " )," + ") )";
		db.execSQL(CREATE_BANNERS);

		CREATE_BANNERS_LANG = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_BANNERS_LANG + " ( " + DBUtil.BANNER_LANG_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.BANNER_LANG_BANNER_ID + " bigint(20) NOT NULL, "
				+ DBUtil.BANNER_LANG_LANGUAGE_ID + " bigint(20) NOT NULL, "
				+ DBUtil.BANNER_LANG_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_LANG_NAVIGATION_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_LANG_BODY + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.BANNER_LANG_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.BANNER_LANG_SHORT_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.BANNER_LANG_KEYWORD
				+ " varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_LANG_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.BANNER_LANG_ENABLED
				+ " tinyint(4) DEFAULT '1', PRIMARY KEY ( "
				+ DBUtil.BANNER_LANG_ID + " )," + " KEY "
				+ DBUtil.BANNER_LANG_FK_BANNER_LANG1 + " ( "
				+ DBUtil.BANNER_LANG_LANGUAGE_ID + " ), " + " KEY "
				+ DBUtil.BANNER_LANG_FK_BANNER_LANG_PAGE1 + " ( "
				+ DBUtil.BANNER_LANG_BANNER_ID + " ), " + ") ) ";
		db.execSQL(CREATE_BANNERS_LANG);

		CREATE_CATEGORY = "	CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_CATEGORIES + " ( " + DBUtil.CATEGORY_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.CATEGORY_PARENT_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.CATEGORY_STATUS + " tinyint(1) DEFAULT '1', "
				+ DBUtil.CATEGORY_ORDER + " int(11) DEFAULT NULL, "
				+ DBUtil.CATEGORY_IMAGE
				+ " varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CATEGORY_IMAGE + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.CATEGORY_TYPE
				+ " varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,"
				+ DBUtil.CATEGORY_DATE + " datetime DEFAULT NULL, "
				+ DBUtil.CATEGORY_DATE_PUBLISH + " datetime DEFAULT NULL, "
				+ DBUtil.CATEGORY_TEMPLET
				+ " varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CATEGORY_SLUG
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CATEGORY_REPOSITORY_ID + " int(11) DEFAULT NULL, "
				+ DBUtil.CATEGORY_ROUTE_ID + " bigint(20) DEFAULT NULL, "
				+ DBUtil.CATEGORY_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CATEGORY_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CATEGORY_ENABLED
				+ " tinyint(4) DEFAULT '1', PRIMARY KEY ( "
				+ DBUtil.CATEGORY_ID + " ), " + ") )";

		db.execSQL(CREATE_CATEGORY);

		CREATE_CATEGORY_LANG = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_CATEGORIES_LANG
				+ " ( "
				+ DBUtil.CATEGORY_LANG_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.CATEGORY_LANG_CATEGORY_ID
				+ " bigint(20) NOT NULL, "
				+ DBUtil.CATEGORY_LANG_LANGUAGE_ID
				+ " bigint(20) NOT NULL, "
				+ DBUtil.CATEGORY_LANG_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CATEGORY_LANG_NAVIGATION_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CATEGORY_LANG_BODY
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.CATEGORY_LANG_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.CATEGORY_LANG_SHORT_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.CATEGORY_LANG_KEYWORD
				+ " varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,  PRIMARY KEY ( "
				+ DBUtil.CATEGORY_LANG_ID + " )," + " KEY "
				+ DBUtil.CATEGORY_LANG_FK_BANNER_LANG1 + " ( "
				+ DBUtil.CATEGORY_LANG_LANGUAGE_ID + " ), " + " KEY "
				+ DBUtil.CATEGORY_LANG_FK_BANNER_LANG_PAGE1 + " ( "
				+ DBUtil.CATEGORY_LANG_CATEGORY_ID + " ), " + ") ) ";

		db.execSQL(CREATE_CATEGORY_LANG);

		CREATE_CHANNELS = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_CHANNELS + " ( " + DBUtil.CHANNELS_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.CHANNELS_PARENT_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.CHANNELS_USER_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.CHANNELS_USER_PARENT_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.CHANNELS_NAME
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CHANNELS_PURPOSE + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.CHANNELS_IMAGE + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.CHANNELS_ORDER + " int(11) DEFAULT NULL, "
				+ DBUtil.CHANNELS_SLUG
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CHANNELS_ROUTE_ID + " bigint(11) DEFAULT NULL, "
				+ DBUtil.CHANNELS_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CHANNELS_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.CHANNELS_ENABLED
				+ " tinyint(4) DEFAULT '1',  PRIMARY KEY ( "
				+ DBUtil.CHANNELS_ID + " ), " + ") )";

		db.execSQL(CREATE_CHANNELS);

		CREATE_CHAT_MESSEGES = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_CHAT_MESSAGE
				+ " ( "
				+ DBUtil.CHAT_MESSEGE_ID
				+ " int(11) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.CHAT_MESSEGE_CONTENT
				+ " text CHARACTER SET latin1, "
				+ DBUtil.CHAT_MESSEGE_USER_ID
				+ " int(11) DEFAULT NULL, "
				+ DBUtil.CHAT_MESSEGE_USER_NAME
				+ " varchar(255) CHARACTER SET latin1 DEFAULT '', "
				+ DBUtil.CHAT_MESSEGE_USER_TYPE
				+ " varchar(255) CHARACTER SET latin1 DEFAULT NULL, "
				+ DBUtil.CHAT_MESSEGE_TIME
				+ " timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP, "
				+ DBUtil.CHAT_MESSEGE_RECIPIENT
				+ " varchar(255) DEFAULT '', "
				+ DBUtil.CHAT_MESSEGE_RECIPIENT_TYPE
				+ " varchar(255) CHARACTER SET latin1 DEFAULT NULL, "
				+ DBUtil.CHAT_MESSEGE_RECIPIENT_ID
				+ " int(11) DEFAULT NULL, "
				+ DBUtil.CHAT_MESSEGE_READ
				+ " int(11) DEFAULT '0', "
				+ DBUtil.CHAT_MESSEGE_CREATE_DATE
				+ " varchar(255) CHARACTER SET latin1 DEFAULT NULL, PRIMARY KEY ( "
				+ DBUtil.CHAT_MESSEGE_ID + " ), " + ") )";

		db.execSQL(CREATE_CHAT_MESSEGES);

		CREATE_CI_SESSION = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_CI_SESSIONS + " ( " + DBUtil.SESSION_ID
				+ " varchar(255) NOT NULL DEFAULT '0', "
				+ DBUtil.SESSION_IP_ADDRESS
				+ " varchar(255) NOT NULL DEFAULT '0', "
				+ DBUtil.SESSION_URGENT_AGENT
				+ " varchar(255) NOT NULL DEFAULT '', "
				+ DBUtil.SESSION_LAST_ACTIVITY
				+ " int(10) unsigned NOT NULL DEFAULT '0', "
				+ DBUtil.SESSION_USER_DATA + " text NOT NULL, PRIMARY KEY ( "
				+ DBUtil.SESSION_ID + " ), " + ") )";
		db.execSQL(CREATE_CI_SESSION);

		CREATE_EMAIL = " CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_EMAIL
				+ " ( " + DBUtil.EMAIL_ID
				+ " int(11) NOT NULL AUTO_INCREMENT, " + DBUtil.EMAIL_NAME
				+ " varchar(255) DEFAULT NULL, " + DBUtil.EMAIL_SUBJECT
				+ " varchar(255) DEFAULT NULL, " + DBUtil.EMAIL_MESSEGE
				+ " text, " + DBUtil.EMAIL_CREATED
				+ " varchar(255) DEFAULT NULL, " + DBUtil.EMAIL_MODIFIED
				+ " varchar(255) DEFAULT NULL, " + DBUtil.EMAIL_STATUS
				+ " int(11) DEFAULT '1', " + DBUtil.EMAIL_DELETED
				+ " int(11) DEFAULT '0', PRIMARY KEY ( " + DBUtil.EMAIL_ID
				+ " ), " + ") )";

		db.execSQL(CREATE_EMAIL);

		CREATE_LANGUAGE = "	CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_LANGUAGES + " ( " + DBUtil.LANGUAGE_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.LANGUAGE_CODE
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.LANGUAGE_LANG
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.LANGUAGE_DEFAULT + " tinyint(4) DEFAULT '0', "
				+ DBUtil.LANGUAGE_IMAGE + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.LANGUAGE_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.LANGUAGE_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.LANGUAGE_ENABLED
				+ " tinyint(4) DEFAULT '1', PRIMARY KEY ( "
				+ DBUtil.LANGUAGE_ID + " ), " + " UNIQUE KEY "
				+ DBUtil.LANGUAGE_UNIQE_CODE + " ( " + DBUtil.LANGUAGE_CODE
				+ " ), " + ") )";
		db.execSQL(CREATE_LANGUAGE);
		
		CREATE_NEWS = " CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_NEWS
				+ " ( " + DBUtil.NEWS_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.NEWS_PARENT__ID + " bigint(20) DEFAULT NULL, "
				+ DBUtil.NEWS_STATUS + " tinyint(1) DEFAULT NULL, "
				+ DBUtil.NEWS_ORDER + " int(11) DEFAULT NULL, "
				+ DBUtil.NEWS_MENU_LOCATION
				+ " varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_IMAGE
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_TYPE
				+ " varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_DATE + " datetime DEFAULT NULL, "
				+ DBUtil.NEWS_DATE_PUBLISH + " datetime DEFAULT NULL, "
				+ DBUtil.NEWS_TEMPLET
				+ " varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_SLUG
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_REPOSITORY_ID + " int(11) DEFAULT NULL, "
				+ DBUtil.NEWS_ROUTE_ID + " int(11) DEFAULT NULL, "
				+ DBUtil.NEWS_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_ENABLED
				+ " tinyint(4) DEFAULT '1', PRIMARY KEY ( " + DBUtil.NEWS_ID
				+ " ), " + ") )";

		db.execSQL(CREATE_NEWS);

		CREATE_NEWS_LETTERS = "	CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_NEWS_LETTERS + " ( " + DBUtil.NEWS_LETTERS_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.NEWS_LETTERS_EMAIL + " varchar(255) DEFAULT NULL, "
				+ DBUtil.NEWS_LETTERS_CREATED + " varchar(255) DEFAULT NULL, "
				+ DBUtil.NEWS_LETTERS_MODIFIED + " varchar(255) DEFAULT NULL, "
				+ DBUtil.NEWS_LETTERS_ENABLED
				+ " tinyint(4) DEFAULT NULL,   PRIMARY KEY ( "
				+ DBUtil.NEWS_LETTERS_ID + " ), " + ") )";
		db.execSQL(CREATE_NEWS_LETTERS);

		CREATE_NEWS_LANGUAGE = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_NEWS_LANG
				+ " ( "
				+ DBUtil.NEWS_ID_PAGE_LANGUAGE
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.NEWS_ID
				+ " bigint(20) NOT NULL, "
				+ DBUtil.NEWS_LANGUAGE_ID
				+ " bigint(20) NOT NULL, "
				+ DBUtil.NEWS_LANGUAGE_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_LANGUAGE_NAVIGETION_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.NEWS_LANGUAGE_BODY
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.NEWS_LANGUAGE_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.NEWS_LANGUAGE_SHORT_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.NEWS_LANGUAGE_KEYWORD
				+ " varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,  PRIMARY KEY ( "
				+ DBUtil.NEWS_ID_PAGE_LANGUAGE + " ), " + "  KEY "
				+ DBUtil.NEWS_LANGUAGE_FK_PAGE_LANGUAGE1 + " ( "
				+ DBUtil.NEWS_LANGUAGE_ID + " ), " + " KEY "
				+ DBUtil.NEWS_LANGUAGE_FK_PAGE_LANGUAGE_PAGE1 + " ( "
				+ DBUtil.NEWS_ID + " ) " + " ) )";
		db.execSQL(CREATE_NEWS_LANGUAGE);

		CREATE_PAGE = " CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_PAGE
				+ " ( " + DBUtil.PAGE_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.PAGE_REGION_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.PAGE_PARENT_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.PAGE_TOP_MENU + " tinyint(4) DEFAULT '0', "
				+ DBUtil.PAGE_BOTTOM_MENU + " tinyint(4) DEFAULT '0', "
				+ DBUtil.PAGE_IS_BANNER + " tinyint(4) DEFAULT NULL, "
				+ DBUtil.PAGE_IMAGE + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.PAGE_ORDER + " int(11) DEFAULT NULL, "
				+ DBUtil.PAGE_MENU_LOCATION
				+ " varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_TYPE
				+ " varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_DATE + " datetime DEFAULT NULL, "
				+ DBUtil.PAGE_DATE_PUBLISH + " datetime DEFAULT NULL, "
				+ DBUtil.PAGE_TEMPLET
				+ " varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_SLUG
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_REPOSITORY_ID + " int(11) DEFAULT NULL, "
				+ DBUtil.PAGE_ROUTE_ID + " bigint(11) DEFAULT NULL,  "
				+ DBUtil.PAGE_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_MODIFIED +

				" varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_ENEBLED
				+ " tinyint(4) DEFAULT '1', PRIMARY KEY ( " + DBUtil.PAGE_ID
				+ " )" + ") )";
		db.execSQL(CREATE_PAGE);

		CREATE_PAGE_FILES = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_PAGE_FILES + " ( " + DBUtil.PAGE_FILES_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.PAGE_FILES_SLIDE_LANG + " varchar(255) DEFAULT NULL, "
				+ DBUtil.PAGE_FILES_ORDER + " int(11) DEFAULT NULL, "
				+ DBUtil.PAGE_FILES_NAME + " varchar(255) DEFAULT NULL, "
				+ DBUtil.PAGE_FILES_TYPE + " varchar(255) DEFAULT NULL, "
				+ DBUtil.PAGE_FILES_LINK + " varchar(255) DEFAULT NULL, "
				+ DBUtil.PAGE_FILES_DESCRIPTION + " text, " + DBUtil.PAGE_ID
				+ " bigint(20) DEFAULT NULL, " + DBUtil.PAGE_FILES_CREATED
				+ " varchar(255) DEFAULT NULL, " + DBUtil.PAGE_FILES_MODIFIED
				+ " varchar(255) DEFAULT NULL,  PRIMARY KEY ( "
				+ DBUtil.PAGE_FILES_ID + "  ), " + ")  )";

		db.execSQL(CREATE_PAGE_FILES);

		CREATE_PAGE_LANGUAGE = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_PAGE_LANG + " ( " + DBUtil.PAGE_LANGUAGE_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.PAGE_LANGUAGE_PAGE_ID + " bigint(20) NOT NULL, "
				+ DBUtil.PAGE_LANGUAGE_LANGUAGE_ID + " bigint(20) NOT NULL, "
				+ DBUtil.PAGE_LANGUAGE_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_LANGUAGE_NAVIGETION_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_LANGUAGE_BODY + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.PAGE_LANGUAGE_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.PAGE_LANGUAGE_SHORT_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.PAGE_LANGUAGE_KEYWORD
				+ " varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_LANGUAGE_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_LANGUAGE_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.PAGE_LANGUAGE_ENABLED
				+ " tinyint(4) DEFAULT '1', PRIMARY KEY ( "
				+ DBUtil.PAGE_LANGUAGE_ID + " ), " +

				" KEY " + DBUtil.PAGE_LANGUAGE_FK_PAGE_LANGUAGE1 + " ( "
				+ DBUtil.PAGE_LANGUAGE_LANGUAGE_ID + " ), " + " KEY "
				+ DBUtil.PAGE_LANGUAGE_FK_PAGE_LANGUAGE_PAGE1 + " ( "
				+ DBUtil.PAGE_LANGUAGE_PAGE_ID + " ) " + ") )";
		db.execSQL(CREATE_PAGE_LANGUAGE);

		CREATE_REPOSITORY = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_REPOSITORY
				+ " ( "
				+ DBUtil.REPOSITORY_ID
				+ " int(11) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.REPOSITORY_NAME
				+ " varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL, PRIMARY KEY ( "
				+ DBUtil.REPOSITORY_ID + " ), " + ") )";
		db.execSQL(CREATE_REPOSITORY);

		CREATE_ROUTES = " CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_ROUTS
				+ " ( " + DBUtil.ROUTE_ID
				+ " int(9) unsigned NOT NULL AUTO_INCREMENT, "
				+ DBUtil.ROUTE_SLUG + " varchar(255) NOT NULL, " + DBUtil.ROUTE
				+ " varchar(32) NOT NULL,  PRIMARY KEY ( " + DBUtil.ROUTE_ID
				+ " ), " + ") )";

		db.execSQL(CREATE_ROUTES);

		CREATE_SETTING = " CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_SETTING
				+ " ( " + DBUtil.SETTING_FIELD
				+ " varchar(255) CHARACTER SET latin1 DEFAULT NULL, "
				+ DBUtil.SETTING_VALUE + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.SETTING_CREATED
				+ " varchar(255) CHARACTER SET latin1 DEFAULT NULL, "
				+ DBUtil.SETTING_MODIFIED
				+ " varchar(255) CHARACTER SET latin1 DEFAULT NULL  ) ";
		db.execSQL(CREATE_SETTING);

		CREATE_SLIDERS = "	CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_SLIDERS
				+ " ( " + DBUtil.SLIDER_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.SLIDER_PARENT_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.SLIDER_TYPE
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.SLIDER_STATUS + " tinyint(1) DEFAULT '1', "
				+ DBUtil.SLIDER_ORDER + " int(11) DEFAULT NULL, "
				+ DBUtil.SLIDER_NAME
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.SLIDER_IMAGE + " text COLLATE utf8_unicode_ci, "
				+ DBUtil.SLIDER_LINK
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.SLIDER_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.SLIDER_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.SLIDER_ENABLED
				+ " tinyint(4) DEFAULT '1',   PRIMARY KEY ( "
				+ DBUtil.SLIDER_ID + " ), " + ") )";
		db.execSQL(CREATE_SLIDERS);

		CREATE_SOCIAL = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_SOCIAL_LINKS + " ( " + DBUtil.SOCIAL_LINKS_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.SOCIAL_LINKS_NAME + " varchar(255) DEFAULT NULL, "
				+ DBUtil.SOCIAL_LINKS_TYPE + " varchar(255) DEFAULT NULL, "
				+ DBUtil.SOCIAL_LINKS_TITLE + " varchar(255) DEFAULT NULL, "
				+ DBUtil.SOCIAL_LINKS_LINKS + " varchar(255) DEFAULT NULL, "
				+ DBUtil.SOCIAL_LINKS_CREATED + " varchar(255) DEFAULT NULL, "
				+ DBUtil.SOCIAL_LINKS_MODIFIED + " varchar(255) DEFAULT NULL, "
				+ DBUtil.SOCIAL_LINKS_ENABLED
				+ " int(11) DEFAULT '1', PRIMARY KEY ( "
				+ DBUtil.SOCIAL_LINKS_ID + " ) " + ") )";

		db.execSQL(CREATE_SOCIAL);

		CREATE_STATIC_TEXT = "	CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_STATIC_TEXT + " ( " + DBUtil.STATIC_TEXT_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.STATIC_TEXT_PARENT_ID + " bigint(20) DEFAULT NULL, "
				+ DBUtil.STATIC_TEXT_NAME
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.STATIC_TEXT_TYPE
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.STATIC_TEXT_ORDER + " int(11) DEFAULT NULL, "
				+ DBUtil.STATIC_TEXT_IMAGE
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.STATIC_TEXT_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.STATIC_TEXT_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.STATIC_TEXT_ENABLED
				+ " tinyint(4) DEFAULT '1', PRIMARY KEY ( "
				+ DBUtil.STATIC_TEXT_ID + " ) " + ") )";

		db.execSQL(CREATE_STATIC_TEXT);

		CREATE_STATIC_TEXT_LANG = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_STATIC_TEXT_LANG
				+ " ( "
				+ DBUtil.STATIC_TEXT_LANGUAGE_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.STATIC_TEXT_ID_ID
				+ " bigint(20) NOT NULL, "
				+ DBUtil.STATIC_TEXT_LANGUAGE_ID
				+ " language_id` bigint(20) NOT NULL,  "
				+ DBUtil.STATIC_TEXT_LANGUAGE_TITLE
				+ " varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.STATIC_TEXT_LANGUAGE_BODY
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.STATIC_TEXT_LANGUAGE_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.STATIC_TEXT_LANGUAGE_SHORT_DESCRIPTION
				+ " text COLLATE utf8_unicode_ci, "
				+ DBUtil.STATIC_TEXT_LANGUAGE_KEYWORD
				+ " varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,   PRIMARY KEY ( "
				+ DBUtil.STATIC_TEXT_LANGUAGE_ID + " ), " + " KEY "
				+ DBUtil.STATIC_TEXT_LANGUAGE_FK_PAGE_LANGUAGE1 + " ( "
				+ DBUtil.STATIC_TEXT_LANGUAGE_LANGUAGE_ID + " ), " + " KEY "
				+ DBUtil.STATIC_TEXT_LANGUAGE_FK_PAGE_LANGUAGE_PAGE1 + " ( "
				+ DBUtil.STATIC_TEXT_LANGUAGE_FK_PAGE_LANGUAGE_PAGE1 + " ) "
				+ ") )";
		db.execSQL(CREATE_STATIC_TEXT_LANG);

		CREATE_SYS_ROUTES = " CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_SYS_ROUTES + " ( " + DBUtil.SYS_ROUTERS_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.SYS_ROUTERS_SLUG
				+ " varchar(255) COLLATE utf8_unicode_ci NOT NULL DEFAULT '', "
				+ DBUtil.SYS_ROUTERS_CONTROLLER
				+ " varchar(255) COLLATE utf8_unicode_ci NOT NULL DEFAULT '', "
				+ DBUtil.SYS_ROUTERS_TYPE
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.SYS_ROUTERS_WEBSITE_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.SYS_ROUTERS_COUPAN_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.SYS_ROUTERS_CATEGORY_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.SYS_ROUTERS_CREATED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.SYS_ROUTERS_MODIFIED
				+ " varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, "
				+ DBUtil.SYS_ROUTERS_ENEBLED
				+ " int(11) DEFAULT '1',  PRIMARY KEY ( "
				+ DBUtil.SYS_ROUTERS_ID + " ), " + " KEY "
				+ DBUtil.SYS_ROUTERS_SLUG + " ( " + DBUtil.SYS_ROUTERS_SLUG
				+ " ) " + ") )";

		db.execSQL(CREATE_SYS_ROUTES);

		CREATE_USER = " CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_USERS
				+ " ( " + DBUtil.USER_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT, "
				+ DBUtil.USER_PARENT_ID + " bigint(20) DEFAULT '0', "
				+ DBUtil.USER_COMPANY_NAME + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_TEAM_NAME + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_ACCOUNT_TYPE + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_DOMAIN_NAME + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_FIRST_NAME + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_LAST_NAME + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_USER_NAME + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_EMAIL + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_PASSWORD + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_IMAGE + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_ADDRESS + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_STREET + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_CITY + "varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_STATE + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_COUNTRY + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_ZIP + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_PHONE + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_USER_TYPE + " varchar(255) DEFAULT 'free', "
				+ DBUtil.USER_CREATED_BY + " varchar(255) DEFAULT 'user', "
				+ DBUtil.USER_ADMIN_CONFIRM + " tinyint(4) DEFAULT '1', "
				+ DBUtil.USER_CONFIRM + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_ENABLED + " tinyint(255) DEFAULT '1', "
				+ DBUtil.USER_CREATED + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_USER_MODIFIED + " varchar(255) DEFAULT NULL, "
				+ DBUtil.USER_USER_STATUS + " int(11) DEFAULT '0', "
				+ DBUtil.USER_USER_DATE_ADDED
				+ " timestamp NULL DEFAULT CURRENT_TIMESTAMP,  "
				+ "PRIMARY KEY ( "	+ DBUtil.USER_ID + " ) " + ") ) ";
		db.execSQL(CREATE_USER);
		
		CREATE_USER = "CREATE TABLE IF NOT EXISTS " + DBUtil.TABLE_USER_ONLINE
				+ "(" + DBUtil.USER_ONLINE_ID
				+ " INTEGER(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,"
				+ DBUtil.USER_ONLINE_USERID + " int(11) DEFAULT NULL  ,"
				+ DBUtil.USER_ONLINE_USERTYPE
				+ " varchar(255) CHARACTER SET latin1 DEFAULT NULL "
				+ DBUtil.USER_ONLINE_STATUS + " int(11) DEFAULT '0' ,"
				+ DBUtil.USER_ONLINE_LAST_ACTIVE_TIME
				+ " timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ,"
				+ DBUtil.USER_ONLINE_CREATE_DATE
				+ " varchar(255) CHARACTER SET latin1 DEFAULT NULL " + ")";
		db.execSQL(CREATE_USER_ONLINE);
		
		CREATE_VISITOR_ACTIVITY = "CREATE TABLE IF NOT EXISTS "
				+ DBUtil.TABLE_VISITORS_ACTIVITY + "("
				+ DBUtil.VISITOR__ACTIVITY_ID
				+ " bigint(20) NOT NULL AUTO_INCREMENT,"
				+ DBUtil.VISITOR__ACTIVITY_TIMESTAMP
				+ " timestamp NULL DEFAULT CURRENT_TIMESTAMP ,"
				+ DBUtil.VISITOR__ACTIVITY_VISIT_DATE
				+ " varchar(255) DEFAULT NULL,"
				+ DBUtil.VISITOR__ACTIVITY_IP_ADDRESS
				+ " varchar(255) DEFAULT NULL ,"
				+ DBUtil.VISITOR__ACTIVITY_MODIFIED
				+ " varchar(255) DEFAULT NULL ,"
				+ DBUtil.VISITOR__ACTIVITY_CREATED
				+ " varchar(255) DEFAULT NULL" + ")";
		db.execSQL(CREATE_VISITOR_ACTIVITY);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_ADMIN);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_BANNERS);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_BANNERS_LANG);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_CATEGORIES);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_CATEGORIES_LANG);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_CHANNELS);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_CHAT_MESSAGE);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_CI_SESSIONS);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_EMAIL);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_NEWS);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_NEWS_LETTERS);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_NEWS_LANG);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_PAGE);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_PAGE_FILES);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_PAGE_LANG);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_REPOSITORY);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_ROUTS);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_SETTING);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_SLIDERS);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_SOCIAL_LINKS);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_STATIC_TEXT);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_STATIC_TEXT_LANG);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_SYS_ROUTES);
		db.execSQL("DROP TABLE IF EXIST" + DBUtil.TABLE_USERS);
		db.execSQL("DROP TABLE IF EXISTS " + DBUtil.TABLE_USER_ONLINE);
		db.execSQL("DROP TABLE IF EXISTS " + DBUtil.TABLE_VISITORS_ACTIVITY);
		onCreate(db);

	}

}
