package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//속도 줄이기

public class FileInputEx6 {
	public static void main(String[] args) {
	
		
		try(FileInputStream fis = new FileInputStream("C:\\temp\\iu.mp4");
				FileOutputStream fos = new FileOutputStream("C:\\temp\\iucopy.mp4")) {
			int data = 0;
		
			long start = System.currentTimeMillis(); //시작시간
			
			while((data=fis.read())!=-1) {

			}	

			long end = System.currentTimeMillis(); //종료시간
			System.out.println("inputStream/OutputStream 걸린시간"+(end-start)+"ms"); //걸린시간34550ms
			
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
		//buffered 쓰기
		//글자일 경우 reader writer로만 바꾸면 됨
		try(FileInputStream fis = new FileInputStream("C:\\temp\\iu.mp4");
			BufferedInputStream bis=new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("C:\\temp\\iucopy.mp4");
				BufferedOutputStream bos=new BufferedOutputStream(fos)){
			int data = 0;
				
			byte b[]=new byte[32768];
			
			long start = System.currentTimeMillis(); //시작시간
			
			while((data=fis.read(b))!=-1) {
				bos.write(b);
			}	

			long end = System.currentTimeMillis(); //종료시간
			System.out.println("inputStream+buffered+byte배열/OutputStream+buffered+byte 걸린시간"+(end-start)+"ms"); //걸린시간34550ms
			
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
		
	}
}
















