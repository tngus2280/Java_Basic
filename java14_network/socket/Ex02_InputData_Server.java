package java14_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_InputData_Server {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; //서버 리슨 소켓
		Socket sock = null; //통신소켓
		BufferedReader in = null;
		PrintWriter out = null; //소켓 출력 스트림
		
		try {
			servSock = new ServerSocket(10002); //리슨 소켓 생성
			System.out.println();
			System.out.println("--- 클라이언트 접속 대기중 ---");
			System.out.println("Listen Port : "+ servSock.getLocalPort());
			System.out.println("------------------------------------------");
			
			
			sock = servSock.accept();//클라이언트가 서버에 접속시 소켓 반환
			
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String msg = in.readLine(); // 데이터 읽기
			
			System.out.println();
			System.out.println("\t>> 전송데이터 : "+ msg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close();
				if(sock!=null)	sock.close();
				if(servSock!=null)	servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
