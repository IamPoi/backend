package com.example.demo.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {

//	사용법
//	SHA256 sha256 = new SHA256();
//	
//	try {
//		System.out.println(sha256.encrypt("ckddbs12"));
//		
//	} catch (NoSuchAlgorithmException e1) {
//		e1.printStackTrace();
//	}

	public String encrypt(String text) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(text.getBytes());

		return bytesToHex(md.digest());
	}

	private String bytesToHex(byte[] bytes) {
		
		StringBuilder builder = new StringBuilder();
		String code = "%02x";
		
		for (byte b : bytes) {
			builder.append(String.format(code, b));
		}
		return builder.toString();
	}

}

//dc31d12cc70fd96d4cc692be73ab89e5ad0dbc069d81871cf7aeecdcd741898c
//dc31d12cc70fd96d4cc692be73ab89e5ad0dbc069d81871cf7aeecdcd741898c