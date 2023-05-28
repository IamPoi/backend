package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class LogDTO {

	private int log_num;
	private String id;
	private LocalDate date;
	private LocalTime time;
	private String ip;

	public int getLog_num() {
		return log_num;
	}

	public void setLog_num(int log_num) {
		this.log_num = log_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "LogDTO [log_num=" + log_num + ", id=" + id + ", date=" + date + ", time=" + time + ", ip=" + ip + "]";
	}

}
