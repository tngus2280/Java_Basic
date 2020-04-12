package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		
		//중첩 for Loop
		// 2~9단 구구단 
		
		//반복횟수: 8번
		//반복구간 : 2~9
		
		 for( int j=2 ;j<=9;j++ ) {
			for( int i=1; i<=9; i++ ) { // i , 1~9 , x9
			
			System.out.println(j+ "x"+i+ "="+ j*i );		
			
			
			// j=2 i=1 
			// syso( 2  x 1 = 2*1)출력값
			// j=2 i=2 
			// syso ( 2 x 2 = 2*2)
			// j=2 i=3
			// syso ( 2 x 3 = 2*3)
			// i문1~  9 까지 하고서 j문 다시 반복 , 반복할땐 초기화
			
			
			}
			System.out.println("---------------");
		
		}
		
		
		
	}

}
