package java13_io.filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz1 {
	public static void main(String[] args) {
		
		File source = new File("./src/java13_io/filecopy/", "Bource.txt");
		System.out.println("[TEST] exists : "+ source.exists());
		File dest = new File("./src/java13_io/filecopy/", "Dest.txt");
		System.out.println("[TEST] exists1 : "+ dest.exists());
		
		
		FileInputStream fis = null; //파일 입력 스트림
		FileOutputStream fos = null; // 파일 출력 스트림
		byte[] b = new byte[1024]; // 입력데이터 임시 저장소
		int len = 0; // 입력한 길이
			
		try {
			
			fis = new FileInputStream(source); // 파일 입력 스트림 생성
			fis.read(b);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
//		1. 파일 객체 생성 ( Source.txt, Dest.txt )			o
//		2. 파일 입력,출력 스트림 객체 선언			o
//		3. byte[1024] 버퍼 생성 			o 
		
//		4. 파일 입출력 스트림 객체 생성
//		5. read(byte[]) , write(byte[], int, int) 를 이용하여 복사
//		  단, 5번은 while문을 이용하여 파일의 끝까지 복사되도록함
//		  추가적으로, "복사 완료, ?? Byte"라고 출력
//		6. 스트림 close()
//
//		-> 4, 5, 6 예외처리 적절히
//		-> e.printStackTrace() 지우고 직접 상황 출력할것
//		->	ex) [ERROR] 파일스트림 생성 실패

		
		
	}
}
