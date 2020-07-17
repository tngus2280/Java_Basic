package java13_io.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		//class File
		// 파일정보를 다루는 클래스
		// 입출력 대상으로 사용할 수 있다
		
//		File file1 = new File("파일의 경로", "파일의 이름");
		File file1 = new File("D:/file/", "test.txt");
		
		System.out.println("file1 : "+ file1); //경로 
		System.out.println("length : " + file1.length()); //파일의 길이
		System.out.println("exists : " + file1.exists()); //존재하는가
		
		System.out.println("-----------------------------");
		
		File file2 = new File("D:/file/" , "file.txt");
		
		System.out.println("file2 : "+ file2); //경로 
		System.out.println("length : " + file2.length()); //파일의 길이
		System.out.println("exists : " + file2.exists()); //존재하는가
		
		
	}
}
