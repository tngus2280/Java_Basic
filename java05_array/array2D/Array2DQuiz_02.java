package java05_array.array2D;

public class Array2DQuiz_02 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int k= 1;
		
		for(int i =0 ; i<arr.length  ;  i++) {// 입력 변경
			
			for(int j=arr.length-1; j>=0;j--) {
				
				arr [i][j] = k++;
				
			}
		}
		for(int i=0; i<arr.length;i++) {// 출력고정
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
			
		
	}
	
}
