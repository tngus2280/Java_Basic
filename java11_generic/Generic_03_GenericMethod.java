package java11_generic;

//일반 클래스
class Class03{
	
	//일반메소드
	public void display(int n) {}
	
	//제네릭메소드
	public <T> T print(T t) { // 반환타입 , 매개변수 , 지역변수에서 사용가능
		T data = null; // 형변환에도 사용할 수 있다
		// 123을 넣었을때는 123은 기본데이터타입 int형 타입이 때문에 형변환이 되지 않는다
		return data;

	
	}
	
}

//제네릭 클래스

class Class03_2<T>{
	
	//제네릭 메소드 ,  잘 쓰진 않는다 문법적으로 가능하다 제네릭 클래스안에 제네릭 메소드
	public <K> void display(K obj , T data) {	}
	
}




public class Generic_03_GenericMethod { //메소드 내에서만 제네릭 적용
	public static void main(String[] args) {
		
		Class03 c03 = new Class03();
		
		//---------------------------
		
		c03.print(123); // 타입파라미터 전달하지 않음, T -> Integer
		//매개변수를 전달해줄때 자동으로 적용해준다 T 는 integer를 쓰게된다
		
//		c03.<Double>print(555); // T -> Double
		c03.<Double>print(12.34); // T-> Double 타입을 형변환 해준것.
		
		
		//---------------------------
		
		
	}
}
