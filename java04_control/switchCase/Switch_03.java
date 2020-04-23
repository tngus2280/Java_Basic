package java04_control.switchCase;

public class Switch_03 {
	public static void main(String[] args) {
		
		
		
		// switch의 비교대상으로는 정수로 표현되는 값이어야한다
		
		// --------------------------
		
		//switch에 double형 사용할 수 없다.
		
//		double d = 3.14;
//		switch ( d ){
//		case 3.14:
//			break;
//		}
		
		// --------------------------
		
		//switch에 boolean형 사용할 수 없다.
		
//		boolean b =true;
//		
//		switch (b) {
//		case true:
//			break;
//		}
		
		// --------------------------
		
		char alpha ='B';
		
		switch (alpha) {
		case 'A':
			System.out.println("A입니다");
			break;
		
		case 66: // 'B'
			System.out.println("B입니다");
			break;
			
		case 'C':
			System.out.println("C입니다");
			break;
			
		default:
			System.out.println("A, B, C 다 아님");
		}
		
		
		
	}
}
