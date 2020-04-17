package java04_control.star;

public class Star_04 {
	public static void main(String[] args) {
		
		//Q4
		// 11111
		// 22222
		// 33333
		//반복횟수: 5
		//반복구간: 0~4
				
				
		// 초기식: 		int i = 0;				(반복구간의 시작값)
		// 조건식: 	    i<5;  		더한값? 			(반복구간의 끝값, 반복횟수)
		// 증감식: 		i++						(1씩 증가)	
			
		
		for(int i =0; i<5; i++) { // i , 0~4 ,x5 
			for(int j =0; j<5; j++) {
			System.out.print(i+1);
		}
			System.out.println();
		}
		
		
	}
}
