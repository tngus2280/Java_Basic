package java04_control.star;

public class Star_08 {
	public static void main(String[] args) {
		
		//Q8
		// *
		// *
		// *
		//반복횟수: 5
		//반복구간: 0~4
				
				
		// 초기식: 		int i = 0;				(반복구간의 시작값)
		// 조건식: 	    i<5;  		더한값? 			(반복구간의 끝값, 반복횟수)
		// 증감식: 		i++						(1씩 증가)	
			
		
		for(int i =5; i>=1; i--) { // i , 5~1 ,x5 
			for(int j= i; j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
		
	}

