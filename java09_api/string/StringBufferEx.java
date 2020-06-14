package java09_api.string;

public class StringBufferEx {
	public static void main(String[] args) {
		
		System.out.println(" --- StringBuffer()생성-------------");
		StringBuffer sb = new StringBuffer(); // 객체 생성하고서 사용
		info(sb);
		
		
//		System.out.println("length:"+ sb.length()); //문자열 길이
//		System.out.println("capacity: " + sb.capacity()); //capacity 수용 능력 , 용량 ,관리하고있는 최대 길이
		
		
		System.out.println("\n---StringBuffer(\"Hello\")---------");
		// \제어문자
		
		
		StringBuffer sb2 = new StringBuffer("Hello"); // 객체 생성하고서 사용
		info(sb2); // info메소드 호출해서 사용
		
		System.out.println("\n---StringBuffer(5)---------");
		StringBuffer sb3 = new StringBuffer(5); //capacity를 5로 지정
		info(sb3);
		
		System.out.println("\n---Apple추가-------");
		sb3.append("Apple"); 
		System.out.println(sb3);// toString오버라이딩 되어있음
		info(sb3);
		
		System.out.println("\n---Banana추가--------");
		sb3.append("Banana");
		
		System.out.println(sb3);
		info(sb3);
		
		// ---------------------------------------------------------
		//--------------------------------------------
				// sb3에 작업!
				
				// 5번째 인덱스에 "Orange" 넣고 출력 - insert
				System.out.println("\n---insert-------");
				sb3.insert(5, "Orange");
				System.out.println(sb3);
				info(sb3);
				
				// 3번째 인덱스 삭제하고 출력 - deleteCharAt
				System.out.println("\n---deleteCharAt-------");
				sb3.deleteCharAt(3);
				System.out.println(sb3);
				info(sb3);
				
				
				
				System.out.println("\n---substring-------");
				// substring(1, 7) 결과 출력
				String sub  = sb3.substring(1, 7);

				System.out.println("sb3: " + sb3);
				System.out.println("sub: " + sub);
				// sb3 출력
				// info 출력
				info(sb3);
				
				
				
				
				// trimToSize() 수행
				// info 출력
				System.out.println("\n---trimToSize-------"); // capacity를 length만큼 깎아낸다
				sb3.trimToSize();
				info(sb3);
				
				
				
				
				System.out.println("\n-------- reverse-----");
				// reverse() 호출 후 결과 출력
				sb3.reverse();
				System.out.println(sb3);
				
				
		
	}
	
		public static void info(StringBuffer s) {
			System.out.println("length:"+ s.length()); //문자열 길이
			System.out.println("capacity: " + s.capacity()); //capacity 수용 능력 , 용량 ,관리하고있는 최대 길이
		
		}
	
}

