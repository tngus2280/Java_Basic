package java10_collection.practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BookManagerMap {
 //멤버 필드 
	
	private Map <String, Book> booksMap; //도서번호를 키로 사용함		
	 	
	public BookManagerMap() {
		this.booksMap = new HashMap<>();//기본생성자 : 맵 객체 생성함
		
	}
	//매개변수있는 생성자 : 다른 맵을 전달받아 booksMap 객체의 초기값으로 생성함
	public BookManagerMap(Map map) {
		this.booksMap= map;
	}
	
	
	//맵에 객체추가 , 도서번호를 키로 사용함
	public void putBook(Book book) {		
		booksMap.put(book.getbNo(),book);
	}
	
	// 맵에서 객체 제거
	public void removeBook(String key) { //3
		Set keys = booksMap.keySet(); //key넣기
		int sw=0;
		
		for(Object i : keys) {
			if(i.equals(key)) {
				booksMap.remove(key);
				sw=1;
			}
		}
		if(sw==0) {
			System.out.println("해당되는 도서번호가 없습니다");
		}	
	}
	
	// entrySet()사용 
	// 도서명이 일치하는 객체의 도서번호를 리턴
	// 도서명이 객체가 맵에 없으면 , null 리턴함
	public String searchBook(String bTitle) {							
		for(  Map.Entry <String,Book> entry : booksMap.entrySet()) {
			if(entry.getValue().getTitle().equals(bTitle)) {
				return entry.getValue().getbNo();
			}
		}
		return null;
		
		
		
	}	
	// 맵정보 모두 출력 keySet()사용
	public void displayAll() {
		  //[1,2,3]
		for(Object i : booksMap.keySet()) { //bNo : key
			System.out.println(booksMap.get(i).toString()); //booksMap.get(i) ==book.toStirng()
		}
	}
	//key에 해당하는 Book 출력
	public void printBook(String key) {		
			System.out.println(booksMap.get(key)); // key에 해당하는 Value출력
	}
	
}
