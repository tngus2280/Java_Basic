package java05_array.array2D;

public class Array2D_01 {
	public static void main(String[] args) {
		
		
		// 2차원 배열
		// 다차원 배열
		
		
		
		int[] arr; // 1차원 배열 선언 
		arr = new int[5]; //1차원 배열 생성
		
		// ----------------------------
		 
		int[][] arr2; // 2차원 배열 선언
		arr2 = new int[2][3]; // 2차원 배열 생성
		// 2행 3열짜리 표가 만들어진다
		
		
		
		
		int[] arr3 = new int[6];
		// 1행 6열짜리 표
		
		// 프로그램에서 다루는 데이터에 따라 적절한 크기를 선택한다
		// int[6] > 단순히 숫자 6개
		// int[2][3] > 숫자 3개씩 2묶음
		// ex) 학생 2명의 3과목 점수
		
		// -----------------------
		arr2[1][2] = 555;
		System.out.println(arr2[1][2]);
		
		
		
		// -----------------------
		// ---- 배열의 선언 ----
		int[] arr4;// 추천
		int arr5[];
		
		
		int [][] arr6;// 추천
		int[] arr7[];
		int arr8[][];
		//---------------------
		
	}
}
