package java09_api;

public class MathEx {
	public static void main(String[] args) {
		
		// 원주율 출력
		System.out.printf("원주율 값 %.2f " , Math.PI);
		// -10의 절대값
		System.out.println("\n-10의 절대값: "+Math.abs(-10));
		// 3.7의 올림값
		System.out.println("3.7의 올림값: "+Math.ceil(3.7));
		// 3.7의 내림값
		System.out.println("3.7의 내림값: "+Math.floor(3.7));
		// -3.7의 반올림값
		System.out.println("3.7의 반올림값: "+Math.round(-3.7));
		// 2.1의 3제곱값
		System.out.printf("2.1의 3제곱 값: %.2f ",Math.pow(2.1, 3));
		
		
		System.out.println("----------------------------------");
		
		System.out.println(Math.max(3.14, 3.141592));
		
		System.out.println(Math.min(7, 3));
		
		int n1 = 11;
		int n2 = 19;
		
		for(int i = Math.min(n1, n2); i<Math.max(n1,n2);i++) {
			
		}
		
		System.out.println("------------------");
		
		
		// Math.random()
		// 0.0(포함)~ 1.0(제외)~ double형 랜덤 숫자 생성
		
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		System.out.println("-------------------------------");
		
		System.out.println((int) (Math.random()*5)); // 0~2
		
		
		System.out.println((int) (Math.random()*5)+20); // 
		
		System.out.println((int) (Math.random()*5)+1); // 


		System.out.println((int) (Math.random()*3)+1); // 1~ 3
		// 1: 가위 , 2: 바위 3: 보
		
		System.out.println("-------------------------------");

	
	
	
	}
}
