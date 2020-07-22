package java14_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex01_BasicClient {
	public static void main(String[] args) {
		
		
		Socket sock = null;// 클라이언트 소켓
		
		BufferedReader in = null; //소켓 입력 스트림
		
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			sock = new Socket("localhost",10001);// 서버 접속
			
			// ---- 데이터 통신
			// sock에서 입출력 스트림을얻어 통신
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			String msg = in.readLine(); // 데이터 읽기
			
			System.out.println();
			System.out.println("\t>> 전송데이터 : "+ msg);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원해제
			try {
				if(in!=null)	in.close();
				if(sock!=null) sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
