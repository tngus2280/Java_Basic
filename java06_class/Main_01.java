package java06_class;

// 실행 클래스 - main() 메소드를 가지고 있는 클래스

public class Main_01 {
	public static void main(String[] args) { //메인 클래스 안에 멤버
		
		int num;    // Local 변수
		
		//--------------------------------
		
		Class_01 c01; //Class_01 타입의 객체 변수 c01 선언 (참조형 변수)
		c01 = new Class_01(); // Class_01 타입의 객체(인스턴스) 생성
		
		c01.str = "Apple"; //멤버필드 str에 값 대입
		c01.num = 100; //멤버필드 num에 값 대입
		
		// c01객체의 멤버필드 num , str 출력하기 ( 객체 내부의 값 활용)
		System.out.println(c01.str);
		System.out.println(c01.num);
		
		
		// c01객체의 멤버 메소드 display() 사용 ( 호출, call)
		c01.display(); 
		// 메소드를 호출 할 때에는 메소드명을 적고 () 괄호를 붙인다
		
		//----------------------------------------------------------
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();
		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
		c05.num = 500;
		
		
	}
}
