package java10_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection05_Map {
	public static void main(String[] args) {
		
		
		Map map = new HashMap();
//		Map map = new Hashtable();
		
		//삽입
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println("map: " + map);
		
		System.out.println("\n---get()------");// 조회
		System.out.println(map.get(3)); //3 = Cherry
		System.out.println(map.get(5)); // null ,  Key가 없을 때
		
		System.out.println("\n-----put()-------");
		map.put("D", "Durian");
		System.out.println("map: " + map);
		
		System.out.println("get(\"D\"):"+ map.get("D"));
		
		System.out.println("------------------");
		map.put(2, "Orange"); // 기존에 존재하는 Key
		map.put(4, "Apple"); // 존재하지않는 Key , 기존에 존재하는 value
		
		System.out.println("map : " + map);
		
		System.out.println("\n----contains()----------");
		System.out.println("key 5 : " + map.containsKey(5));
		System.out.println("value \"Apple\": " + map.containsValue("Apple"));
		
		// 5라는 key가 존재하지 않을 경우에 데이터 삽입
		if( !map.containsKey(5)) { //맵에 5라는키가 존재하지 않을경우 > true
			map.put(5, "Grape");
		}

		System.out.println("-------------------");
		if(map.containsKey(555)) {
		String str = (String) map.get(555);
		System.out.println(str.length());
		// 널포인터
		// . 을찾고 . 바로 왼쪽에 있는게 널포인터
		} else {
			System.out.println("[ERROR] 555 키가 없음");
		}
		
		
		System.out.println("\n---size()-------");
		System.out.println(map.size());
		
		System.out.println("\n-----isEmpty()---------");
		System.out.println(map.isEmpty());
		
		
		System.out.println("\n-----remove()------------");// 제거
		map.remove(3); // key가 3인 Entry를 제거
		System.out.println(map);
		map.remove(2, "Apple"); //  key가 2인 Entry의 value가 "Apple"일 때 제거
		System.out.println(map);
		
		System.out.println("\n-----null값 처리--------------");
		
		map.put(null, "Bob"); // key가 null인 상황은 좋지 않음 , map이라는 api는 null을 넣어도 상관이 없다
		map.put(10, null); // 
		
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
		System.out.println("\n------------map>- set--------------"); // set으로 바꿔서 관리
		
		Set keySet = map.keySet(); // key들을 Set으로 추출
		
		Set entrySet = map.entrySet(); // Entry(key-value쌍)들을 Set으로 추출
		
		System.out.println("keySet: " + keySet);
		System.out.println("entrySet: " + entrySet);
		
		System.out.println("----------------");
		
		Set keys = map.keySet(); // key set
		
		Iterator iter = keys.iterator(); // key Set의 반복자 생성
		
		while(iter.hasNext()) {
			Object key = iter.next(); // key 꺼내기
			
			System.out.println(map.get(key)); // key에 해당하는 Value출력
			
			
		}
		
		
	}
}

