package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MarketDTO {

	private String market_uid;
	private LocalDate reg_date;
	private LocalTime reg_time;
	private Integer reg_mem_uid;
	private String reg_ip;
	private String market_name;
	private String market_location_a;
	private String market_location_b;
	private String latitude;
	private String longitude;
	private String market_period;
	private String market_type;
	private String market_item;
	private Integer market_store;
	private String homepage;
	private String img_lg_url;
	private String img_sm_url;
	private String geo_info;
	private LocalDate mod_date;
	private LocalTime mod_time;
	private Integer mod_mem_uid;
	private String mod_ip;

	public String getMarket_uid() {
		return market_uid;
	}

	public void setMarket_uid(String market_uid) {
		this.market_uid = market_uid;
	}

	public LocalDate getReg_date() {
		return reg_date;
	}

	public void setReg_date(LocalDate reg_date) {
		this.reg_date = reg_date;
	}

	public LocalTime getReg_time() {
		return reg_time;
	}

	public void setReg_time(LocalTime reg_time) {
		this.reg_time = reg_time;
	}

	public Integer getReg_mem_uid() {
		return reg_mem_uid;
	}

	public void setReg_mem_uid(Integer reg_mem_uid) {
		this.reg_mem_uid = reg_mem_uid;
	}

	public String getReg_ip() {
		return reg_ip;
	}

	public void setReg_ip(String reg_ip) {
		this.reg_ip = reg_ip;
	}

	public String getMarket_name() {
		return market_name;
	}

	public void setMarket_name(String market_name) {
		this.market_name = market_name;
	}

	public String getMarket_location_a() {
		return market_location_a;
	}

	public void setMarket_location_a(String market_location_a) {
		this.market_location_a = market_location_a;
	}

	public String getMarket_location_b() {
		return market_location_b;
	}

	public void setMarket_location_b(String market_location_b) {
		this.market_location_b = market_location_b;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMarket_period() {
		return market_period;
	}

	public void setMarket_period(String market_period) {
		this.market_period = market_period;
	}

	public String getMarket_type() {
		return market_type;
	}

	public void setMarket_type(String market_type) {
		this.market_type = market_type;
	}

	public String getMarket_item() {
		return market_item;
	}

	public void setMarket_item(String market_item) {
		this.market_item = market_item;
	}

	public Integer getMarket_store() {
		return market_store;
	}

	public void setMarket_store(Integer market_store) {
		this.market_store = market_store;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getImg_lg_url() {
		return img_lg_url;
	}

	public void setImg_lg_url(String img_lg_url) {
		this.img_lg_url = img_lg_url;
	}

	public String getImg_sm_url() {
		return img_sm_url;
	}

	public void setImg_sm_url(String img_sm_url) {
		this.img_sm_url = img_sm_url;
	}

	public String getGeo_info() {
		return geo_info;
	}

	public void setGeo_info(String geo_info) {
		this.geo_info = geo_info;
	}

	public LocalDate getMod_date() {
		return mod_date;
	}

	public void setMod_date(LocalDate mod_date) {
		this.mod_date = mod_date;
	}

	public LocalTime getMod_time() {
		return mod_time;
	}

	public void setMod_time(LocalTime mod_time) {
		this.mod_time = mod_time;
	}

	public Integer getMod_mem_uid() {
		return mod_mem_uid;
	}

	public void setMod_mem_uid(Integer mod_mem_uid) {
		this.mod_mem_uid = mod_mem_uid;
	}

	public String getMod_ip() {
		return mod_ip;
	}

	public void setMod_ip(String mod_ip) {
		this.mod_ip = mod_ip;
	}

	public MarketDTO(String market_uid, LocalDate reg_date, LocalTime reg_time, Integer reg_mem_uid, String reg_ip,
			String market_name, String market_location_a, String market_location_b, String latitude, String longitude,
			String market_period, String market_type, String market_item, Integer market_store, String homepage,
			String img_lg_url, String img_sm_url, String geo_info, LocalDate mod_date, LocalTime mod_time,
			Integer mod_mem_uid, String mod_ip) {
		super();
		this.market_uid = market_uid;
		this.reg_date = reg_date;
		this.reg_time = reg_time;
		this.reg_mem_uid = reg_mem_uid;
		this.reg_ip = reg_ip;
		this.market_name = market_name;
		this.market_location_a = market_location_a;
		this.market_location_b = market_location_b;
		this.latitude = latitude;
		this.longitude = longitude;
		this.market_period = market_period;
		this.market_type = market_type;
		this.market_item = market_item;
		this.market_store = market_store;
		this.homepage = homepage;
		this.img_lg_url = img_lg_url;
		this.img_sm_url = img_sm_url;
		this.geo_info = geo_info;
		this.mod_date = mod_date;
		this.mod_time = mod_time;
		this.mod_mem_uid = mod_mem_uid;
		this.mod_ip = mod_ip;
	}

	public MarketDTO() {
		super();
	}

	@Override
	public String toString() {
		return "MarketDTO [market_uid=" + market_uid + ", reg_date=" + reg_date + ", reg_time=" + reg_time
				+ ", reg_mem_uid=" + reg_mem_uid + ", reg_ip=" + reg_ip + ", market_name=" + market_name
				+ ", market_location_a=" + market_location_a + ", market_location_b=" + market_location_b
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", market_period=" + market_period
				+ ", market_type=" + market_type + ", market_item=" + market_item + ", market_store=" + market_store
				+ ", homepage=" + homepage + ", img_lg_url=" + img_lg_url + ", img_sm_url=" + img_sm_url + ", geo_info="
				+ geo_info + ", mod_date=" + mod_date + ", mod_time=" + mod_time + ", mod_mem_uid=" + mod_mem_uid
				+ ", mod_ip=" + mod_ip + "]";
	}

}
