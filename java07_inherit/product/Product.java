package java07_inherit.product;

// 추상클래스
// public abstract  class Product {
//	}
public abstract  class Product {
	// --- Member Field ---
	protected String model;
	protected int price;
	//--------------------
	
	// 생성자
	public Product( String model , int price ) {
		setModel(model);
		setPrice(price);
		
		
		
	// 멤버 메소드	
	}
	// 추상 메소드  ,  public abstract void out(); // abstract  =추상화 
	public abstract void out();  // 동적바인딩 되서 코드를 넣어도 자식 클래스의 코드를 실행한다
		
	

	// --- Getter , Setter ---
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
