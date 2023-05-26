package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class MemberDTO {

	public MemberDTO() {
		super();
	}

	private int mem_uid;
	private LocalDate reg_date;
	private LocalTime reg_time;
	private String reg_ip;
	private String mem_type;
	private String mem_id;
	private String mem_pw;
	private String mem_email;
	private String mod_pw_1;
	private String mod_pw_2;
	private String mod_pw_3;
	private String mem_name;
	private String marketing_flag;
	private String mem_status;
	private String mem_out_flag;
	private Date mem_out_date;
	private Date mem_out_time;
	private String mem_out_ip;

	@Override
	public String toString() {
		return "MemberDTO [mem_uid=" + mem_uid + ", reg_date=" + reg_date + ", reg_time=" + reg_time + ", reg_ip="
				+ reg_ip + ", mem_type=" + mem_type + ", mem_id=" + mem_id + ", mem_pw=" + mem_pw + ", mem_email="
				+ mem_email + ", mod_pw_1=" + mod_pw_1 + ", mod_pw_2=" + mod_pw_2 + ", mod_pw_3=" + mod_pw_3
				+ ", mem_name=" + mem_name + ", marketing_flag=" + marketing_flag + ", mem_status=" + mem_status
				+ ", mem_out_flag=" + mem_out_flag + ", mem_out_date=" + mem_out_date + ", mem_out_time=" + mem_out_time
				+ ", mem_out_ip=" + mem_out_ip + "]";
	}

	public int getMem_uid() {
		return mem_uid;
	}

	public void setMem_uid(int mem_uid) {
		this.mem_uid = mem_uid;
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

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMod_pw_1() {
		return mod_pw_1;
	}

	public void setMod_pw_1(String mod_pw_1) {
		this.mod_pw_1 = mod_pw_1;
	}

	public String getMod_pw_2() {
		return mod_pw_2;
	}

	public void setMod_pw_2(String mod_pw_2) {
		this.mod_pw_2 = mod_pw_2;
	}

	public String getMod_pw_3() {
		return mod_pw_3;
	}

	public void setMod_pw_3(String mod_pw_3) {
		this.mod_pw_3 = mod_pw_3;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMarketing_flag() {
		return marketing_flag;
	}

	public void setMarketing_flag(String marketing_flag) {
		this.marketing_flag = marketing_flag;
	}

	public String getMem_status() {
		return mem_status;
	}

	public void setMem_status(String mem_status) {
		this.mem_status = mem_status;
	}

	public String getMem_out_flag() {
		return mem_out_flag;
	}

	public void setMem_out_flag(String mem_out_flag) {
		this.mem_out_flag = mem_out_flag;
	}

	public Date getMem_out_date() {
		return mem_out_date;
	}

	public void setMem_out_date(Date mem_out_date) {
		this.mem_out_date = mem_out_date;
	}

	public Date getMem_out_time() {
		return mem_out_time;
	}

	public void setMem_out_time(Date mem_out_time) {
		this.mem_out_time = mem_out_time;
	}

	public String getMem_out_ip() {
		return mem_out_ip;
	}

	public void setMem_out_ip(String mem_out_ip) {
		this.mem_out_ip = mem_out_ip;
	}

	public MemberDTO(int mem_uid, LocalDate reg_date, LocalTime reg_time, String reg_ip, String mem_type, String mem_id,
			String mem_pw, String mem_email, String mod_pw_1, String mod_pw_2, String mod_pw_3, String mem_name,
			String marketing_flag, String mem_status, String mem_out_flag, Date mem_out_date, Date mem_out_time,
			String mem_out_ip) {
		super();
		this.mem_uid = mem_uid;
		this.reg_date = reg_date;
		this.reg_time = reg_time;
		this.reg_ip = reg_ip;
		this.mem_type = mem_type;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_email = mem_email;
		this.mod_pw_1 = mod_pw_1;
		this.mod_pw_2 = mod_pw_2;
		this.mod_pw_3 = mod_pw_3;
		this.mem_name = mem_name;
		this.marketing_flag = marketing_flag;
		this.mem_status = mem_status;
		this.mem_out_flag = mem_out_flag;
		this.mem_out_date = mem_out_date;
		this.mem_out_time = mem_out_time;
		this.mem_out_ip = mem_out_ip;
	}

}
