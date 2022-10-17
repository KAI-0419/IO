package com.io.part03_addStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream {

	public static void main(String[] args) {
		TestBufferStream ts = new TestBufferStream();
//		ts.output();
		ts.input();
	}
	
	//new 보조Stream(new 보조stream(new 기반stream("외부자원")));
	
	public void input() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("sample3.txt"));
			
//			for(int i=0; i<5; i++) {
//				System.out.println(br.readLine());
//			}
			
			String val;
			while((val = br.readLine()) != null) {
				System.out.println(val);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void output() {
		BufferedWriter bw = null;
		try {
		bw = new BufferedWriter(new FileWriter("sample3.txt"));
		
		bw.write("안녕하세요\n");
		bw.write("반갑습니다.\n");
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
