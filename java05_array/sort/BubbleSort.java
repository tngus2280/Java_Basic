package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = {3, 2, 5, 4, 1};
		
		
		// ------- 원본 출력 ----------
		System.out.println(" --- 정렬 전 ---");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		// -----------------------------
		
		// ----- 버블 정렬 수행 -----
		
		
		 //스왑 변수 생성
		// round 반복
		for( int j= 0; j<arr.length-1; j++) { // round 횟수i = 배열의 길이 -1 
			for( int i = 0; i<arr.length-1; i++) {  // 스왑 횟수 j 
				if(arr[i]>arr[i+1]) { // 오름차순정렬
//				if(arr[i]>arr[i+1]) { // 내림차순정렬
					
					//스왑
					int tmp = arr[i+1];
					arr[i+1]= arr[i];
					arr[i]= tmp;
				
			}
			}
		}
					
//		for( int i= 0; i<arr.length-1; i++);{
//		if(arr[i+1]>arr[i+1]){
		// 스왑
//		int tmp =arr[i+1];
//		arr[i+1] = arr[i];
//		arr[i] = tmp;
//		
		
		
		
		// --------------------------
		// ------- 결과 출력 --------
		
		
		System.out.println("---- 정렬 후 ----");
		for( int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		// -----------------------------------
		
	}
	
	}

