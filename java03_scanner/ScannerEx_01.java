package java03_scanner;

// 외부 패키지에 있는 클래스를 사용 할 수 있도록 선언하는 코드
import java.util.Scanner; 

public class ScannerEx_01 {
	public static void main(String[] args) {
		
		int num; // 변수 선언
		
		num = 123;
		
		Scanner input; // 입력객체 변수 선언 . 기능을 가지고 있는 프로그램의 일부분 .패키지들끼리는 이름을 공유하지 않음.
		input = new Scanner(System.in);
		
		// \참조형들은 new라고 적어주고 참조형마다 ()안에 들어가는게 다르다 
		
		
		System.out.println("문자열 입력:");
		String text =	input.nextLine(); //입력한 문자열을 처리하는 메소드(기능)
		
		// nextLine(): 입력한 문자열을 처리하는 메소드(기능)

		
		System.out.println("입력한 문자열:"+ text);
		
	}
}
