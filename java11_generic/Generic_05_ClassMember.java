package java11_generic;

//
class Data<K>{
	K data;
}

//멤버 필드로 제네릭 클래스를 가지기
class Class05<T>{
	Data d1; // <K> -> <Object>
	
	Data<String> d2; // <K> -> <String>
	
	Data<T> d3; // k -> T
	
	
}






public class Generic_05_ClassMember {
	public static void main(String[] args) {
		
		// T -> Integer
		Class05<Integer> c05 = new Class05<>();
	
		// K -> T -> Integer
		c05.d3.data = 100; // NullPointerException
		
		//--------------------
		
		c05.d1 = new Data<>(); // Data<K> -> Data <Object> 
		
		c05.d2 = new Data<>(); // Data<K> -> Data <String> 
		
		c05.d3 = new Data<>(); // Data<K> -> Data <T> -> Data<Integer>
		
		
		
		
	}
}


