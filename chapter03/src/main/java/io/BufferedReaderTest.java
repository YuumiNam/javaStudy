package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 기반스트림
			FileReader fr = new FileReader("./src/main/java/io/BufferedReaderTest.java"); // 레퍼런스 타입을 부모인 Reader로 받아도됨
			
			// 보조스트림
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't Open:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		}
		finally {
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
