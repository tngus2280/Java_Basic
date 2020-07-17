package java13_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {
	public static void main(String[] args) {
		// Source.txt -> Dest.txt
		//	문자스트림(BufferedReader, PrintWriter) 복사
		
		//	Source.txt 파일의 크기 == 4250Bytes
		
		//입출력 스트림
		BufferedReader in = null;
		PrintWriter out = null;
		 
		String str = null; //입력 문자열
		int total = 0; //복사된 총 문자열 길이
		
		try {
			//스트림 생성
			in = new BufferedReader(
					new FileReader("./src/java13_io/charStream/Source.txt") );
			out = new PrintWriter(
					new BufferedWriter(
							new FileWriter("./src/java13_io/charStream/Dest.txt")), true); //autoFlush

			while( (str = in.readLine()) != null ) {
				out.println(str);
				
				total += str.length(); //복사된 문자의 개수
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(in!=null)	in.close();
				if(out!=null)	out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(total + "개 문자 복사완료");
	}
}
