package java07_inherit.product;

public class Computer extends Product{
	// --- Member Field ---
	
	
	//--------------------
	
	// 생성자
	public Computer(String model , int price) {
		super( model , price);
		
	}
	
	// 멤버 메소드	
	@Override
	public void out() {
		System.out.println("---------Computer--------------");
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
	}

	
	
	
}
