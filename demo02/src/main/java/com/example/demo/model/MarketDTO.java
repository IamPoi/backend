package com.example.demo.model;

public class MarketDTO {

	private String market_name;
	private String market_location_a;
	private String market_location_b;
	private float market_latitude;
	private float market_longitude;
	private String market_type;
	private String market_item;
	private String geo_info;

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

	public float getMarket_latitude() {
		return market_latitude;
	}

	public void setMarket_latitude(float market_latitude) {
		this.market_latitude = market_latitude;
	}

	public float getMarket_longitude() {
		return market_longitude;
	}

	public void setMarket_longitude(float market_longitude) {
		this.market_longitude = market_longitude;
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

	public String getGeo_info() {
		return geo_info;
	}

	public void setGeo_info(String geo_info) {
		this.geo_info = geo_info;
	}

	public MarketDTO(String market_name, String market_location_a, String market_location_b, float market_latitude,
			float market_longitude, String market_type, String market_item, String geo_info) {
		super();
		this.market_name = market_name;
		this.market_location_a = market_location_a;
		this.market_location_b = market_location_b;
		this.market_latitude = market_latitude;
		this.market_longitude = market_longitude;
		this.market_type = market_type;
		this.market_item = market_item;
		this.geo_info = geo_info;
	}

	public MarketDTO(String market_name, String market_location_a, String market_location_b, String geo_info) {
		super();
		this.market_name = market_name;
		this.market_location_a = market_location_a;
		this.market_location_b = market_location_b;
		this.geo_info = geo_info;
	}

	public MarketDTO(String market_name) {
		super();
		this.market_name = market_name;
	}

	@Override
	public String toString() {
		return "MarketDTO [market_name=" + market_name + ", market_location_a=" + market_location_a
				+ ", market_location_b=" + market_location_b + ", market_latitude=" + market_latitude
				+ ", market_longitude=" + market_longitude + ", market_type=" + market_type + ", market_item="
				+ market_item + ", geo_info=" + geo_info + "]";
	}

}
