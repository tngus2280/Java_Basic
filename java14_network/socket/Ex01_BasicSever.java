package java14_network.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_BasicServer {
	public static void main(String[] args) {
		
		
		ServerSocket servSock = null; //서버 리슨 소켓
		Socket sock = null; //통신소켓
		
		PrintWriter out = null; //소켓 출력 스트림
		
		try {
			// --------서버 리슨 소켓 활성화----------------
			//----------------------------------------------
			servSock = new ServerSocket(10001); //리슨 소켓 생성
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			System.out.println();
			System.out.println("--- 클라이언트 접속 대기중 ---");
			System.out.println("Listen Port : "+ servSock.getLocalPort());
			System.out.println("------------------------------------------");
			
			//클라이언트가 접속하면 통신용 소켓을 반환한다
			sock = servSock.accept();//  ,서버 리슨 ,Listen
			//----------------------------------------------
			
			//----------------일시 정지 상태 , BLOCKED--------------------------
			
			// -------- 접속 정보 확인 ------
			System.out.println();
			System.out.println("\n클라이언트 접속!");
			InetAddress ip = sock.getInetAddress();// 클라이언트 IP정보 얻기
			System.out.println("   >> 클라이언트 IP :" + ip.getHostAddress());
			System.out.println("   >> 클라이언트 Port : "+ sock.getPort());
			System.out.println("----------------------------------------");
			
			
			
			//--------------------------------
			
			// ---데이터 통신 -----
			// 통신 소켓 sock 에서 입출력 스트림을 얻어 통신한다
			
//			sock.getInputStream();	//소켓을 통한 입력 스트림
//			sock.getOutputStream(); // 소켓을 통한 출력 스트림
			
			 out = new PrintWriter(sock.getOutputStream(), true); // auto flush
			 out.println("Hello");
			// --------------------------
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(out!=null)	out.close();
					if(sock!=null)	sock.close();
					if(servSock!=null)	servSock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
	}
}
