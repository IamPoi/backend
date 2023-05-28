package com.example.demo.controller;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;

import jakarta.mail.internet.MimeMessage;

public class SendMail {



	public Map send(String toEmail) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		JavaMailSender javaMailSender = new JavaMailSender() {
			
			@Override
			public void send(SimpleMailMessage... simpleMessages) throws MailException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void send(SimpleMailMessage simpleMessage) throws MailException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void send(MimeMessagePreparator... mimeMessagePreparators) throws MailException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void send(MimeMessagePreparator mimeMessagePreparator) throws MailException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void send(MimeMessage... mimeMessages) throws MailException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void send(MimeMessage mimeMessage) throws MailException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public MimeMessage createMimeMessage(InputStream contentStream) throws MailException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public MimeMessage createMimeMessage() {
				// TODO Auto-generated method stub
				return null;
			}
		};

		Map<String, Object> result = new HashMap<>();

		try {
			// 1. 메일 수신자 설정
//	        String[] receiveList = ("test@naver.com", "test@gmail.com");
//	    	String toEmail = "ckddbs803@gmail.com";

			simpleMailMessage.setTo(toEmail);

			// 2. 메일 제목 설정
			simpleMailMessage.setSubject("test_title");

			// 3. 메일 내용 설정
			simpleMailMessage.setText("test_content");

			// 4. 메일 전송
			javaMailSender.send(simpleMailMessage);
			result.put("result", "success");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("result", "fail");
		}

		return result;
	}

}
