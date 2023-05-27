package com.example.demo.model;

public class GeoDTO {

	private int geo_uid;
	private String geo_name;
	private String geo_latitude;
	private String geo_longitude;
	private int geo_code;

	public int getGeo_uid() {
		return geo_uid;
	}

	public void setGeo_uid(int geo_uid) {
		this.geo_uid = geo_uid;
	}

	public String getGeo_name() {
		return geo_name;
	}

	public void setGeo_name(String geo_name) {
		this.geo_name = geo_name;
	}

	public String getGeo_latitude() {
		return geo_latitude;
	}

	public void setGeo_latitude(String geo_latitude) {
		this.geo_latitude = geo_latitude;
	}

	public String getGeo_longitude() {
		return geo_longitude;
	}

	public void setGeo_longitude(String geo_longitude) {
		this.geo_longitude = geo_longitude;
	}

	public int getGeo_code() {
		return geo_code;
	}

	public void setGeo_code(int geo_code) {
		this.geo_code = geo_code;
	}

	public GeoDTO(int geo_uid, String geo_name, String geo_latitude, String geo_longitude, int geo_code) {
		super();
		this.geo_uid = geo_uid;
		this.geo_name = geo_name;
		this.geo_latitude = geo_latitude;
		this.geo_longitude = geo_longitude;
		this.geo_code = geo_code;
	}

	@Override
	public String toString() {
		return "GeoDTO [geo_uid=" + geo_uid + ", geo_name=" + geo_name + ", geo_latitude=" + geo_latitude
				+ ", geo_longitude=" + geo_longitude + ", geo_code=" + geo_code + "]";
	}

}
