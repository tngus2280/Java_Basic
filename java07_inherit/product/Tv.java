package java07_inherit.product;

public class Tv extends Product{
	// --- Member Field ---
	
	//--------------------
	
	// 생성자
	public Tv(String model , int price) {
		super(model , price);
		
	}
	
	// 멤버 메소드	
	@Override// 메소드에다 Override
	public void out() {
		System.out.println("---------------TV----------------");
		System.out.println("Model : "+model); // private 일때 this. getModel
		System.out.println("Price : "+price);
	}

	
	
	
	
	
}
