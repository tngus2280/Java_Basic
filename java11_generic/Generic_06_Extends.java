package java11_generic;

public class Generic_06_Extends {
	public static void main(String[] args) {
		
		print(123);
		print(23.423);
		
//		print("Apple");
	}
	
	public static<T extends Number> void print(T t) { // number 클래스만 허용하는 타입파라미터 T
		System.out.println(t);
	}
	
	
	
}
