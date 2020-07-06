package java12_exception;

import java.io.IOException; 

class ThrowsTest{ // 사용하는 main 으로 떠넘기기
	
	public void method() throws IOException {// 클래스명() 뒤에 throws IOException
		
		throw new IOException();// caller에게 예외처리를 넘겨버린다
	}
}


public class Exception_08_throws {
	public static void main(String[] args) { //메인메소드에 절대 네버 ,throws 걸어주면 안된다
		
		ThrowsTest tt = new ThrowsTest();
		
			try {
				tt.method();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		
	}
}
