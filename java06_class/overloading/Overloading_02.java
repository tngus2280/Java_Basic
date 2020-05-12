package java06_class.overloading;

public class Overloading_02 {

	// int 형 전달인자의 문자수(길이)를 구해서 반환
	// 111222333 > 9
	
	//    int = 반환값.
	public int  getLength(int num) {
		
		// int -> String 형변환
		String str = String.valueOf(num);
		
		// 변환된 문자열의 길이 리턴
		int len = str.length();
		
		
		
		
		return len;
	}
	public int getLength(boolean bl) {
		String str = String.valueOf(bl); // boolean -> String 형변환
		int len = str.length(); // 변환된 문자열의 길이 리턴
		return len;
	}
	 
		
		
	public int getLength(double d) {
//		String str = String.valueOf(d);
//		int len = str.length();
//		return len;
		
		return String.valueOf(d).length();
		// 리턴 , 문자열. d의 값 . 길이
	}
	
	
	
}
