package java12_exception;

public class Exception_06_throw { //예외를 직접 처리할때 
	public static void main(String[] args) {
		
		//컴파일러가 자동으로 쓰로우 할수 없을때 사용
		
		
		Exception e= new NullPointerException(); // 예외 객체 생성
//		NullPointerException e= new NullPointerException(); // 예외 객체 생성
		//데이터 타입을  확인하고 
		try {
			throw e;
		}catch (Exception e1) { //위의 Exception e 와 충돌로인해 e1이라고 바꿔준다
			e1.printStackTrace();
		}
		 
		
		//-------------------------------
//		throw new NullPointerException();
		
		
	}
}


