package java04_control.star;

public class Star_03 {
	public static void main(String[] args) {
		
		//Q3
		// *****
		
		//반복횟수: 5
		//반복구간: 0~4
				
				
		// 초기식: 		int i = 0;				(반복구간의 시작값)
		// 조건식: 	    i<5;  		더한값? 			(반복구간의 끝값, 반복횟수)
		// 증감식: 		i++						(1씩 증가)	
			
		
		for(int i =0; i<5; i++) { // i , 0~4 ,x5 
			
			// 한줄을 출력하는 코드
			// *****
			for(int j=0; j<5; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
