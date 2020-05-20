package java06_class.method.quiz;

import java.util.Scanner;

// 실행클래스
public class MethodQuizEx {
	public static void main(String[] args) {
		
		// 0. 메소드의 기본형태 작성
		// 1. 메소드 이름 -> 만들고자 하는 기능을 대표하는 이름으로 적절히
		// 2. 매개변수 작성 -> 기능을 수행하는 데 필요한 입력 값을 저장하는 변수
		// 3. 실행코드 작성 -> 메소드가 수행할 기능을 작성, 구현
		// 4. return코드 작성 -> 수행 결과로 사용할 반환 값 작성
		// 5. return 데이터타입 작성 -> return 코드 값의 데이터 타입을 명시
		MethodQuiz mq = new MethodQuiz();
//		q1
		mq.num();
//		
//		
//		
		System.out.println("----------------------");	
		Scanner sc = new Scanner(System.in);
//		
		//q2
		System.out.println("Input Number:");
		int n1 = sc.nextInt();
		mq.hello(n1);
//		
		System.out.println("---------------------------");
		//q3
		int n2 =sc.nextInt();
		System.out.println("Input Number:");
		sc.nextLine();
		System.out.print("Input Text:");
//		
		
//		String str = sc.nextLine();
//		
//		
//		mq.text(n2,str);
//		
		System.out.println("----------------------");
		//q4 ,1
		
		int[] arr= {11, 22, 33, 44, 55};
		 
		mq.print(arr);
		

		//q4, 2
		
		mq.mul10(arr);
		mq.print(arr);
		
		
		//q4, 3
		
		int[] res = mq.mul10v2(arr);
		System.out.println("원본");
		mq.print(arr); // 원본
		System.out.println("10배한 결과");
		mq.print(res); // 반환된 새로운 배열, 실행 결과
			}
	
			
}	
		
		
		
		
	
	
