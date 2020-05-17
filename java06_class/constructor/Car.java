package java06_class.constructor;

public class Car {

	private String model;
	private String color;
	
	
	
	
	
	
	public Car(String model, String color) { // 접근제한자 public , 매개변수 스트링
		setModel(model);
		setColor(color);
		
		
		
	}

	public void display() {
		System.out.println("model:"+model);
		System.out.println("color:"+color);
	}
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
		
		
		
	
	
}
