package java13_io.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_04 {
	public static void main(String[] args) {

		InputStream is = System.in; //표준 입력 객체
		
		byte[] b = new byte[1024]; //입력 데이터의 임시 저장소
		int len = -1; // 입력받은 데이터의 길이
		int total = 0; //입력한 데이터의 전체 길이
		
		StringBuilder sb = new StringBuilder();//입력받은 데이터 저장소
		
		
		System.out.println("<< 입력 대기중 >>");
		
		try {
			
			while( (len = is.read(b, 0 , b.length) )!=-1){
				total += len; // 전체 입력 길이 계산
				
				System.out.println("len : "+ len); //입력받은 길이 출력
				
				String str = new String(b , 0 , len);
				System.out.println("str : " + str);
				
//				System.out.println(" b : "+ b); // 입력받은 문자열 출력 , 배열의 참조값 출력
				
				// new String(b) 로 변환하면 byte[]에 모든 요소를 반환한다
				// 이때 이전에 입력했던 데이터도 같이 변환해버린다
				// new String( b, 0 , len ) 을 이용하여 입력한 길이만큼만 변환하여 사용한다
				sb.append(str);
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("전체 " + total+"Byte 입력 완료");
		System.out.println("\n<< 입력 데이터 >>");
		System.out.println(sb);
			
		
	}
}
