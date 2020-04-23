package java04_control.switchCase;

public class Switch_01 {
	public static void main(String[] args) {
		
		// switch문
		// 	선택문
		//	switch-case문
		
//		switch(비교대상) { // 비교대상은 변수를 이용한다.
//		case 값1:
//		case 값2:
//		case 값3:
//		case 값4:
		
//		case 값n:
//		default:
//	}
		
		
//		}
		
		//----------------
		
		int num = 10;
		switch ( num ) {
		case 10:
			System.out.println("num은 10입니다");
			break;
			
		case 20:
			System.out.println("num은 20입니다");
			break;
			
		case 30:
			System.out.println("num은 30입니다");
			break;

		default:
			System.out.println("디폴트: 10, 20 , 30 다 아닙니다");
		}
		
		// 값을 찾아가고 그 값 밑으로는 다 실행함
		
		// 비교대상에 저장된 값과 case에 지정된 값이 같으면
		// 해당 case 구문 위치부터 아래쪽 코드 전부를 실행한다
		
//		/case에 지정한 값이 없으면 default로 간다
		// default는 case들 중에서 가장 마지막에 작성한다
		
		
		// case마다 break; 를 적어서 해당 case부분만 실행되도록 만든다
		
		// default 생략 가능
		
		
	}
}
