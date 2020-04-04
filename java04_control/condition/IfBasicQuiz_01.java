package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	public static void main(String[] args) {
		//+ 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
		// >> input Number : -3
		// 음수입니다
		
//		+ 입력한 데이터가 3의 배수인지 판별하시오
//		(%연산자 사용)
//		>> input number:7
//		>>3의 배수가 아닙니다
//		
		
//		+ 두 수를 입력받아 큰 수를 출력하시오
//		>> input number1 : 44
//		>> input number2: 88
		// 88이 더 큰수
		
		
		//입력 객체 생성
		// 
		// 조건문
		
		Scanner sc = new Scanner(System.in); //키보드 입력 객체
		
		System.out.print("숫자를 입력하시오:");
		//System.out.print("Input Number:");
		int num1 = sc.nextInt();
		// int num1 = sc.nextInt(); // int형 입력 
		
		if(num1>0) {
			System.out.println("양수입니다");
		}
		//Sysyem.out.println("num1[+num1+"]은/는 양수 입니다");
			if(num1<0) {
				System.out.println("음수입니다");
		}
			//Sysyem.out.println("num1[+num1+"]은/는 음수 입니다");
			
		if(num1==0) {
			System.out.println("입력한 숫자는 0입니다");
		}
			
		System.out.println("----------------------");
		
		//단, 0은 모둔 수의 배수가 아니다
		int num2 = sc.nextInt();
		// int num2 = sc.nextInt(); // int형 입력
			if(num2 % 3 ==0 && num2 != 0) {
				System.out.println("3의 배수입니다");
			}
			//Sysyem.out.println("num2[+num2+"]은/는 3의 배수 입니다");
			if(num2 % 3 !=0 || num2==0) {
				System.out.println("3의 배수가 아닙니다");
			}
			//Sysyem.out.println("num2[+num2+"]은/는 3의 배수가 아닙니다");
			
			
			
		System.out.println("----------------------------");
		
		//System.out.print("Input Number:");
		//int num3 = sc.nextInt();
		//System.out.print("Input Number:");
		//int num4 = sc.nextInt();
		System.out.println("숫자 2개를 입력하시오");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		if(num3>num4) {
			System.out.println("num3["+num3+"]가 크다");
		}
		if(num3<num4) {
			System.out.println("num4["+num4+"]가 크다");
		}
		
		if(num3==num4) {
			System.out.println("num3,num4가["+num4+"]으로 같다");
		}
		
	}
}
