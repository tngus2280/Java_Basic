package java10_collection.practice2;

import java.util.HashMap;
import java.util.Scanner;

public class BookManagerMapEx {
	final static BookManagerMap bmm = new BookManagerMap();
	final static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {

		
		
		//1. 새 도서 추가	//putBook(inputBook() 이 리턴한 객체) 실행
//		2. 도서 삭제	//removeBook(삭제할 책번호) 실행
//		3. 도서 검색출력	//searchBook(검색할 도서명) 실행 
//				=> index 리턴받아 printBook(key) 실행
		
//		4. 전체 출력	//displayAll() 실행
		
//		6. 끝내기  
			out:
			while(true) {
				menu();
				int Idx = sc.nextInt();
				
				switch(Idx) {
					case 1:
						bmm.putBook(inputBook());
						break;
					case 2:
						System.out.println("제거할 도서번호를 입력하세요");
						String key = sc.next();
						bmm.removeBook(key);
						break;
					case 3:
						System.out.println("검색할 도서이름을 입력하세요");
						String ti = sc.next();
						System.out.print("도서번호:");
						System.out.println(bmm.searchBook(ti));
						break;
					case 4:
						bmm.displayAll();
						break;
					case 5:
						break out;
						
					default:
						System.out.println("1에서 5의 수를 입력하세요");
						continue;
				}
			}
		
			
		
		
		
	}	
		public static void menu() {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색출력");
			System.out.println("4. 전체 출력");
			System.out.println("5. 끝내기");
			System.out.println("숫자를 입력하세요");		
	}
		public static Book inputBook() {
			Book b = new Book();
			System.out.println("책번호입력");
			b.setbNo(sc.next());
			System.out.println("책카테고리입력");
			b.setCategory(sc.nextInt());
			System.out.println("책이름입력");
			b.setTitle(sc.next());
			System.out.println("책저자입력");
			b.setAuthor(sc.next());
			
			return b; //book
			
		}
	
		
}
