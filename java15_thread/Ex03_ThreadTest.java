package java15_thread;

import java.util.Random;

public class Ex03_ThreadTest extends Thread{
	
	private int idx; //스레드의 인덱스
	
	public Ex03_ThreadTest(int idx) {
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
		
		for(int i=0; i<10;i++) {
			new Ex03_ThreadTest(i).start();
		}
		
		System.out.println("Main 스레드 끝");
	}
}
