package java06_class.field;
//정적변수
public class MemberField_02 {

	public static String city = "Seoul";
	// static  = 고정된 , 클래스 변수 , 정적 변수 , static 변수 , static이 없으면 인스턴스 변수
	// public String city = "Seoul";

	//	private static String city = "Seoul";
			// (      )=MemberField_02.city
	
	//정적 메소드 , static 메소드 , 객체 생성없이도 정적인 시점에 준비를 한다
	public static String getCity() { // static이 없을때는 객체 생성을 해야만 사용할 수 있다 
		return city;
		
	}
	
	
	//------------------------------------
	
	// 정적메소드에서 인스턴스 변수 사용 불가
	private int num; //인스턴스 변수
	public static void test() {// 정적 메소드
//		System.out.println(num);
	}
	
	
	//-------------------------------------------
	
	private static int num2; //정적 변수
	
	public void test2() {
		System.out.println(num2);
	}
	
	
}
