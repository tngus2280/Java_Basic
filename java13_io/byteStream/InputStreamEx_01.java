package java13_io.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01 {
	public static void main(String[] args) {
		
		InputStream is; // 입력 객체
		is = System.in; // 표준 입력
		
		try {
			System.out.print("입력하세요 :");
			int in = is.read(); // 1바이트 입력, 아스키 코드 반환
			
			System.out.println( in );
			
			System.out.println("문자: " + (char)in);
			
		} catch (IOException e) {
		}
		
		
	}
}
