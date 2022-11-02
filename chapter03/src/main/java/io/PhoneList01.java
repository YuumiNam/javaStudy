package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoneList01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
		File file = new File("phone.txt"); // Input Output과 관련은 없는 클래스임
		
		if(!file.exists()) {
			System.out.println("file not found");
			return;
		}
		
		System.out.println("======파일정보======");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length() + "bytes");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh시 mm분 ss초").format(new Date(file.lastModified())));
		
		System.out.println("======전화번호======");
		// 1. 기반스트림
		FileInputStream fs = new FileInputStream(file);
		
		// 2. 보조스트림
		InputStreamReader isr = new InputStreamReader(fs,"utf-8");
		
		// 3. 보조스트림
		br = new BufferedReader(isr);
		
		// 4. 처리
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		} catch(IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(br != null) {
				br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
