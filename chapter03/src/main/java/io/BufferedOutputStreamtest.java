package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamtest {
	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			// 기반스트림
			FileOutputStream fos = new FileOutputStream("test.txt"); // 레퍼런스 타입을 부모인 OutputStream으로 받아도됨
		
			// 보조스트림
			bos = new BufferedOutputStream(fos);
			
		 // for(int i = 'a' ; i <= 'z' ; i++)
			for(int i = 97 ; i <= 122 ; i++) {
				bos.write(i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't Open:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		}
		finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
