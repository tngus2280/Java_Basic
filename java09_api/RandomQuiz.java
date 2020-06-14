package java09_api;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {


		//가위바위보 게임 만들기

		//int user: 사용자 입력(1~3) 스캐너
		//int com: 컴퓨터 랜덤(1~3)

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int user;
		int com;
	do {
			
			// 1: 가위 , 2: 바위 , 3: 보
			
			// 1. 랜덤을 이용하여 com에 값 저장
			// com 값을 출력
			

			// 2. user에 입력받기


			System.out.println("가위바위보 게임");
			System.out.println("무엇을 내겠습니까? ");
			 user = sc.nextInt();
			 com = (int) (Math.random()*3)+1;
			System.out.println("컴퓨터:"+com);
			System.out.println("---------");
			// 3. com , user 비교 (가위바위보 승부)
			// 4. 결과 출력 (승자)
			// 위에서 같이 하고있음
			if(user-com ==0 ) {
				System.out.println("비겼습니다");
			}
			if(user-com ==1) {
				System.out.println("user이 이겼습니다");
			}
			if(user-com ==2) {
				System.out.println("com이 이겼습니다");
			}
			if(user-com ==-1) {
				System.out.println("com이 이겼습니다");
			}
			if(user-com ==-2) {
				System.out.println("user");
			}
		
			if(user==0) return ;
			
	}while(user<1|| user>3);
		// 5. 1~ 4 반복


	}	


}
