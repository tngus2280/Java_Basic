package java04_control.switchCase;

public class Switch_02 {
	public static void main(String[] args) {
		
		// 스위치는 비교대상으로 연산식을 넣을 수 있다. 하지만 거의 쓰지 않음
		
		
		
		int num =20;
		switch(num-5) { // 변수에 대한 연산식을 넣어도 됨 , 정수형 타입이어야함.
		case 10:
			
			System.out.println("1번 영역");
			break;
	
		case 15:
			System.out.println("2번 영역");
			break;
			
		case 20:	
			System.out.println("3번 영역");
			break;
		}

	}
}
