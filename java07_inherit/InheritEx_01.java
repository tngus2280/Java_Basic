package java07_inherit;

class Parent{
	String name;// 멤버 필드
	int num;

	public void display(){ // 멤버 메소드
		System.out.println("부모 클래스의 메소드");
		}
	}


class Child extends Parent{ // 자기 꺼랑 부모꺼랑 사용
	int score; //멤버 필드
	
	public void print() { // 멤버 메소드
		System.out.println("자식 클래스의 메소드");
	}
	
	public void display() { // 덮어 씌우기  , 추가적인 자기만의 코드를 작성할 수 있다
		System.out.println("메소드 재정의 , 오버 라이딩");
	}
	
}


public class InheritEx_01 {
	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		
		p.name = "Alice";
		p.num = 123;
		
		p.display();
		
		
		System.out.println("-----------------------");
		
		Child c = new Child();
		
		c.name ="bob";
		c.num = 444;
		c.score = 5555;
		
		c.display();
		c.print();
		
	}
}
