package java13_io.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_01 {
	public static void main(String[] args) {
		
		OutputStream os = null; //출력 스트림 객체
		os = System.out; // 표준 출력
		
		try {
			os.write(97); // 'a' ascii 코드로 97번
			os.flush(); // 버퍼 비우기 ,버퍼에 머물러있음,    출력 버퍼의 내용을 출력장치로 내보낸다
			
			os.write('b');
			os.write('c');
			os.write('\n');
			
			os.write('1');
			os.write('2');
			os.write('3');
			os.write('\n'); // 개행문자는 flush를 수행하지 않는다
			os.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)	os.close(); // close는 실수로 flush 안했을때 내보내기 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
