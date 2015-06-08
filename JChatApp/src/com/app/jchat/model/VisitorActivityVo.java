package com.app.jchat.model;

public class VisitorActivityVo {
	int visitor_id;
	String _timestamp;
	String visit_date;
	String ip_address;
	String _modified;
	String _created;
	public VisitorActivityVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VisitorActivityVo(int visitor_id, String _timestamp,
			String visit_date, String ip_address, String _modified,
			String _created) {
		super();
		this.visitor_id = visitor_id;
		this._timestamp = _timestamp;
		this.visit_date = visit_date;
		this.ip_address = ip_address;
		this._modified = _modified;
		this._created = _created;
	}
	@Override
	public String toString() {
		return "VisitorActivityVo [visitor_id=" + visitor_id + ", _timestamp="
				+ _timestamp + ", visit_date=" + visit_date + ", ip_address="
				+ ip_address + ", _modified=" + _modified + ", _created="
				+ _created + "]";
	}
	public int getVisitor_id() {
		return visitor_id;
	}
	public void setVisitor_id(int visitor_id) {
		this.visitor_id = visitor_id;
	}
	public String get_timestamp() {
		return _timestamp;
	}
	public void set_timestamp(String _timestamp) {
		this._timestamp = _timestamp;
	}
	public String getVisit_date() {
		return visit_date;
	}
	public void setVisit_date(String visit_date) {
		this.visit_date = visit_date;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String get_modified() {
		return _modified;
	}
	public void set_modified(String _modified) {
		this._modified = _modified;
	}
	public String get_created() {
		return _created;
	}
	public void set_created(String _created) {
		this._created = _created;
	}
	

}
