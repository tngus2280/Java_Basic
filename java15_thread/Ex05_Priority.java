package java15_thread;

public class Ex05_Priority extends Thread{ // priority ==우선순위.
	 
	private int idx;// 스레드 인덱스
	
	public Ex05_Priority(int idx) { //생성자
		this.idx = idx;
	
	}
	
		@Override
		public void run() {
			System.out.println(idx+" 스레드 시작");
			
			for(int i=0; i<1000;i++) {
				System.out.print(idx);
			}
			
			System.out.println(idx+" 스레드 끝");
			
		}
	

	
	
	public static void main(String[] args) {
		
		System.out.println("Main 스레드 시작");
		
		Ex05_Priority t1= new Ex05_Priority(1);
		Ex05_Priority t2= new Ex05_Priority(2);
		Ex05_Priority t3= new Ex05_Priority(3);
		
		//우선 순위 적용
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); // 10 좀더 많다
		
		//스레드 활성화
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 스레드 끝");
	}
	
	
	
	//Thread Scheduling, 스레드 스케줄링
	//	Round Robin, 순환 할당 : time slice만큼 번갈아가면서 실행한다 
	//	time slice , 시간 조각 : 
	// cpu가 수행할수 있는 코드의 수
	
	//	Priority , 우선 순위   : 우선순위가 높은 스레드를 좀 더 많이 실행한다
	
	// 	자바는 Round Robin , Priority 두 알고리즘을 적용하여 스레드 스케줄링을 수행한다
	
	
}


