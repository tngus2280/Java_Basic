package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		
		
		
		//구구단 2단을 출력
		
		// 출력예시)
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// 2 x 5 = 10
		// 2 x 6 = 12
		// 2 x 7 = 14
		// 2 x 8 = 16
		// 2 x 9 = 18
		
		
				//반복횟수: 9
				//반복구간: 1~9
				
				
				// 초기식: 		int i= 1		(반복구간의 시작값)
				// 조건식: 	    i<=9 	 		(반복구간의 끝값, 반복횟수)
				// 증감식: 		i++				(1씩 증가)	
		int num = 0;
		for( int i=1; i<=9; i++ ) { // i , 1~9 , x9
			num = 2*i;
			System.out.println("2 x "+i+"="+i*2 );		
			//for( int i=1; i<=9; i++ ) { // i , 1~9 , x9
			//System.out.println("2 x "+i+ "="+num );	
		}
		
		
		
	}
}
