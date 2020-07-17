package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		//출력 대상 파일
		
		File file = new File("./src/java13_io/fileStream/", "Result");
		System.out.println("[TEST] exists : "+ file.exists());
		
		FileOutputStream fos = null; //파일 출력 스트림 객체
		
		try {
			
//			fos = new FileOutputStream(file); // 파일 출력 스트림생성
//			fos = new FileOutputStream(file , false); // 쓰기모드
			
			
			fos = new FileOutputStream(file , true); // 추가모드
			
			//파일 출력 모드
			//	쓰기모드 - 두번째 인자를 false , 파일의 처음부터 새롭게 기록
			//	추가모드 - 두번째 인자를 true , 파일의 끝에 추가 기록
			
			String str = "Hello FileStream\n"; //출력 데이터 
			
			fos.write(str.getBytes(), 0 , str.length()); //파일 출력
			fos.flush();// 버퍼 비우기
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)	fos.close(); //스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
