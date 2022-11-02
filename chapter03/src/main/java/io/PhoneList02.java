package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {
	public static void main(String[] args) throws FileNotFoundException { // throws e : 예외를 회피함
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
		
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String name = sc.next();
			String phone01 = sc.next();
			String phone02 = sc.next();
			String phone03 = sc.next();
			
			System.out.println(name + ":" + phone01 + "-" + phone02 + "-" + phone03);
		}
		
		sc.close();
	}
}

