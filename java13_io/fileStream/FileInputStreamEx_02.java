package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIntputStreamEx_02 {
	public static void main(String[] args) {
		
		//byte 배열을 이용한 입력 처리
		
		File file = new File("./src/java13_io/", "Source.txt");
		System.out.println("[TEST] exists : " + file.exists());
		
		int len = -1 ; //입력한 길이
		byte[] buf = new byte[1024]; // 입력데이터 임시 저장소
		int total = 0;// 총입력 길이 
		
		StringBuilder sb = new StringBuilder(); //입력받은 데이터 저장소
		
		FileInputStream fis = null; //파일 입력 스트림
				
			
		
		try {
			fis = new FileInputStream(file);
			while((len = fis.read(buf)) != -1) {// 파일입력
				sb.append( new String(buf , 0 , len)); //저장소에 데이터 저장
				
				total += len;
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace(); 
		}finally {
				try {
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		System.out.println("입력받은 길이 : "+ total + "B");
//		System.out.println(sb);
		
		
		
	}
}
