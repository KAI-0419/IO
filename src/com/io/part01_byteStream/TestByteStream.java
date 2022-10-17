package com.io.part01_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	public static void main(String[] args) {
		TestByteStream tb = new TestByteStream();
//		tb.fileSave();
		tb.fileOpen();
	}
	
	public void fileSave() {
		
		FileOutputStream fout = null;
		
		try {
		//1. 통로 연결
		fout = new FileOutputStream("sample.txt");
		
		//2. 데이터 입출력
		fout.write(97);
		
		byte[] bar = {98,99,100,101,102,10};
		fout.write(bar);
		fout.write(bar,1,3);
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			//3. 통로 닫기
			fout.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		FileInputStream fin = null;
		
		try {
		//1.통로연결(Stream 생성)
		fin = new FileInputStream("Sample.txt");
		/*
		 * //2. 데이터 입출력 int fileSize = (int)new File("Sample.txt").length();
		 * 
		 * byte[] bar = new byte[fileSize];
		 * 
		 * fin.read(bar);
		 * 
		 * //2-1. 정상적으로 입력 되었는지 확인 for(int i=0; i<bar.length; i++) {
		 * System.out.println(bar[i]); System.out.println((char)bar[i] + " "); }
		 */
		
		int value;
		
		while((value = fin.read()) != -1) {
			System.out.println((char)value);
		}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			fin.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
