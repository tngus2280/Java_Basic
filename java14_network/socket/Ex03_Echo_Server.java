package java14_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_Echo_Server {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; //서버 리슨 소켓
		Socket sock = null; //통신소켓
		
		BufferedReader in = null; // 소켓 입력 스트림
		PrintWriter out = null; //소켓 출력 스트림
		
		try {
			servSock = new ServerSocket(10003);
			System.out.println("+ + + 클라이언트 접속 대기중 + + +");
			
			sock = servSock.accept(); //클라이언트가 서버에 접속시 소켓 반환
			
			//---------block
			
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(sock.getOutputStream(),true);// autoflush
			
			
			String msg = in.readLine();// 데이터 읽기
			out.println(msg); // 데이터 보내기
			System.out.println();
			System.out.println("\t>> 전송데이터 : "+ msg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(in!=null)	in.close();
				if(out!=null)	out.close();
				if(sock!=null) sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	//	- Ex03_Echo_Server
//	클라이언트가 전달한 데이터를 다시 클라이언트로 출력한다
}
