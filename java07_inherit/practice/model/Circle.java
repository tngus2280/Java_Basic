package java07_inherit.practice.model;

public class  Circle extends Point {

	private int radius; // 반지름
	
	
	//멤버 필드
	public Circle() {
		this(0,0,0); //기본값
	}
	public Circle( int x , int y , int radius) {// x, y 는 부모 생성자로 넘김 , center point(중심점)로 취급
		super(x, y); // 부모생성자 호출
		setRadius(radius); // 반지름값 
	}
	
	
	//멤버 메소드
	public void draw() {
		
		
		double area = Math.PI * radius * radius;
		double girth = 2 * Math.PI * radius;
		
		System.out.println("원의 x좌표값: "+x+"\t"+"y좌표값: "+y+"\t"+" 면적: "+String.format("%.1f", area)+"  둘레: "+String.format("%.1f", girth) );
		
	}
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
	
}
