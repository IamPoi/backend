package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MarketDTO {

	private String marketUid;
	private LocalDate regDate;
	private LocalTime regTime;
	private Integer regMemUid;
	private String regIp;
	private String marketName;
	private String marketLocationA;
	private String marketLocationB;
	private String marketLatitude;
	private String marketLongitude;
	private String marketPeriod;
	private String marketType;
	private String marketItem;
	private Integer marketStore;
	private String homepage;
	private String imgLgUrl;
	private String imgSmUrl;
	private String geoInfo;
	private LocalDate modDate;
	private LocalTime modTime;
	private Integer modMemUid;
	private String modIp;

	public String getMarketUid() {
		return marketUid;
	}

	public void setMarketUid(String marketUid) {
		this.marketUid = marketUid;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public LocalTime getRegTime() {
		return regTime;
	}

	public void setRegTime(LocalTime regTime) {
		this.regTime = regTime;
	}

	public Integer getRegMemUid() {
		return regMemUid;
	}

	public void setRegMemUid(Integer regMemUid) {
		this.regMemUid = regMemUid;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getMarketLocationA() {
		return marketLocationA;
	}

	public void setMarketLocationA(String marketLocationA) {
		this.marketLocationA = marketLocationA;
	}

	public String getMarketLocationB() {
		return marketLocationB;
	}

	public void setMarketLocationB(String marketLocationB) {
		this.marketLocationB = marketLocationB;
	}

	public String getMarketLatitude() {
		return marketLatitude;
	}

	public void setMarketLatitude(String marketLatitude) {
		this.marketLatitude = marketLatitude;
	}

	public String getMarketLongitude() {
		return marketLongitude;
	}

	public void setMarketLongitude(String marketLongitude) {
		this.marketLongitude = marketLongitude;
	}

	public String getMarketPeriod() {
		return marketPeriod;
	}

	public void setMarketPeriod(String marketPeriod) {
		this.marketPeriod = marketPeriod;
	}

	public String getMarketType() {
		return marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public String getMarketItem() {
		return marketItem;
	}

	public void setMarketItem(String marketItem) {
		this.marketItem = marketItem;
	}

	public Integer getMarketStore() {
		return marketStore;
	}

	public void setMarketStore(Integer marketStore) {
		this.marketStore = marketStore;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getImgLgUrl() {
		return imgLgUrl;
	}

	public void setImgLgUrl(String imgLgUrl) {
		this.imgLgUrl = imgLgUrl;
	}

	public String getImgSmUrl() {
		return imgSmUrl;
	}

	public void setImgSmUrl(String imgSmUrl) {
		this.imgSmUrl = imgSmUrl;
	}

	public String getGeoInfo() {
		return geoInfo;
	}

	public void setGeoInfo(String geoInfo) {
		this.geoInfo = geoInfo;
	}

	public LocalDate getModDate() {
		return modDate;
	}

	public void setModDate(LocalDate modDate) {
		this.modDate = modDate;
	}

	public LocalTime getModTime() {
		return modTime;
	}

	public void setModTime(LocalTime modTime) {
		this.modTime = modTime;
	}

	public Integer getModMemUid() {
		return modMemUid;
	}

	public void setModMemUid(Integer modMemUid) {
		this.modMemUid = modMemUid;
	}

	public String getModIp() {
		return modIp;
	}

	public void setModIp(String modIp) {
		this.modIp = modIp;
	}

	public MarketDTO(String marketUid, LocalDate regDate, LocalTime regTime, Integer regMemUid, String regIp,
			String marketName, String marketLocationA, String marketLocationB, String marketLatitude,
			String marketLongitude, String marketPeriod, String marketType, String marketItem, Integer marketStore,
			String homepage, String imgLgUrl, String imgSmUrl, String geoInfo, LocalDate modDate, LocalTime modTime,
			Integer modMemUid, String modIp) {
		super();
		this.marketUid = marketUid;
		this.regDate = regDate;
		this.regTime = regTime;
		this.regMemUid = regMemUid;
		this.regIp = regIp;
		this.marketName = marketName;
		this.marketLocationA = marketLocationA;
		this.marketLocationB = marketLocationB;
		this.marketLatitude = marketLatitude;
		this.marketLongitude = marketLongitude;
		this.marketPeriod = marketPeriod;
		this.marketType = marketType;
		this.marketItem = marketItem;
		this.marketStore = marketStore;
		this.homepage = homepage;
		this.imgLgUrl = imgLgUrl;
		this.imgSmUrl = imgSmUrl;
		this.geoInfo = geoInfo;
		this.modDate = modDate;
		this.modTime = modTime;
		this.modMemUid = modMemUid;
		this.modIp = modIp;
	}

	@Override
	public String toString() {
		return "MarketDTO [marketUid=" + marketUid + ", regDate=" + regDate + ", regTime=" + regTime + ", regMemUid="
				+ regMemUid + ", regIp=" + regIp + ", marketName=" + marketName + ", marketLocationA=" + marketLocationA
				+ ", marketLocationB=" + marketLocationB + ", marketLatitude=" + marketLatitude + ", marketLongitude="
				+ marketLongitude + ", marketPeriod=" + marketPeriod + ", marketType=" + marketType + ", marketItem="
				+ marketItem + ", marketStore=" + marketStore + ", homepage=" + homepage + ", imgLgUrl=" + imgLgUrl
				+ ", imgSmUrl=" + imgSmUrl + ", geoInfo=" + geoInfo + ", modDate=" + modDate + ", modTime=" + modTime
				+ ", modMemUid=" + modMemUid + ", modIp=" + modIp + "]";
	}

}
