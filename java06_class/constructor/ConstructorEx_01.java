package java06_class.constructor;

import java.util.Scanner;

class Constructor{// 기능클래스

	private int num1;
	private int num2= 20;
	
	//매개변수가 없는 생성자 - 디폴트 생성자 // 초기화 , 멤퍼필드의 값을 지정해준다
	public Constructor() {
		System.out.println("디폴트 생성자 호출됨");
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = 500;
		num2 = 600;
		
		System.out.println("-----------");
		System.out.println(num1);
		System.out.println(num2);
		
		
	}
	// 매개변수가 있는 생성자
	
	public Constructor( int num1 , int num2) { //초기화해줄 값을 전달인자로 받으면 편한다
		
		System.out.println("매개변수 있는 생성자 호출됨");
		
//		this.num1 = num1;
//		this.num2 = num2;
		
		setNum1(num1);
		setNum2(num2);
		
		
		
	}
	// 일반 메소드 - 생성자와 헷갈리니까 절대 이렇게 만들지 말 것!
//	public void Construct() {
//		
//	}
	
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	
}


public class ConstructorEx_01 { // 실행클래스
	public static void main(String[] args) {
		
		Constructor cons = new Constructor(); // 매개변수 없는 생상자
			//지역변수			 // 동적할당 공간 ,생성자 호출
		System.out.println("cons:"+ cons.getNum1() + "," + cons.getNum2());
		
		
		
		Constructor cons02 = new Constructor(111,222);
		System.out.println("cons02:"+ cons02.getNum1() + "," + cons02.getNum2());
		

		Scanner sc = new Scanner(System.in);
		
		
		
	}
}
