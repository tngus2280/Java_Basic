package java13_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {
	public static void main(String[] args) {
		
		//스트림 기본적으로 바이트 단위로 통신을 한다
		//	바이트스트림을 문자스트림으로 변환할 필요가 있다
		
		//	InputStreamReader
		//	OutputStreamWriter
		//	두 클래스를 이용하여 변환한다
		
		
		
		//표준입력스트림 System.in -> Reader
		Reader reader = new InputStreamReader( System.in );
		
		//표준출력스트림 System.out -> Writer
		Writer writer = new OutputStreamWriter( System.out );
		
		
		//입출력 보조 변수
		char[] cbuf = new char[1024]; // 입력 데이터 임시 저장소
		int len = -1; //입력한 데이터 길이 (문자 수)
		int total = 0; //입력한 데이터의 총 길이 (문자 수)
		
		try {
			// EOF가 입력될 때까지 키보드의 입력을 받는다
			while( (len = reader.read(cbuf)) != -1 ) { //키보드 입력
				writer.write(cbuf, 0, len); //모니터 출력
//				writer.flush(); //버퍼 비우기
				
				total += len; //입력받은 문자 수 계산
			}
			
			writer.flush(); //버퍼 비우기
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(writer!=null)	writer.close();
				if(reader!=null)	reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//System.out(Writer) 를 close해서 동작하지 않음
		System.out.println("입출력한 문자는 총 " + total + "개 입니다");
	}
}
