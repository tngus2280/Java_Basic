package java12_exception;

public class Exception_02_try {
	public static void main(String[] args) {
		
		int[] arr = new int[5]; //인덱스 : 0~4
		
		int i=0;
		
		try {
				while(true) { // 무한루프
				arr[i] = i+1; //배열에 값 대입
				System.out.println(arr[i]); // 배열의 요소 출력
				
				System.out.println("---"+ i + "번째 완료 ---");
					
					i++;
				}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("[SYSTEM] 인덱스는 "+arr.length+"보다 작아야 합니다");
			e.printStackTrace();// 예외의 정보를 출력한다
		}
		
		System.out.println(" + + + 프로그램 정상 종료 + + +");
		
		
		
		
	}
}
