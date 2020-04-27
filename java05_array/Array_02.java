package java05_array;

public class Array_02 {
	public static void main(String[] args) {
		
		
		int num = 100; // 변수의 선언과 동시에 초기화
		
		
		int[] arr = { 10, 20 , 30, 40, 50 }; // 배열의 선언과 동시에 초기화
		
//		int[] arr; // 배열 선언
//		
//		arr = new int[5]; // 배열 생성
//		
//		arr[0] = 10;	// 값 대입
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		//배열의 모든 요소(element) 출력하기
		
		// i, 0~ 4 , x5
		
		for(int i=0; i<5 ; i++) {
			System.out.println(arr[i]);
		}
		
		// ------------------------------------------
		
		
		double[] dArr = new double[10];
		
		
		
		double[] dArr2 = {1.1 ,2.2 , 3.3 , 4.4};// 0~3 , x4
		
		boolean[] bArr = {true, false}; // 0~1 , x2
		
		char[] chArr= {'A','B'};
		
		
		
		
	}
}
