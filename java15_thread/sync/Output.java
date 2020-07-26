package java15_thread.sync;

public class Output extends Thread{

	SyncData data;
	
	public Output(SyncData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		System.out.println("----Output Start---");
		
		synchronized(data) {
			
			
			// 덧셈이 완료되지 않은 상황
			if(!data.available ) {
				try {
					data.wait();// 스레드가 data의 notify를 기다린다 ,LOCK반납
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("TOTAL : " + data.total);
		}
		
		
		System.out.println("----Output Start---");
	}
	
}
