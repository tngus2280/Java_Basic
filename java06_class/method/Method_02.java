package java06_class.method;

public class Method_02 {

	//매개변수
	//반환데이터(return 코드)
	
	//매개변수 x, 리턴데이터 x
	public void method01() {
		System.out.println("Hello");
		
	}
	
		//매개변수 o , 리턴데이터x
		public void method02(int parameter) { //parameter = 매개변수
			System.out.println("전달된 값:"+parameter);
		}
	// 매개변수 - parameter
	// 전달인자, 전달인수 ,인자 , 인수 - argument
		
		
	//2개의 전달인자를 받아 출력하는 기능
		public void printNum2(int num1, int num2) {
			System.out.println("num1:"+num1+ ",num2:"+num2);
		}
	//--------------------------------------------------------	
		
	public int returnNum() {
		return 777;
	}
	//-------------------------------------------------------
		
	// 매개변수 o , 반환데이터 o
	public int add(int n1, int n2){
		return n1+n2;
	}
		
		
		
		
	}
		

