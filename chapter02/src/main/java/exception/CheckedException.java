package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		// FileInputStream클래스의 생성자가 "만약 파일이 없으면 어떡해"라는 물음을 exception으로 던짐거임
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("hello2.txt");
			int data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			System.out.println("error:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(fis != null) {
				fis.close(); //fis는 지역변수라 참조가 안되므로 try안에 있으면 안됨!
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
