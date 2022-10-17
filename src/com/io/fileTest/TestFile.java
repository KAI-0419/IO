package com.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("src/person.txt");
		
		System.out.println("파일명: " + file.getName());
		System.out.println("저장경로: " + file.getAbsolutePath());
		System.out.println("저장경로: " + file.getPath());
		System.out.println("파일크기: " + file.length());
		
		try {
		boolean b = file.createNewFile();
		
		System.out.println(b);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
