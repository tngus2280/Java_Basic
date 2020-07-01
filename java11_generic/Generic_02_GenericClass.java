package java11_generic;

//class Class02{
//	private int data;
//	
//	public int display(int data) {
//		this.data = data;
//		return data;
//	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(int data) {
//		this.data = data;

//class Class02{
//	private double data;
//	
//	public double display(double data) {
//		this.data = data;
//		return data;
//	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(double data) {
//		this.data = data;
//	}


//}    데이터타입이 다르지만 멤버 필드와 메소드가 같은 두개의 클래스를 만들필요없이 제네릭 클래스를 만들어서 사용한다
// 제네릭 클래스 
class Class02<T> { // T 데이터 타입
	private T data;
	
	public T display(T data) {
		this.data = data;
		return data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}


public class Generic_02_GenericClass {
	public static void main(String[] args) {
		
		// 위에 만들어진 T 타입을 String타입으로
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		String fruit = c02.getData();
		
		System.out.println("과일: " + fruit);
		
		//-------------------
		
		// T-> Integer
		Class02<Integer> c02_1 = new Class02<>();
		
		
		
		
	}
}
