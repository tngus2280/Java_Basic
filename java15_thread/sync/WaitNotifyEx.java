package java15_thread.sync;

public class WaitNotifyEx {// 실행 클래스
	public static void main(String[] args) {//메인이 스레드들의 관리자 역할
		
		SyncData data = new SyncData(); // 공유자원
		
		Output o = new Output(data);
		Input i = new Input(data);
		
		o.start();
		i.start();
		
		
		
	}

}
