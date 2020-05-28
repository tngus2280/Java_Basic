package java07_inherit;

class Parent4{
	protected int num; //멤버 필드
	
	public Parent4() { // 생성자는 주로 멤버 필드를 초기화
		System.out.println("부모 디폴트 생성자");
		
	}
	public Parent4(int num) {
		this.num = num;
		System.out.println("부모 매개변수있는 생성자");
	}
	
}

class Child4 extends Parent4{
	// 멤버 필드 없음, 부모의것을 그대로 가져옴
	
	public Child4() {
//		super(); // 슈퍼 생성자 , 생략되어있음	
//		this(999);
		
		System.out.println("자식 디폴트 생성자");
		
	}
	
	
	public Child4(int num) {
//		super(); // 슈퍼 생성자 , 생략되어있음
		super(num);
		
//		this.num = num;
		// Child4 내에 num변수가 없어서 super영역에서 찾음
		
//		super.num = num;
		//직접 부모클래스로부터 상속받은 영역을 찾음
		
		
		
		
		System.out.println("자식 매개변수 생성자");
	}
	
	
}






public class InheritEx_04 {
	public static void main(String[] args) {
		
		Parent4 p = new Parent4();
		System.out.println("----------");
		
				
		Child4 c = new Child4();
		System.out.println("----------");
		
		Parent4 p2 = new Parent4(123);
		
		System.out.println("----------");
		
		
		Child4 c2 = new Child4(555);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
