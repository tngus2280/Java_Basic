package java06_class.overloading;
//기능 클래스 ,오버로딩
public class Overloading_01 {
	
	private int x; // 인스턴스 변수
	private int y;
	
	// 멤버필드 x,y를 출력
	
	public void display() {  // 매개변수가 없는 display()메소드
		System.out.println("(" + x + "," + y +  ")");
		
		
	}
	// int형 2개를 전달인자로 받아 멤버 x,y 를 초기화 및 출력
	public void display(int x , int y) {
		this.x = x; // 매개변수로 처리됨 인스턴스 변수를 매개변수로 처리되게함 ,this 초기화
		this.y = y;   //초기화까지 완료
		
//		System.out.println("(" + x + "," + y +  ")");
		display();  // 위에 코드를 호출
	}
	
	
	//------------------------------------
	
	public void display(double d) {} // 
	
	public void display( String str) {}
	
	public void display( int i ) {}
	
//	public void display( int i ) {// 반환데이터타입은 오버로딩과 상관없다 , 리턴 데이터 타입만 바껴서는 오버로딩이 성립하지 않는다
//		return i;
//	}
	
	
}
