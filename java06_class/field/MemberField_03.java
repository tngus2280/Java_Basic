package java06_class.field;
//지역변수
public class MemberField_03 {

	private int num = 777; //인스턴스 변수
	private static int num2 = 555; //클래스 변수 , 정적변수
	
	// 파란색 = 인스턴스 변수
	// 파란색기울인거 =  클래스의 멤버 
	//갈색 =지역변수
	
	
	
	public void method(int var) { // var , 매개변수 , 지역변수
		int num = 101;// 지역변수  , 메소드의    , 
		int num2 = 202; // 지역변수
		
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println(this.num); // 클래스로 만들어진 자기 자신, { 안을(지역) 벗어난 
//		System.out.println(this.num2); 
		System.out.println(MemberField_03.num2); // 클래스 변수는 클래스명으로 쓰기
		
	}
	
}
