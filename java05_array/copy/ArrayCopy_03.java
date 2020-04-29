package java05_array.copy;

public class ArrayCopy_03 {

	public static void main(String[] args) {
		
		//기본 데이터타입 변수 복사하기
		
		int num1 = 100;
		int num2;
		
		num2 = num1;
		
		//---------------------
		
		//배열 복사하기 (참조형 복사)
		
		int[] arr1 = {10,20,30};
		int[] arr2;
		
		// 깊은 복사, Deep Copy
		//	참조 대상의 내용물( 실 데이터, 저장된 데이터)를
		//	새로운 공간에 복사하는 것
		
		// 1. 복사될 공간 확보(생성)
		arr2 = new int[arr1.length];
		
		// 2. 데이터 복사 (System클래스의 API기능(메소드)이용)
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		// src		: Source(출발지 , 원본) ,원본 배열
		// srcPos	: Source Position, 원본 배열에서 복사 시작할 인덱스
		// dest		: Destination(목적지) (사본이 될 곳), 사본 배열
		// destPos	: Destination Position , 사본 배열에서 복사 시작할 인덱스
		// length	: 복사하는 데이터의 길이
		
		System.arraycopy(arr1, 0,arr2, 0, arr1.length);
		
		
		
		System.out.println("--- 데이터 수정 전 ---");
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i]+":"+arr2[i]);
		}
		
		arr1[1] = 777;
		arr2[2] = 999;
		System.out.println("\n--- 데이터 수정 후 ---");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+":"+arr2[i]); 
		}
		
		
	}
	
	
}
