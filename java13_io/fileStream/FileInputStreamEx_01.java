package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIntputStreamEx_01 {
	public static void main(String[] args) {
		
		// 입력 대상 파일
		
		File file = new File("./src/java13_io/file/", "Hello");
		System.out.println("[TEST] exists : "+ file.exists());
		
		
		FileInputStream fis = null; // 파일 입력스트림 객체
		
		//파일 입력 보조 변수
		int in = -1; //입력 데이터
		int len = 0; //입력 받은 길이
		StringBuilder sb = new StringBuilder(); // 입력한 데이터 저장소
		try {
			fis = new FileInputStream(file); // 파일 입력 스트림 생성
			
			while((in = fis.read()) != -1) { //파일 입
				sb.append((char) in); //입력된 데이터 저장
				len++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)	fis.close(); // 스트림 닫기
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("[입력받은 길이]"+ len);
		System.out.println(sb);
		
	}
}


