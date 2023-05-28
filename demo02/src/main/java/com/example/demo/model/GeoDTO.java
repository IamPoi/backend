package com.example.demo.model;

public class GeoDTO {

	private int geo_uid;
	private String geo_name;
	private String latitude;
	private String longitude;
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

	public int getGeo_code() {
		return geo_code;
	}

	public void setGeo_code(int geo_code) {
		this.geo_code = geo_code;
	}

	public GeoDTO(int geo_uid, String geo_name, String latitude, String longitude, int geo_code) {
		super();
		this.geo_uid = geo_uid;
		this.geo_name = geo_name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.geo_code = geo_code;
	}

	@Override
	public String toString() {
		return "GeoDTO [geo_uid=" + geo_uid + ", geo_name=" + geo_name + ", latitude=" + latitude + ", longitude="
				+ longitude + ", geo_code=" + geo_code + "]";
	}

}
