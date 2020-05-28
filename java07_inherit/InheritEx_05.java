package java07_inherit;

class Parent5{
	
	public void display() {
		System.out.println("부모 메소드");
		
	}
}

//final class Child5 extends Parent5{ // 상속을 줄 수 없는 클래스
	 class Child5 extends Parent5{

	@Override
	// final 수식 키워드 ,  더이상 변경할 수 없다 , 메소드에 넣으면 더이상 오버라이드 할 수 없다 ,오버라이딩 불가
	public final void display() {
		System.out.println("자식 클래스 오버라이딩");
	}
}

class GrandChild extends Child5{
	
//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	}
}


public class InheritEx_05 {
	public static void main(String[] args) {
	
		
		GrandChild gc = new GrandChild(); 
		gc.display();
		
		
		
		
	}
}
