package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		
		//2단 구구단
		
		//반복횟수: 9
				//반복구간: 1~9

		// 초기식: 		int i = 1;	(반복구간의 시작값)
		// 조건식: 	    i<=9; 		(반복구간의 끝값, 반복횟수)
		// 증감식: 		i++				(1씩 증가)	
		
		
		int i= 1;
		while(i<=9) {
			System.out.println("2x"+i+"="+(2*i));
			
			
			
			i++;
		}
	
	}
}
