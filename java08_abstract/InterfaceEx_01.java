package java08_abstract.interfaceEx;

abstract class TestClass{
	public abstract void method();
	
	
}

interface TestInterface{   // 상수 추상메소드를 가짐
	
	public static final int num = 100 ;  // public static final을 써줘야 좋음
	// public static final 는 인터페이스클래스가 만들어지면 보이지 않아도
	// 만들어짐 ,명시하지 않아도 전부 적용되어 있을경우 정적상수가 됨
	
	int MAX = 2000;
	static int S = 400;
	final int F = 500;
	
	
	// abstract 키워드가 없어도 추상메소드로 만들어짐
	public void display();
		
	public abstract void out(); // 추천 써줘야 추상메소드인걸 확실히 인지.
	
}

class Test extends TestClass implements TestInterface{ // 클래스가 아니므로 implements를 사용
	
	int t = MAX; // 상속 받았으므로 사용가능

	
	@Override
	public void method() {
		
	}

	@Override
	public void display() {
		
	}

	@Override
	public void out() {
		
	}
}



public class InterfaceEx_01 {
	public static void main(String[] args) {
		
		
	}
}
