package java07_inherit.practice.model;

public class Rectangle extends Point{

	private int width;
	private int height;
	
	
	//멤버 필드 생성자
	public Rectangle() {
		this(0,0,0,0);
	}
	public Rectangle( int x , int y , int width , int height) {
		super(x, y);
		setWidth(width);
		setHeight(height);
		
	}
	
	public void draw() {
		
		double area = width * height;
		double girth = 2*(width+height);
		
		System.out.println("사각형의 x좌표: "+ x+"\t" +"y좌표: "+ y+"\t" +"면적: "+String.format("%.1f", area)+" 둘레: "+String.format("%.1f", girth));
	
//	System.out.printf("면적: %.1f\n" , width*(double)height);
//	System.out.printf("둘레: %.1f\n" , 2*(width+(double)height));
	
	}
	
	
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
