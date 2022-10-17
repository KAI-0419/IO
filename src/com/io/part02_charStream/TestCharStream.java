package com.io.part02_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {

	public static void main(String[] args) {
		TestCharStream tc = new TestCharStream();
//		tc.fileSave();
		tc.fileOpen();
	}
	
	public void fileSave() {
		FileWriter fw = null;
		
		try {
		//1. Stream 생성
		fw = new FileWriter("sample2.txt",true);
		
		//2. 데이터 생성
		fw.write("멀티캠퍼스 401호");
		fw.write(' ');
		fw.write('A');
		fw.write(' ');
		char[] carr = {'a','p','p','l','e'};
		fw.write(carr);
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		 
		// try with resource
		try(FileReader fr = new FileReader("sample2.txt");) {
			
//			for(int i=0; i<100; i++) {
//				System.out.println(fr.read());
//			}
			
			int value;
			while((value=fr.read()) != -1) {
				System.out.println((char)value);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
