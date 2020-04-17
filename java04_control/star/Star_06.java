package java04_control.star;

public class Star_06 {
	public static void main(String[] args) {
		
		//Q6
		// 12345
		// 23456
		// 34567
		//반복횟수: 5
		//반복구간: 0~4
				
				
		// 초기식: 		int i = 0;				(반복구간의 시작값)
		// 조건식: 	    i<5;  		더한값? 			(반복구간의 끝값, 반복횟수)
		// 증감식: 		i++						(1씩 증가)	
			
		
		for(int i =0; i<5; i++) { // i , 0~4 ,x5 
			for(int j=i+1;j<= i+5; j++) {
				
				//반복횟수: 5번
				//반복구간 : 1~5 ,2~6 3~7, 4~8 ,5~9
				//반복구간 : (i+1) ~ (i+5)
				// 초기식 : int j=i+1
				// 조건식 : j<= i+5
				// 증감식 : j++
				
			System.out.print(j);
		}
			System.out.println();
		}
	}
}
