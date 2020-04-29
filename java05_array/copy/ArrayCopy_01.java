package java05_array.copy;

public class ArrayCopy_01 {

	public static void main(String[] args) {
		
		//기본 데이터타입 변수 복사하기
		
		int num1 = 100;
		int num2;
		
		num2 = num1;
		
		//---------------------
		
		//배열 복사하기 (참조형 복사)
		
		int[] arr1 = {10,20,30};
		int[] arr2;
		
		// 얕은 복사, Shallow Copy
		//	 참조 대상의 참조값(주소)만 복사 되는 현상
		//	 참조하고 있는 메모리 주소만 복사가 된다
		// 	 생성된 데이터 저장공간은 복사되지 않는다
		
		//	참조형 변수를 단순히 대입했을 때 발생한다
		
		arr2 = arr1; //복사 다른 공간에 저장되는게 아니라 arr1의 공간을 찾아간다 , 변수를 바꾸면 따라간다
		
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
