package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		
		// 절대 경로 이용
		// 루트 디렉토리로부터 파일까지 모든 경로를 다 적은 것
		File file1 = new File("D:\\Workspace\\JavaBasic\\src\\java13_io\\file" , "Hello");
		
		System.out.println("file1 : "+ file1); //경로 
		System.out.println("length : " + file1.length()); //파일의 길이
		System.out.println("exists : " + file1.exists()); //존재하는가
		
		
		System.out.println("----------------------");
		
		//상대 경로 이용
		// 클래스패스( Classpath)로부터 파일까지 경로를 적은 것
	
		
		// ** 클래스패스 , classpath 
		// 프로그램이 실행된 위치
		
		// 이클립스에서는 프로젝트 폴더가 클래스패스로 적용되어 있다 
		
		System.out.println("-------------------");

		File file2 = new File("D:\\workspace\\JavaBasic\\src\\java13_io\\file" , "Hello");
		
		System.out.println("file1 : "+ file2); //경로 
		System.out.println("length : " + file2.length()); //파일의 길이
		System.out.println("exists : " + file2.exists()); //존재하는가
		
		// 경로 지정 문자
		
		// .	-> 현재 디렉토리
		
		// ..	-> 부모 디렉토리
		
		// /	-> 루트 디렉토리
		
		// ex)	/test/folder	-> D:\test\folder\
		
		// ex)	./test			-> 프로그램실행폴더/test
		
		// ex)	D:/test/folder/../myfolder
		// 							-> D:\test\myfolder
		
	}
}
