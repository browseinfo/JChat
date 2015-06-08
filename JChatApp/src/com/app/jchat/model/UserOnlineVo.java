package com.app.jchat.model;

public class UserOnlineVo {
	int _id;
	int user_id;
	String user_type;
	String _status;
	String last_active_time;
	String create_date;
	
	public UserOnlineVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "UserOnlineVo [_id=" + _id + ", user_id=" + user_id
				+ ", user_type=" + user_type + ", _status=" + _status
				+ ", last_active_time=" + last_active_time + ", create_date="
				+ create_date + "]";
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int getUser_id() {
		return user_id;
	}

	public UserOnlineVo(int _id, int user_id, String user_type, String _status,
			String last_active_time, String create_date) {
		super();
		this._id = _id;
		this.user_id = user_id;
		this.user_type = user_type;
		this._status = _status;
		this.last_active_time = last_active_time;
		this.create_date = create_date;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String get_status() {
		return _status;
	}

	public void set_status(String _status) {
		this._status = _status;
	}

	public String getLast_active_time() {
		return last_active_time;
	}

	public void setLast_active_time(String last_active_time) {
		this.last_active_time = last_active_time;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	

}
