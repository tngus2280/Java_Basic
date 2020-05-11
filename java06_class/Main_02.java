package java06_class;

//실행 클래스
public class Main_02 {
	public static void main(String[] args) {
		
		
		Class_02 cl = null; //객체 변수 선언
		cl = new Class_02(); //객체 생성, 인스턴스화
		
		System.out.println(cl.num4);  // public 
		System.out.println(cl.num3);  // protected
		System.out.println(cl.num2);  // default
//		System.out.println(cl.num1);  // private
		
	
	}

}
