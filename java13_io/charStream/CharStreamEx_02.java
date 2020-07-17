package java13_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharStreamEx_02 {
	public static void main(String[] args) {
		
		//표준입력스트림 System.in -> Reader
		BufferedReader reader = new BufferedReader(
				new InputStreamReader( System.in ));
		
		//표준출력스트림 System.out -> Writer
		BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter( System.out ));

		String str = null; //입력받은 문자열
		
		try {
			//EOF를 만날때까지 문자열 입력(개행문자를 기준으로 입력함)
			while( (str = reader.readLine()) != null ) {
				writer.write(str); //문자열 출력
				writer.newLine(); //개행
				
				writer.flush(); //버퍼 비우기
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(reader!=null)	reader.close();
				if(writer!=null)	writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
