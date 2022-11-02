package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) {
		// InputStream(바이트스트림 최상위 input클래스,추상)을 상속받는 FileInputStream
		// OutputStream(바이트스트림 최상위 output클래스,추상)을 상속받는 FileOutputStream
		InputStream is = null;
		OutputStream os = null;
		
		try {
			 is = new FileInputStream("nature.jpg");
			 os = new FileOutputStream("natureCopy.jpg");
			 
			 int data = -1; // 데이터를 다 불러들이면 -1이됨
			 while((data = is.read()) != -1) {  // input으로 불러들인 파일을 읽는 메소드
				 os.write(data);
			 }
			 
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("file not found");
		}
		finally {
			try {
				if(is != null) {
				is.close();
				}
				if(os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
