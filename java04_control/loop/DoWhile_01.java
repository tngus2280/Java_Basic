package java04_control.loop;

public class DoWhile_01 {
	public static void main(String[] args) {
		
		
		// do-while loop
		
//		do {
			//반복 수행 코드 // 조건없이 일단 1번 실행을 하고 조건식에 따라서 실행을 한다
//		} while(조건식);
		
		
		do {
			System.out.println("실행될까?");
		}while(false);
		
		// 처음에 do키워드를 만난 후 조건검사 없이 반복코드를 수행한다
		// 그 이후에 조건 검사하고 반복 진행
		
		// 최초 1회를 무조건 실행하고 이후 반복을 수행하는 Loop
		
		// --------------------------------
		
//		do {
//			메뉴보여주기
//			
//			메뉴선택하기
//			
//			종료 메뉴를 선택하지 않으면 반복
//		}while(종료 메뉴를 고르지 않았을 때);
		
		//------------------------
		
		
		int i=0; //초기식
		while(i<5) {
			System.out.println(i);
			
			i++;
		}

		System.out.println("------------------");
		
		int j = 0;
		do { 
			System.out.println(j);
			
			j++;
		}while(j<5);
		
	}
}
