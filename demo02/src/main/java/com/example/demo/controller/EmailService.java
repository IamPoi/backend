package com.example.demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	public String sendEmail(String to) {

		System.out.println("메일 전송");

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject("OurMarket275 인증 메일");

		Random random = new Random();
		String numbers = String.valueOf((random.nextInt(900000) + 100000));

		message.setText(numbers);

		mailSender.send(message);

		System.out.println("메일 전송 끝");
		
		return numbers;

	}

}
