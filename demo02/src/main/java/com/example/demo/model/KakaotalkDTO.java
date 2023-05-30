package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class KakaotalkDTO {

	private int uid;
	private Long mem_id;
	private String mem_email;
	private String mem_name;
	private LocalDate reg_date;
	private LocalTime reg_time;
	private String reg_ip;
	private String mem_type;
	private String marketing_flag;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Long getMem_id() {
		return mem_id;
	}

	public void setMem_id(Long mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
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

	public String getReg_ip() {
		return reg_ip;
	}

	public void setReg_ip(String reg_ip) {
		this.reg_ip = reg_ip;
	}

	public String getMem_type() {
		return mem_type;
	}

	public void setMem_type(String mem_type) {
		this.mem_type = mem_type;
	}

	public String getMarketing_flag() {
		return marketing_flag;
	}

	public void setMarketing_flag(String marketing_flag) {
		this.marketing_flag = marketing_flag;
	}

	public KakaotalkDTO(int uid, Long mem_id, String mem_email, String mem_name, LocalDate reg_date, LocalTime reg_time,
			String reg_ip, String mem_type, String marketing_flag) {
		super();
		this.uid = uid;
		this.mem_id = mem_id;
		this.mem_email = mem_email;
		this.mem_name = mem_name;
		this.reg_date = reg_date;
		this.reg_time = reg_time;
		this.reg_ip = reg_ip;
		this.mem_type = mem_type;
		this.marketing_flag = marketing_flag;
	}

	public KakaotalkDTO() {
		super();
	}

	public KakaotalkDTO(Long mem_id, String mem_email) {
		super();
		this.mem_id = mem_id;
		this.mem_email = mem_email;
	}
	

}
