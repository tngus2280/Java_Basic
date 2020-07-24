package java15_thread;

// Runnable 클래스 , 스레드 클래스
class Thread02 implements Runnable{
	@Override
	public void run() { // 스레드 코드 
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread : " + i);
			
			try {
				Thread.sleep(50);	// 스레드를 50밀리초 일시정지시킨다
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}

	}
}


public class Ex02_interfaceRunnable {
	public static void main(String[] args) { // 기본 스레드
		
		Thread02 th02 = new Thread02(); // 생명주기 상 new
		
		//Runnable상속 받았기 때문에 start를 할수 없다
		//Thread클래스에 Runnable클래스를 전달하며 객체를 생성한다
		Thread threadExecutor = new Thread(th02); 
		// threadExecutor -> 스레드 실행시켜주는 도구
		
		threadExecutor.start(); //스레드 실행 , 활성화
		
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("Main : " + i);
			
			
			try {
				Thread.sleep(50);	// 스레드를 50밀리초 일시정지시킨다
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
		
		
	}
}
