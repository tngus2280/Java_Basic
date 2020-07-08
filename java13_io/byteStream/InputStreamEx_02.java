package java13_io.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02 {
	public static void main(String[] args) {
		
		InputStream is = System.in; // 표준 입력 객체
		
		int in = -1; // 입력받은 데이터
	
		StringBuilder sb = new StringBuilder();  // 입력받은 데이터 저장소
		
		try {
			
			//입력받을 데이터가 남아있으면 계속 반복
			while((in = is.read()) != -1){
				
				//입력된 아스키코드를 문자로 변형하여 StringBuilder에 저장
				sb.append((char)in);
			}
			
			//끝나는 파트
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
				try {
					if(is!=null)   // in이 null이면 널포인트익셉션발생 
					is.close(); // 스트림 닫기
			} 	catch (IOException e) {
					e.printStackTrace();
			}
		}
		
		System.out.println("\n<<입력 결과>>");
		System.out.println("sb : "+ sb);
		// 입력결과를 받을때 아무리 입력을해도 끝나지 않는데 ctrl+z하면 나온다
		// 키보드에서 EOF를 전송하기 위해 ctrl+z를 사용한다
		
		// ctrl+ z : ^Z(EOF)
			
	}// main end
}
