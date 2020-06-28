package java10_collection.practice2;

public class Book {
	
	private String bNo; // 도서번호
	private int category; // 도서 분류코드(1.인문/2.자연과학/3.의료/4.기타)
	private String title; // 책 제목
	private String author; // 저자
		
	public String getbNo() {		
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return getbNo()+"\t"+getCategory()+"\t"+getTitle()+"\t"+getAuthor();
	
	
}
}
