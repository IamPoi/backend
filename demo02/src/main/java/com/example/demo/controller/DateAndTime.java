package com.example.demo.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTime {

//	사용법
//	DateAndTime dateAndTime = new DateAndTime();
//	
//	System.out.println(dateAndTime.nowDate());
//	System.out.println(dateAndTime.nowTime());

	public LocalDate nowDate() {

		LocalDate now = LocalDate.now(ZoneId.of("Asia/Seoul"));

//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//
//		String formatedNow = now.format(formatter);
//
//		Date date = (Date) formatter.parse(formatedNow);
//
//		return date;
		return now;
	}

	public LocalTime nowTime() {

		LocalTime now = LocalTime.now(ZoneId.of("Asia/Seoul"));

//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//		String formatedNow = now.format(formatter);
//
//		Localtime time = LocalTime.parse(formatedNow, formatter);
//
//		return time;
		return now;
	}

}
