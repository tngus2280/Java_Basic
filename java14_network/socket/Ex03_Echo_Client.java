package java14_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex03_Echo_Client {
//	 ** echo : 메아리
//
//	  - 전송된 데이터를 그대로 다시 다시 돌려보내는 프로그램
//
//	  - Ex03_Echo_Client
//		키보드로 입력한 데이터를 서버로 전송한다
//
//		서버로부터 돌아온 데이터를 모니터로 출력한다
	public static void main(String[] args) {
		
		Socket sock = null;// 클라이언트 소켓
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null; // 소켓 입력 스트림
		PrintWriter out = null; // 소켓 출력 스트림
		
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			//접속
			sock = new Socket("localhost" , 10003);
			System.out.println("서버에 보낼 말을 입력 하세요 :");
			String str = sc.nextLine();//입력 값
			
			//출력스트림
			out = new PrintWriter(sock.getOutputStream(),true);
			
			out.println(str);
			// 서버에 보낼말 출력
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			System.out.println();
			System.out.println("\t>>서버로 부터 받은 데이터 : "+in.readLine()); // 서버로 부터 가져온 데이터 출력
			
//			System.out.println("서버로부터 돌아온 데이터:"+in);
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(out!=null)	out.close();
				if(in!=null)	in.close();
				if(sock!=null)	sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
