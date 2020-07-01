package java11_generic;

import java.util.ArrayList;
import java.util.List;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		List list = new ArrayList(); // ArrayList > raw type 원천타입
		// 타입파라미터 E를 결정하지 않아 Object로 사용됨
		
		list.add(123);
		list.add("Apple");
		
		System.out.println("------------------------");
		
		List<String> list2 = new ArrayList<>(); // <> 안의 데이터 타입을 같게해야 유지됨 ArrayList<>안에는 String을
		// 적지 않아도 됨 , 중복적으로 적는것이기 때문에
		// 타입 파라미퍼 E-> String 지정
		
		list2.add("A");
//		list2.add(123);  // 에러 String만 쓰기로함.
		
		//-------------------------------------------------
		
		// 타입파라미터로 기본데이터타입 사용 불가 - Wrapper클래스 사용
//		List<int> list3 = new ArrayList<>(); 
		List<Integer> list3 = new ArrayList<>(); // 
		
		list3.add(123); // int 상수
		
		// -----------------------------------------------
		
		// 타입 안정성
		//	개발자가 의도한 데이터타입으로만 사용되는 것
		
//		list2.add(true); // String으로만 사용가능하다
//		list3.add("안녕"); // 에러 , integer만 사용가능
		
		//--------------------------------------------------
		
		String str1 = (String) list.get(1); // 타입 안정성이 없음. 형변환이 필요하다
		
		String str2 = list2.get(1); // 형변환이 필요없다
		
		System.out.println(list2);
		
	}
}
