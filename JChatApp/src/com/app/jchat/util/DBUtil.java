package com.app.jchat.util;

public class DBUtil {
	//DATABASE VERSION
		public static final int DATABASE_VERSION = 1;
		//DATABASE NAME
		public static final String DATABASE_NAME="jchat.db";
		//ALL TABLES
		public static final String TABLE_ADMIN					=	"admin_table";
		public static final String TABLE_BANNERS				=	"banners_table";
		public static final String TABLE_BANNERS_LANG			=	"banners_lang_table";
		public static final String TABLE_CATEGORIES				=	"categories_table";
		public static final String TABLE_CATEGORIES_LANG		=	"categories_lang_table";
		public static final String TABLE_CHANNELS				=	"channels_table";
		public static final String TABLE_CHAT_MESSAGE			=	"chat_messege_table";
		public static final String TABLE_CI_SESSIONS			=	"ci_session_table";
		public static final String TABLE_EMAIL					=	"email_table";
		public static final String TABLE_LANGUAGES				=	"languages_table";
		public static final String TABLE_NEWS					=	"news_table";
		public static final String TABLE_NEWS_LETTERS			=	"news_letters_table";
		public static final String TABLE_NEWS_LANG				=	"news_lang_table";
		public static final String TABLE_PAGE					=	"page";
		public static final String TABLE_PAGE_FILES				=	"page_files";
		public static final String TABLE_PAGE_LANG				=	"page_lang";
		public static final String TABLE_REPOSITORY				=	"repository";
		public static final String TABLE_ROUTS					=	"routs";
		public static final String TABLE_SETTING				=	"setting";
		public static final String TABLE_SLIDERS				=	"sliders";
		public static final String TABLE_SOCIAL_LINKS			=	"social_links";
		public static final String TABLE_STATIC_TEXT			=	"static_text";
		public static final String TABLE_STATIC_TEXT_LANG		=	"static_text_lang";
		public static final String TABLE_SYS_ROUTES				=	"sys_routes";
		public static final String TABLE_USERS					=	"users";
		public static final String TABLE_USER_ONLINE			=	"user_online_table";
		public static final String TABLE_VISITORS_ACTIVITY		=	"visitors_activity_table";
		
		//ALL FIELDS
		
		//TABLE_ADMIN
		public static final String ADMIN_ID="id";
		public static final String ADMIN_NAME="username";
		public static final String ADMIN_PASSWORD="password";
		public static final String ADMIN_EMAIL="email";
		public static final String ADMIN_IMAGE="image";
		public static final String ADMIN_TYPE="type";
		public static final String ADMIN_ROLE="role";
		public static final String ADMIN_BALANCE="balance";
		public static final String ADMIN_IS_CATEGORY_MANAGE="is_category_manage";
		public static final String ADMIN_IS_MERCHANT_MANAGE="is_merchant_manage";
		public static final String ADMIN_IS_WEBSITE_MANAGE="is_website_manage";
		public static final String ADMIN_IS_COUPON_MANAGE="is_coupon_manage";
		public static final String ADMIN_IS_USER_MANAGE="is_user_manage";
		public static final String ADMIN_IS_SUB_MANAGE="is_user_sub_manage";
		public static final String ADMIN_IS_COMMENT_MANAGE="is_comment_manage";
		public static final String ADMIN_IS_BANNER_MANAGE="is_banner_manage";
		public static final String ADMIN_IS_GENERAL_MANAGE="is_general_manage";
		public static final String ADMIN_IS_COUPAN_REQ_MANAGE="is_coupan_req_manage";
		public static final String ADMIN_ENABLED="enebled";
		public static final String ADMIN_STATUS="status";
		public static final String ADMIN_CREATED="created";
		public static final String ADMIN_MODIFIED="modified";
		
		//TABLE_BANNERS
		public static final String BANNER_ID="id";
		public static final String BANNER_PARENT_ID="parent_id";
		public static final String BANNER_STATUS="status";
		public static final String BANNER_ORDER="order";
		public static final String BANNER_MENU_LOCATION="menu_location";
		public static final String BANNER_NAME="name";
		public static final String BANNER_DESC="desc";
		public static final String BANNER_IMAGE="image";
		public static final String BANNER_TYPE="type";
		public static final String BANNER_DATE="date";
		public static final String BANNER_DATE_PUBLISH="date_publish";
		public static final String BANNER_TEMPLET="templet";
		public static final String BANNER_SLUG="slug";
		public static final String BANNER_REPOSITORY_ID="repository";
		public static final String BANNER_ROUTE_ID="route_id";
		public static final String BANNER_CREATED="created";
		public static final String BANNER_MODIFIED="modified";
		public static final String BANNER_ENABLED="enabled";
		 
		//TABLE_BANNERS_LANG
		public static final String BANNER_LANG_ID="id";
		public static final String BANNER_LANG_BANNER_ID="banner_id";
		public static final String BANNER_LANG_LANGUAGE_ID="language_id";
		public static final String BANNER_LANG_TITLE="title";
		public static final String BANNER_LANG_NAVIGATION_TITLE="navigation_id";
		public static final String BANNER_LANG_BODY="body";
		public static final String BANNER_LANG_DESCRIPTION="description";
		public static final String BANNER_LANG_SHORT_DESCRIPTION="short_description";
		public static final String BANNER_LANG_KEYWORD="keyword";
		public static final String BANNER_LANG_CREATED="created";
		public static final String BANNER_LANG_MODIFIED="modified";
		public static final String BANNER_LANG_ENABLED="enabled";
		public static final String BANNER_LANG_FK_BANNER_LANG1="fk_banner_lang";
		public static final String BANNER_LANG_FK_BANNER_LANG_PAGE1="fk_banner_lang_page1";
		
		
		//TABLE_CATEGORIES
		public static final String CATEGORY_ID="id";
		public static final String CATEGORY_PARENT_ID="parent_id";
		public static final String CATEGORY_STATUS="status";
		public static final String CATEGORY_ORDER="order";
		public static final String CATEGORY_MENU_LOCATION="menu_location";
		public static final String CATEGORY_IMAGE="image";
		public static final String CATEGORY_TYPE="type";
		public static final String CATEGORY_DATE="date";
		public static final String CATEGORY_DATE_PUBLISH="date_publish";
		public static final String CATEGORY_TEMPLET="templet";
		public static final String CATEGORY_SLUG="slug";
		public static final String CATEGORY_REPOSITORY_ID="repository_id";
		public static final String CATEGORY_ROUTE_ID="route_id";
		public static final String CATEGORY_CREATED="created";
		public static final String CATEGORY_MODIFIED="modified";
		public static final String CATEGORY_ENABLED="enabled";
		
		
		
		//TABLE_CATEGORIES_LANG
		public static final String CATEGORY_LANG_ID="id";
		public static final String CATEGORY_LANG_CATEGORY_ID="category_id";
		public static final String CATEGORY_LANG_LANGUAGE_ID="language_id";
		public static final String CATEGORY_LANG_TITLE="title";
		public static final String CATEGORY_LANG_NAVIGATION_TITLE="navigation_title";
		public static final String CATEGORY_LANG_BODY="body";
		public static final String CATEGORY_LANG_DESCRIPTION="description";
		public static final String CATEGORY_LANG_SHORT_DESCRIPTION="short_description";
		public static final String CATEGORY_LANG_KEYWORD="keyword";
		public static final String CATEGORY_LANG_FK_BANNER_LANG1="fk_banner_lang";
		public static final String CATEGORY_LANG_FK_BANNER_LANG_PAGE1="fk_banner_lang_page1";
		
		//TABLE_CHANNELS
		public static final String CHANNELS_ID="id";
		public static final String CHANNELS_PARENT_ID="parent_id";
		public static final String CHANNELS_USER_ID="user_id";
		public static final String CHANNELS_USER_PARENT_ID="user_parent_id";
		public static final String CHANNELS_NAME="name";
		public static final String CHANNELS_PURPOSE="purpose";
		public static final String CHANNELS_IMAGE="image";
		public static final String CHANNELS_ORDER="order";
		public static final String CHANNELS_SLUG="slug";
		public static final String CHANNELS_ROUTE_ID="route_id";
		public static final String CHANNELS_CREATED="created";
		public static final String CHANNELS_MODIFIED="modified";
		public static final String CHANNELS_ENABLED="enabled";
		
		
		//TABLE_CHAT_MESSEGE
		public static final String CHAT_MESSEGE_ID="id";
		public static final String CHAT_MESSEGE_CONTENT="content";
		public static final String CHAT_MESSEGE_USER_ID="user_id";
		public static final String CHAT_MESSEGE_USER_NAME="user_name";
		public static final String CHAT_MESSEGE_USER_TYPE="user_type";
		public static final String CHAT_MESSEGE_TIME="time";
		public static final String CHAT_MESSEGE_RECIPIENT="recipient";
		public static final String CHAT_MESSEGE_RECIPIENT_TYPE="recipient_type";
		public static final String CHAT_MESSEGE_RECIPIENT_ID="recipient_id";
		public static final String CHAT_MESSEGE_READ="read";
		public static final String CHAT_MESSEGE_CREATE_DATE="create_date";
		
		
		//TABLE_CI_SESSION
		public static final String SESSION_ID="id";
		public static final String SESSION_IP_ADDRESS="ip_address";
		public static final String SESSION_URGENT_AGENT="urgent_agent";
		public static final String SESSION_LAST_ACTIVITY="last_activity";
		public static final String SESSION_USER_DATA="user_data";
		
		
		//TABLE_E-MAIL
		public static final String EMAIL_ID="id";
		public static final String EMAIL_NAME="name";
		public static final String EMAIL_SUBJECT="subject";
		public static final String EMAIL_MESSEGE="messege";
		public static final String EMAIL_CREATED="created";
		public static final String EMAIL_MODIFIED="modified";
		public static final String EMAIL_STATUS="status";
		public static final String EMAIL_DELETED="deleted";
		
		
		//TABLE_LANGUAGE
		public static final String LANGUAGE_ID="id";
		public static final String LANGUAGE_CODE="code";
		public static final String LANGUAGE_LANG="lang";
		public static final String LANGUAGE_DEFAULT="default";
		public static final String LANGUAGE_IMAGE="image";
		public static final String LANGUAGE_CREATED="created";
		public static final String LANGUAGE_MODIFIED="modified";
		public static final String LANGUAGE_ENABLED="enabled";
		public static final String LANGUAGE_UNIQE_CODE="uniqe_code";
		
		
		//TABLE_NEWS
		public static final String NEWS_ID="id";
		public static final String NEWS_PARENT__ID="parent_id";
		public static final String NEWS_STATUS="status";
		public static final String NEWS_ORDER="order";
		public static final String NEWS_MENU_LOCATION="menu_location";
		public static final String NEWS_IMAGE="image";
		public static final String NEWS_TYPE="type";
		public static final String NEWS_DATE="date";
		public static final String NEWS_DATE_PUBLISH="date_publish";
		public static final String NEWS_TEMPLET="templet";
		public static final String NEWS_SLUG="slug";
		public static final String NEWS_REPOSITORY_ID="repository_id";
		public static final String NEWS_ROUTE_ID="route_id";
		public static final String NEWS_CREATED="created";
		public static final String NEWS_MODIFIED="modified";
		public static final String NEWS_ENABLED="enabled";
		
		
		//TABLE_NEWS_LETTERS
		public static final String NEWS_LETTERS_ID="id";
		public static final String NEWS_LETTERS_EMAIL="email";
		public static final String NEWS_LETTERS_CREATED="created";
		public static final String NEWS_LETTERS_MODIFIED="modified";
		public static final String NEWS_LETTERS_ENABLED="enebleds";
	
		
		//TABLE_NEWS_LANGUAGE
		public static final String NEWS_ID_PAGE_LANGUAGE="id_page_lang";
		public static final String NEWS_LANGUAGE_ID="news_id";
		public static final String NEWS_LANGUAGE_LANGUAGE_ID="language_id";
		public static final String NEWS_LANGUAGE_TITLE="title";
		public static final String NEWS_LANGUAGE_NAVIGETION_TITLE="navigation_title";
		public static final String NEWS_LANGUAGE_BODY="body";
		public static final String NEWS_LANGUAGE_DESCRIPTION="description";
		public static final String NEWS_LANGUAGE_SHORT_DESCRIPTION="short_description";
		public static final String NEWS_LANGUAGE_KEYWORD="keyword";
		public static final String NEWS_LANGUAGE_FK_PAGE_LANGUAGE1="fk_page_language1";
		public static final String NEWS_LANGUAGE_FK_PAGE_LANGUAGE_PAGE1="fk_page_lang_page1";
		
		
		//TABLE_PAGE
		public static final String PAGE_ID="id";
		public static final String PAGE_REGION_ID="Region_id";
		public static final String PAGE_PARENT_ID="parent_id";
		public static final String PAGE_TOP_MENU="top_menu";
		public static final String PAGE_BOTTOM_MENU="botom_menu";
		public static final String PAGE_IS_BANNER="is_banner";
		public static final String PAGE_IMAGE="image";
		public static final String PAGE_ORDER="order";
		public static final String PAGE_MENU_LOCATION="menu_location";
		public static final String PAGE_TYPE="type";
		public static final String PAGE_DATE="date";
		public static final String PAGE_DATE_PUBLISH="date_publish";
		public static final String PAGE_TEMPLET="templet";
		public static final String PAGE_SLUG="slug";
		public static final String PAGE_REPOSITORY_ID="repository_id";
		public static final String PAGE_ROUTE_ID="route_id";
		public static final String PAGE_CREATED="created";
		public static final String PAGE_MODIFIED="modified";
		public static final String PAGE_ENEBLED="enabled";
		
		
		//TABLE_PAGE_FILES
		public static final String PAGE_FILES_ID="id";
		public static final String PAGE_FILES_SLIDE_LANG="slide_lang";
		public static final String PAGE_FILES_ORDER="order";
		public static final String PAGE_FILES_NAME="filename";
		public static final String PAGE_FILES_TYPE="filetype";
		public static final String PAGE_FILES_LINK="link";
		public static final String PAGE_FILES_DESCRIPTION="description";
		public static final String PAGE_FILES_PAGE_ID="page_id";
		public static final String PAGE_FILES_CREATED="created";
		public static final String PAGE_FILES_MODIFIED="modified";
		
		
		//TABLE_PAGE_LANGUAGE
		public static final String PAGE_LANGUAGE_ID="id_page_lang";
		public static final String PAGE_LANGUAGE_PAGE_ID="page_id";
		public static final String PAGE_LANGUAGE_LANGUAGE_ID="language_id";
		public static final String PAGE_LANGUAGE_TITLE="title";
		public static final String PAGE_LANGUAGE_NAVIGETION_TITLE="navigation_title";
		public static final String PAGE_LANGUAGE_BODY="body";
		public static final String PAGE_LANGUAGE_DESCRIPTION="description";
		public static final String PAGE_LANGUAGE_SHORT_DESCRIPTION="short_description";
		public static final String PAGE_LANGUAGE_KEYWORD="keyword";
		public static final String PAGE_LANGUAGE_CREATED="created";
		public static final String PAGE_LANGUAGE_MODIFIED="modified";
		public static final String PAGE_LANGUAGE_ENABLED="enabled";
		public static final String PAGE_LANGUAGE_FK_PAGE_LANGUAGE1="fk_page_language1";
		public static final String PAGE_LANGUAGE_FK_PAGE_LANGUAGE_PAGE1="fk_page_lang_page1";
		
		
		//TABLE_REPOSITORY
		public static final String REPOSITORY_ID="id";
		public static final String REPOSITORY_NAME="name";
		
		
		//TABLE_ROUTE
		public static final String ROUTE_ID="id";
		public static final String ROUTE_SLUG="slug";
		public static final String ROUTE="route";
		
		//TABLE_SETTINGS
		public static final String SETTING_FIELD="field";
		public static final String SETTING_VALUE="value";
		public static final String SETTING_CREATED="created";
		public static final String SETTING_MODIFIED="modified";
		
		
		//TABLE_SLIDERS
		public static final String SLIDER_ID="id";
		public static final String SLIDER_PARENT_ID="parent_id";
		public static final String SLIDER_TYPE="type";
		public static final String SLIDER_STATUS="status";
		public static final String SLIDER_ORDER="order";
		public static final String SLIDER_NAME="name";
		public static final String SLIDER_IMAGE="image";
		public static final String SLIDER_LINK="link";
		public static final String SLIDER_CREATED="created";
		public static final String SLIDER_MODIFIED="modified";
		public static final String SLIDER_ENABLED="enabled";
		
		
		//SOCIAL_LINKS
		public static final String SOCIAL_LINKS_ID="id";
		public static final String SOCIAL_LINKS_NAME="name";
		public static final String SOCIAL_LINKS_TYPE="type";
		public static final String SOCIAL_LINKS_TITLE="title";
		public static final String SOCIAL_LINKS_LINKS="link";
		public static final String SOCIAL_LINKS_CREATED="created";
		public static final String SOCIAL_LINKS_MODIFIED="modified";
		public static final String SOCIAL_LINKS_ENABLED="enabled";
		
		
		//TABLE_STATIC_TEXT
		public static final String STATIC_TEXT_ID="id";
		public static final String STATIC_TEXT_PARENT_ID="parent_id";
		public static final String STATIC_TEXT_NAME="name";
		public static final String STATIC_TEXT_TYPE="type";
		public static final String STATIC_TEXT_ORDER="order";
		public static final String STATIC_TEXT_IMAGE="image";
		public static final String STATIC_TEXT_CREATED="created";
		public static final String STATIC_TEXT_MODIFIED="modified";
		public static final String STATIC_TEXT_ENABLED="enabled";
		
		//TABLE_STATIC_TEXT_LANG
		public static final String STATIC_TEXT_LANGUAGE_ID="id";
		public static final String STATIC_TEXT_ID_ID="static_text_id";
		public static final String STATIC_TEXT_LANGUAGE_LANGUAGE_ID="language_id";
		public static final String STATIC_TEXT_LANGUAGE_TITLE="title";
		public static final String STATIC_TEXT_LANGUAGE_BODY="body";
		public static final String STATIC_TEXT_LANGUAGE_DESCRIPTION="description";
		public static final String STATIC_TEXT_LANGUAGE_SHORT_DESCRIPTION="short_description";
		public static final String STATIC_TEXT_LANGUAGE_KEYWORD="keyword";
		public static final String STATIC_TEXT_LANGUAGE_FK_PAGE_LANGUAGE1="fk_page_language1";
		public static final String STATIC_TEXT_LANGUAGE_FK_PAGE_LANGUAGE_PAGE1="fk_page_lang_page1";
		
		
		//TABLE_SYS_ROUTERS
		public static final String SYS_ROUTERS_ID="id";
		public static final String SYS_ROUTERS_SLUG="slug";
		public static final String SYS_ROUTERS_CONTROLLER="controller";
		public static final String SYS_ROUTERS_TYPE="type";
		public static final String SYS_ROUTERS_WEBSITE_ID="website_id";
		public static final String SYS_ROUTERS_COUPAN_ID="coupan_id";
		public static final String SYS_ROUTERS_CATEGORY_ID="category_id";
		public static final String SYS_ROUTERS_CREATED="created";
		public static final String SYS_ROUTERS_MODIFIED="modified";
		public static final String SYS_ROUTERS_ENEBLED="enabled";
		
		//TABLE_USER
		public static final String USER_ID="id";
		public static final String USER_PARENT_ID="parent_id";
		public static final String USER_COMPANY_NAME="company_name";
		public static final String USER_TEAM_NAME="team_name";
		public static final String USER_ACCOUNT_TYPE="account_type";
		public static final String USER_DOMAIN_NAME="domain_name";
		public static final String USER_FIRST_NAME="first_name";
		public static final String USER_LAST_NAME="last_name";
		public static final String USER_USER_NAME="username";
		public static final String USER_EMAIL="email";
		public static final String USER_PASSWORD="password";
		public static final String USER_IMAGE="image";
		public static final String USER_ADDRESS="address";
		public static final String USER_STREET="street";
		public static final String USER_CITY="city";
		public static final String USER_STATE="state";
		public static final String USER_COUNTRY="country";
		public static final String USER_ZIP="zip";
		public static final String USER_PHONE="phone";
		public static final String USER_USER_TYPE="user_type";
		public static final String USER_CREATED_BY="created_by";
		public static final String USER_ADMIN_CONFIRM="admin_confirm";
		public static final String USER_CONFIRM="confirm";
		public static final String USER_ENABLED="enabled";
		public static final String USER_CREATED="created";
		public static final String USER_USER_MODIFIED="modified";
		public static final String USER_USER_STATUS="status";
		public static final String USER_USER_DATE_ADDED="date_added";
		
		//Useronline
		public static final String USER_ONLINE_ID = "_id";
		public static final  String USER_ONLINE_USERID = "user_id";
		public static final String USER_ONLINE_USERTYPE = "user_type";
		public static final String USER_ONLINE_STATUS = "status";
		public static final String USER_ONLINE_LAST_ACTIVE_TIME = "last_active_time";
		public static final String USER_ONLINE_CREATE_DATE = "create_date";
		
		//VisitorActivity
	    public  static final String VISITOR__ACTIVITY_ID = "visitor_id";
		public static final  String VISITOR__ACTIVITY_TIMESTAMP = "timestamp";
		public static final String VISITOR__ACTIVITY_VISIT_DATE = "visit_date";
		public static final String VISITOR__ACTIVITY_IP_ADDRESS = "ip_address";
		public static final String VISITOR__ACTIVITY_MODIFIED = "modified";
		public static final String VISITOR__ACTIVITY_CREATED = "created";

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
}
