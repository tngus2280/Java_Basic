package java04_control.switchCase;

import java.util.Scanner;

public class SwitchQuiz_Menu {
	public static void main(String[] args) {
		
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		// - 메뉴 만들기
		
		
		// menu
//		======================
//		// 1. Hello World 출력
//		// 2. 이름출력
//		// 3. 성별 출력
//		// 4. 종료
//		======================
		
		int select = 0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("M e n u");
		System.out.println("============================");
		System.out.println("1.Hello World 출력 ");
		System.out.println("2. 이름출력 ");
		System.out.println("3. 성별 출력 ");
		System.out.println("4. 종료 ");
		System.out.println();
		System.out.print(">>");
		select = sc.nextInt();
		
		switch(select) {
		
		case HELLO_MENU:
			System.out.println("Hello world");
			break;
		case NAME_MENU:
			System.out.println("김수현");
			break;
			
		case GENDER_MENU:
			System.out.println("남");
			break;
			
		case EXIT_MENU:
			System.out.println("종료");
			break;
		default:
			System.out.println("잘못된 메뉴를 입력 했습니다");
		}	
				}while(select!=4);
	}
		

}
