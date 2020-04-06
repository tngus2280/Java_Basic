package java04_control.loop;

import java.util.Scanner;
public class Dowhile_02 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int input; //사용자 입력값
		
		int sum = 0; // 총 합계
		
//		do {
//			System.out.print("input number(종료==0):");
//			input = sc.nextInt();
//			
//			sum += input;// 누적합계
//		}while( input !=0);
//		
//		
//		System.out.println("총 합계:"+sum);
		
		
		System.out.println("-----------");
		
		while(true) {//무한 Loop
			System.out.print("input number(종료==0):");
			input = sc.nextInt();
			
			sum += input;// 누적합계
			
			if(input ==0) {
				break;
			}
			
			
			
		}
		System.out.println("총 합계:"+sum);
		
	}
}
