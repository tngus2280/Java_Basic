package java05_array;

public class Array_01 {
	public static void main(String[] args) {
		
		
		// 배열 , array
		//	변수들의 묶음, 변수들의 나열
		
		
		int num;// int형 변수 선언
		num = 123; // 변수에 값 대입
		
		
		// ---------------------------
		
		
		int[] arr; // int형으로 이루어진 배열 저장할수 있는 변수 선언
		
		arr = new int[5]; //int형 배열 생성 (5개의 int형 공간 , 배열생성)
		
		// 배열 생성 시 변수공간 묶음(배열)이 만들어진다
		// 배열을 생성하면서 변수공간의 개수를 정한다
		
		//---------------------
		
		//배열의 저장공간에 값 대입
		
		arr[0] = 10; //구성요소 , Element
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//arr[5] = 60; 
		// arr 배열의 인덱스의 범위인 0~4 를 벗어난 5번째 공간에 
		// 대입하려고 시도해서 예외가 발생함
		
		
		// 배열 전체 대입
		for(int i = 0; i<5 ; i++) {
			arr[i] = (i+1)*100;
		}
		
		
		
		// 배열 전체 출력
		for(int i= 0; i<5; i++) { // i / 0~4 , x5
			System.out.println(arr[i]);
		}
		
		
		System.out.println("--------------------");
		
		// 배열의 이름은 메모리에 배열이 생성된 위치(주소, 참조)를 나타냄
		// > 참조값, Reference
		
		
		System.out.println(arr); // [I@2a139a55
		
									// [I = 데이터 타입 @ At  메모리 주소값: 2a139a55
		
		
	}

}
