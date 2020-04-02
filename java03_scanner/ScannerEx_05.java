package java03_scanner;

import java.util.Scanner;

public class ScannerEx_05 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); //키보드 입력객체
	
	System.out.println("--- 입력 ---");  
	
	System.out.println("Input Number:");	// 
	int num= sc.nextInt();					//num 변수를 nextint로 받으려고함
	
	System.out.println("Input String:");
	sc.nextLine(); // 버퍼의 '\n' 지우기  
	String str= sc.nextLine();
	
	System.out.println();
	System.out.println("--- 출력 ---");
	System.out.println("숫자:"+ num);
	System.out.println("문자열:"+ str);
	
	
	// nextLine()메소드 사용하기 전에 nextLine()이외의 모든 next() 계열 메소드를 사용한 적이 있다면
	// nextLine() 직전에 nextLine()을 한번 더 실행해야한다
	// > 버퍼에 남은  '\n' 제거하기
	
}
}
