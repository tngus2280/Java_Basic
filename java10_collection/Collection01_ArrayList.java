package java10_collection;

import java.util.ArrayList;
import java.util.List;

public class Collection01_ArrayList {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		// 자료구조에서 자주 사용되는 동작( 로직, 알고리즘)
		// CRUD작업
		// Create 	- 추가/삽입
		// Read		- 조회/탐색
		// Update	- 수정/변경
		// Delete	- 삭제/제거
		
		
		System.out.println("\n-----삽입----------");
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list); // 오버라이딩 되어서 저장된값이 출력됨
		
		System.out.println("\n----조회---------");
		
		System.out.println(list.get(1));// Banana
		
		System.out.println("------------");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("\n---수정-------");
		
		list.set(1, "Orange");
		System.out.println(list);
		
		
		System.out.println("\n---삭제------");
		System.out.println(list.remove("Banana"));
		
		System.out.println("지워진 값: "+ list.remove(1) );
		System.out.println(list);
		
		
		System.out.println("\n---삽입----------------");
		
		list.add("Tomato");
		
		System.out.println(list);
		
		
		System.out.println("\n-----contains()------------------"); //포함하다
		System.out.println(list.contains("Tomato")); //토마토가 포함되어있는지
		
		System.out.println("\n ----- isEmpty()--------------------");
		System.out.println(list.isEmpty());  ;// 비어있는지
		
		//if(!list.isEmpty){}
		
		
		System.out.println("--------------------------------------");
		
		List l = null; //아예 구현체 객체 생성이 안됨 ,,,, 리스트를 생성하지 않음
		
//		if(l.isEmpty()) {} //NullpointerException
		
		if(l == null) {} //정상, 리스트를 생성하지 않았는지 검사
		
		//-------------------------------------------
		
		List ll = new ArrayList(); // 요소를 넣지 않음
		
		if(ll.isEmpty()) {} // 정상, 요소가 하나도 없는지 검사
		
		if(ll == null) {}
		
		System.out.println(l); // null
		System.out.println(ll); // [] 배열처럼 리스트 구조인데 비어있음.
		
		
		System.out.println("\n----모든 요소 출력하기------------------");
		list.add(123);
		list.add(true);
		list.add(3.14);
		
		
		System.out.println(list); // 1. 객체를 이용한 출력
		
		System.out.println("---------------");
		
		for(int i=0; i<list.size(); i++) { //for문을 이용한 출력
			System.out.println(list.get(i));
			
		}
		
		System.out.println("--------------------");
		
		for( Object element : list) {  // for each 문을 이용한 출력
			System.out.println(element);
		}
		
		
		System.out.println("\n---clear()------------");
		
		System.out.println(list);
		
		list.clear(); // 전체 요소 삭제
		
		System.out.println(list);
		
		list = null; // 객체삭제 (GC 동작) 
		
		
		
		
		
		
	}
}

