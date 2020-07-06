package java12_exception;

class ThrowTest{
	
	public void print(String str, int cnt) {
		
		if( str==null) {//예외 상황
			throw new NullPointerException();//예외 발생시키기
		}
		
		for(int i =0; i<cnt; i++) {
			System.out.println(str);
		}
	}
	
	
}

public class Exception_07_throw {
	public static void main(String[] args) {
		
		ThrowTest tt = new ThrowTest();
		
//		tt.print("HI",3); // "HI"를 3번 출력
		try {
		tt.print(null,3); // "HI"를 3번 출력
		}catch (NullPointerException e) {
			System.out.println("[WARN] 문자열이 null로 입력됐습니다");
		}
	}
}
