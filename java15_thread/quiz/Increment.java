package java15_thread.quiz;

public class Increment implements Runnable{
	private int n1; //스레드의 인덱스
	
	public Increment(int n1) {
		this.n1 = n1;
	}
	
	@Override
	public void run() {
		
	
			
			try {
				for(int i =0;i<=n1;i+=2) {
					System.out.println("inc :"+i);
					
					Thread.sleep(50);
					
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
//	public void run() {
//	
//		while(start<end) {
//			System.out.println("Increment:" (start=+2));
//		}
	
	
	
	
	
}
	
//	+ 스레드 테스트 퀴즈
//
//	 - 실행용 클래스
//		java15_thread.quiz.TestThread.java
//
//	 - Thread 클래스
//		java15_thread.quiz.Increment.java
//		java15_thread.quiz.Decrement.java
//
//		1. 두 클래스 모두 Runnable 인터페이스 상속받음
//
//		2. Increment 클래스는 생성시, 정수를 하나 초기값으로 전달받음
//		  Increment inc = new Increment(50);
//			>> 1부터 50 될 때까지 정수를 2씩 증가시키는 내용 반복함
//			>> 숫자 하나 출력후 0.05초 멈춰있게함
//
//		3. Decrement 클래스 생성시, 정수를 두 개를 초기값으로 전달받음
//		  Decrement dec = new Decrement(12, 45);
//			>> 45부터 12될 때까지 1씩 감소시키는 내용 반복함
//			>> 숫자 하나 출력후 0.1초 멈춰 있게함.
//
//		4. 실행용 클래스에서 두 클래스를 멀티스래딩함.

