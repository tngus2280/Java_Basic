package java14_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_InputData_Client {
	public static void main(String[] args) {
//		- Ex02_InputData_Server
//		소켓으로 받은 내용을 모니터로 출력
//
//		sock->BufferedReader
//		System.out
		
		Socket sock = null; //소켓 생성
		Scanner sc = new Scanner(System.in); //입력 객체
		PrintWriter out = null; // 소켓 출력 스트림
		
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			sock= new Socket("localhost",10002);
			System.out.println("서버에 보낼 말을 입력하세요 : ");
			String str= sc.nextLine();
			out = new PrintWriter(sock.getOutputStream(),true);
			out.println(str);
		
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null)	out.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
