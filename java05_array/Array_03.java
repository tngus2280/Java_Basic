package java05_array;

public class Array_03 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//배열의 요소의 개수:5개
		// =
		// 배열의 길이 , 크기: 5개
		
		System.out.println("배열의 길이:"+ arr.length);
		
		System.out.println("----------------------------------");
		
		//배열의 길이(arr.length)를 이용한 배열 전체 출력
		
		for(int i=0; i<arr.length;i++)  { //i, 0~arr.length-1 , arr.length번
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------------------------");
		
		// arr의 인덱스 범위: 0~4
//		arr[5] = 99; //ArratIndexOutOBoundsException
		
	//	arr[-4] = 10;	//ArratIndexOutOBoundsException
	
		
		//ArratIndexOutOBoundsException
		// arr.length 보다 크거나 같은 인덱스에 접근했을 때 발생
		// 0번째 인덱스보다 작은 인덱스에 접근했을 때 발생(음수)
		
		
		System.out.println("----------------------------------");
		
		
//		int[] arr2; //배열 선언
		
//		arr2 = new int[-5];
		
		//NehativeArraySizeException
		// 배열을 생성할 때 크기를 음수로 지정하면 발생하는 예외
		
		
		
	}
}
