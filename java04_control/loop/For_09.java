package java04_control.loop;

public class For_09 {
	public static void main(String[] args) {
		
		//for 중첩
		
		for(int i=0; i<3; i++) { // i , 0~2 ,x3
			
			for (int j=0; j<3; j++) {
				System.out.println("i:+"+i+",j:"+j);
			}
			
			System.out.println("----------------");
			
			
			//반복문 중첩 시 고려사항
			// 바깥쪽 Loop의 반복자(변수)의 진행에 맞춰서
			// 안쪽 Loop의 반복자(변수)가 진행되는 과정을 생각해야한다
			
			// 바깥쪽, 안쪽 두 반복문이 받는 영향을 고려해야한다.
			
			
		}
		
	}
}
