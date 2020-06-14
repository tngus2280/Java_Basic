package java09_api.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeEx {
	public static void main(String[] args) {
		
		// java.util.Date Class
		
		Date dToday = new Date(); // Date 객체 생성 - 현재 날짜//시간 입력됨 날짜시간 저장용도
		System.out.println(dToday);
		
		System.out.println("--------");
		Date dToday2 = new Date(0L); // Date 객체 생성 - 현재 날짜//시간 입력됨
		System.out.println(dToday2);
		
		// 추가 메소드 대부분이  deprecated 되어 있음
		//  java.util.Date 클래스의 세부정보(날짜/시간)를 파악하려면
		// Calendar 클래스의 get() 메소드를 사용해야 한다
		
		System.out.println("---------------------------");
		
		// java.util.Calendar Class
		
		Calendar cToday = Calendar.getInstance();
		
		System.out.println(cToday); //캘린더 자체로는 인스턴스를 가질수 없고 자식클래스인 그래고니안 인스턴스를 가져온다
		
		System.out.println(cToday.get(Calendar.YEAR)); // 연
		System.out.println(cToday.get(Calendar.MONTH)); // 월
		System.out.println(cToday.get(Calendar.DATE)); // 일
		
		
		System.out.println(cToday.get(Calendar.HOUR)); // 12시간 기준시
		System.out.println(cToday.get(Calendar.HOUR_OF_DAY)); // 24시간 기준시
		System.out.println(cToday.get(Calendar.MINUTE)); // 분
		System.out.println(cToday.get(Calendar.SECOND)); // 초
		
		
		System.out.println("-------------------------------------");
		// java.util.GregorianCalendar Class
		// 추상 메소드를 직접 구현하고 있는 클래스
		// Calendar 클래스와 차이점: 객체 생성을 할수 있는가 없는가 
		
		GregorianCalendar gToday = new GregorianCalendar(1997 , 4, 6 , 20 ,7, 9);
		
		System.out.println(gToday);
		
		
		System.out.println(gToday.get(Calendar.YEAR)); // 연
		System.out.println(gToday.get(Calendar.MONTH)); // 월
		System.out.println(gToday.get(Calendar.DATE)); // 일
		
		
		System.out.println(gToday.get(Calendar.HOUR)); // 12시간 기준시
		System.out.println(gToday.get(Calendar.HOUR_OF_DAY)); // 24시간 기준시
		System.out.println(gToday.get(Calendar.MINUTE)); // 분
		System.out.println(gToday.get(Calendar.SECOND)); // 초
		
		
		System.out.println("-------------------------------------");
		
		
		Date now = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(now); // Date -> Calendar 적용
		
		System.out.println(now);
		
		// ----------------------------
		
		
		GregorianCalendar greCal = new GregorianCalendar();
		greCal.setTime(now);
		
		Date res1 = cal.getTime();  // Calendar -> Date
		Date res2 = greCal.getTime(); // GregorianCalendar -> Date
		
		
	}
}
