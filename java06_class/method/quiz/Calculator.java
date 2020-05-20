package java06_class.method.quiz;

public class Calculator {
	// 기능 : 사칙연산 계산기
		//	- 메소드 4개
		//	sum, sub, mul, div
		//- 매개변수 : 정수 2개
		//- return : 정수 (단, div는 double)
		
		public int sum(int n1 , int n2){
			int result = n1 + n2;
			
			return result;
			
			//return n1+n2;
		}
		public int sub(int n1, int n2){
			int result = n1 - n2; 
			
			return result;
			
		}
		public int mul(int n1 ,int n2){
			int result = n1 * n2;
			
			return result;
		}
		public double div(double n1, double n2){
			double result = n1/ (double)n2;
			
			return result;
		}
		
		// 0. 메소드의 기본형태 작성
			// 1. 메소드 이름 -> 만들고자 하는 기능을 대표하는 이름으로 적절히
			// 2. 매개변수 작성 -> 기능을 수행하는 데 필요한 입력 값을 저장하는 변수
			// 3. 실행코드 작성 -> 메소드가 수행할 기능을 작성, 구현
			// 4. return코드 작성 -> 수행 결과로 사용할 반환 값 작성
			// 5. return 데이터타입 작성 -> return 코드 값의 데이터 타입을 명시

		

	}

	

