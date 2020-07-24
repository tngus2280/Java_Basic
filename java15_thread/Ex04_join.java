package java15_thread;

import java.util.Random;

public class Ex04_join extends Thread{
	
	private int idx; //스레드의 인덱스
	
	public Ex04_join(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx+ "스레드 시작");
		
		Random ran = new Random();
		try {
			// 0~ 3000 밀리초 사이의 랜덤한 sleep
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(idx+ "스레드 끝");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");
		
		Ex04_join t1 = new Ex04_join(1);
		Ex04_join t2 = new Ex04_join(2);
		Ex04_join t3 = new Ex04_join(3);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			//public final void join() throws InterruptedException
			// 스레드가 종료될 때까지 기다린다
			
			t1.join();
			t2.join();
			t3.join(); // 조인 -> 제어 메소드 : 실행시킨 스레드들을  끝날때 까지 메인이 기다린다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 스레드 끝");
	}
}

