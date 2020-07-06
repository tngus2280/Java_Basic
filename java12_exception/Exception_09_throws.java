package java12_exception;

import java.io.IOException;

public class Exception_09_throws {
	public static void main(String[] args) {
		
		
		System.out.println("Input : ");
		
		try {
			//키보드의 입력 1바이트 받기
			char input= (char) System.in.read();
			
			System.out.println("입력값: "+ input);
			System.out.println("ASCII: "+ (int)input);
			
		} catch (IOException e) { // IOException (input output exception) 입출력
			e.printStackTrace();
		}

		
	}
}

