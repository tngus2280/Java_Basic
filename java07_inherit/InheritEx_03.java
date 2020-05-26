package java07_inherit;

class Parent3{
	public int num =111;
	
	public Parent3() { // 생성자
		System.out.println("부모 디폴트 생성자");
		
		//this: 자기 참조 객체
		
		System.out.println(this.num);
		
	}
}

class Child3 extends Parent3{
	private int num = 222;
	
	public Child3() {
		System.out.println("자식 디폴트 생성자");
		
		System.out.println("this.num:"+this.num); //자신 객체
		System.out.println("super.num:"+super.num); //부모 객체
		
		
		
	}
}


public class InheritEx_03 {
	public static void main(String[] args) {
		
		
		Parent3 p = new Parent3();
		
		System.out.println("--------------------");
		
		Child3 c = new Child3();
		
		
		
		
	}
}
