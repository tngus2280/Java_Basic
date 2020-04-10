package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		
		//1부터 10까지 총합 구하기
		// > 55
		
		
		int sum = 0; //총합을 구할 땐 쓰레기 값을 조심할 것!
		for( int i=0;  i<=10 ; i++) {// i , 1~10 , x10
			sum +=  i;
		}	
		System.out.println("1~10까지의 합계:"+sum);
		
		//반복횟수: 10
		//반복구간: 1~10
		
		
		// 초기식: 		int i = 1;				(반복구간의 시작값)
		// 조건식: 	    i<=10;  		더한값? 			(반복구간의 끝값, 반복횟수)
		// 증감식: 		i++						(1씩 증가)	
		
	}
}
