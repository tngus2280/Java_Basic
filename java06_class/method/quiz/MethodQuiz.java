package java06_class.method.quiz;

import java.util.Arrays;

// 기능 클래스
public class MethodQuiz {
	
	//q1  
	public void num() {
		for(int i= 1; i<=100; i++) {
			System.out.print(i+ " ");
		}
		}
	//q2
	public void hello(int n1) {
		for(int i=1; i<n1;i++) {
			System.out.println("Hello");
		}
	}
	//q3
	public void text(int n2 ,String str) {
		for(int i = 0 ; i<n2+1;i++) {
			System.out.println(str);
		}
	}
	//q4 ,1 배열의 모든 요소 출력 (메소드명 print)
		public void print(int[] arr) {
			System.out.println(Arrays.toString(arr));
		}
	//q4 , 2 배열의 모든 요소에 10배
		public void mul10(int[] arr) {
			for(int i =0 ; i<arr.length;i++) {
				arr[i] = arr[i]*10;
			}
		}
				
	//q4 , 3			
		public int[] mul10v2(int[] arr) {
			
			int[] result = new int[arr.length];
				
			for(int i= 0; i<arr.length;i++) {
				result[i] =arr[i] *10;
			}
		
			
			return result; // 메소드 호출한 위치로 코드 결과 값 반환
			}
		}
			
			
		
	
	

