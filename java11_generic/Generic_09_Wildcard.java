package java11_generic;

import java.util.Arrays;
import java.util.List;

public class Generic_09_Wildcard {
	
	public static void display(List<?> list) { // 제네릭에선 ? 가 와일드 카드
//		public static void display(List<? extends Number> list) { // 데이터 타입이 숫자들일떄만 처리가능하게 
//			public static void display(List<? super String> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> iList = Arrays.asList(10,20,30);
		display(iList);
		
		System.out.println("--------------");
		
		List<String> sList = Arrays.asList("A","B","C");
		display(sList);
		
		System.out.println("--------------");
		
		Object o = null;
		Integer i = null;
		
		o=i; // Object클래스는 Integer의 부모 클래스
		
		System.out.println("---------------");
		
		//제네릭은 자바의 기본 상속구조를 무시한다
		
		List<Object> ol = null;
		List<Integer> il = null;
		
//		ol = il; //에러 
		
		
		
		
		
	}
}

