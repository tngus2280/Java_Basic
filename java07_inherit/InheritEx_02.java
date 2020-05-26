package java07_inherit;

class Parent2 {
	
	public int num;  // private int num;  상속관계는 자식이 부모의 것을 빌려와서 쓰는것. 그렇기 때문에 private 쓰면 not visible.
	
	public void display() {
		System.out.println("부모 메소드");
	}
	
	
}



class Child2 extends Parent2{
	private int num;  
	
	
	@Override
	public void display() {
		num = 100;
		
		
		System.out.println("오버라이딩 메소드");
		
	}
	
	
	
	
}







public class InheritEx_02 {
	public static void main(String[] args) {
		
		
		Child2 c = new Child2();
		
//		c.num = 123;
		c.display();
		
		
		System.out.println("-------------------");
		
		
		Parent2 p = new Parent2();
		
		p.num = 333;
		p.display();
		
		
		System.out.println("-------------------");
		
		Parent2 pc = new Child2(); // Parent2 <- Child2 부모 타입에 자식타입을 대입 , 형변환 비슷하게  , 무조건 부모클래스가 자식 클래스를 품어준다 받아준다
		
//		Child2 cp = (Child2) new Parent2();  // Child2 <- Parent2
		// ClassCastException 발생 
		
		pc.display(); // Child2 의 메소드 호출 // 메소드 일때만 동적바인딩
		
		pc.num =222; // Parent2 의 변수 사용 // 멤버 필드일때는 정적 바인딩
		
		
		
		
		
	}
}
