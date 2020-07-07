package java12_exception.quiz;

import java.util.Scanner;

import java12_exception.quiz.exception.CharCheckException;
import java12_exception.quiz.exception.NumberProcess;
import java12_exception.quiz.exception.NumberRangeException;

import java.io.*;


public class ExceptionQuizEx {
	final static Scanner sc = new Scanner(System.in);
	final static CharacterProcess p = new CharacterProcess();
	final static NumberProcess p2 = new NumberProcess();
	
	public static void main(String[] args) {
//		quiz();
		quiz2();
		
//		main() 메소드에서 quiz1() 메소드를 호출하여 실행
//
//		실행할 메소드 작성 : public static void quiz1(){}
//
//		키보드로 문자열을 입력받아(Scanner 사용)
//		countAlpha 메소드로 문자열 전달하고, 실행결과 받아 출력함.
//		- 반드시 try ~ catch 문 사용.
//		에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."
				
			
	}
//	public static void quiz() {
//		try {
//			String temp =sc.nextLine();
//			System.out.println(p.countAlpha(temp));
//		}catch(CharCheckException e) {
//			System.out.println(e.getMessage());
//		}
//	}
	public static void quiz2() {
		int temp2 = sc.nextInt();
		int temp3 = sc.nextInt();
		try {
			if(p2.checkDouble(temp2, temp3)) {
				System.out.println(temp2 + "는 "+ temp3+"의 배수입니다"); 		
			}else {
				System.out.println(temp2 + "는 "+ temp3+"의 배수가 아닙니다");
			}
			
		} catch (NumberRangeException e) {			
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
}
