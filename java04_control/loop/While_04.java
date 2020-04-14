package java04_control.loop;

public class While_04 {
	public static void main(String[] args) {
		
		
		
		// continue , break
		// 기타 제어문
		
		int i = 0; // 초기식
		while ( i<100) {//조건식
			i++;//증감식
			
			if( i%2==0) {// 짝수일때만 참
				continue; // 현재 반복을 중단하고 다음 반복 진행 , while문 조건을 검사하러 감 // 참일경우 밑을 수행하지 않고 조건식으로 올라감
			}
			
			
			
			if( i>10) {
				break; //반복문 중단 코드
	
			}
			
			
			
			
			System.out.println(i); // 반복코드
			
			
		}
		
		System.out.println("---------------------");
		
		
		for( int j= 0; j<100; j++) {
			
			
			if(j%2==0) {//짝수
				continue;// 현재 반복을 멈추고 다음 반복 진행 ,, // 증감식으로 올라감
			}	
			if ( j>10) {
				break;
				
			}
			System.out.println(j);
			}
			
		}
		
	}

