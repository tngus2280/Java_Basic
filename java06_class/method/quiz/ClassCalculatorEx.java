package java06_class.method.quiz;

import java.util.Scanner;

// 실행클래스
public class ClassCalculatorEx {
	public static void main(String[] args) {
//		- 기능 : 계산기 기능클래스를 이용
//
//		정수2개와 연산자 1개를 입력받음 (Scanner 이용)
//		switch로 구분하여 계산기클래스 이용하기
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1번째 정수를 입력하시오");
		int n1;
		n1= sc.nextInt();
		
		System.out.println("2번째 정수를 입력하시오");
		int n2;
		n2 = sc.nextInt();
		
		sc.nextLine(); // 버퍼비우기 , '\n'
		
		System.out.println("연산자를 입력하시오");
		char operator = sc.nextLine().charAt(0);
		
		//System.out.println("[TEST]"+n1+","+n2+","+operator);
		
		//계산기 객체 생성
		Calculator calc =new Calculator();
		
		
		switch (operator) {
		case'+':
			System.out.println(n1+"+"+n2+"="+calc.sum(n1,n2));
			break;
		case'-':
			System.out.println(n1+"-"+n2+"="+calc.sub(n1,n2));
			break;
		case'*':
			System.out.println(n1+"*"+n2+"="+calc.mul(n1,n2));
			break;
		case'/':
			System.out.println(n1+"/"+n2+"="+calc.div(n1,n2));
			break;
			
			
			
			
//			+ package
//		 	java06_class.method.quiz
//
//		 + 클래스 작성하기
//		  1. 기능 클래스 ( class Calculator )
//			- 기능 : 사칙연산 계산기
//			- 메소드 4개
//				sum, sub, mul, div
//			- 매개변수 : 정수 2개
//			- return : 정수 (단, div는 double)
//
//		  2. 실행 클래스 ( class CaculatorEx )
//			- 기능 : 계산기 기능클래스를 이용
//
//				정수2개와 연산자 1개를 입력받음 (Scanner 이용)
//				switch로 구분하여 계산기클래스 이용하기
//
//		ex) switch( operator ) {
//		    case '+':
//		      System.out.println(n1+"+"+n2+"="+calc.sum(n1,n2));
//		      break;
			
		}
				
				
		
	}
}
