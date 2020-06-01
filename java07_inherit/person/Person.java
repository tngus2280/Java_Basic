package java07_inherit.person;

import java07_inherit.product.Product;

public class Person {

	//멤버 필드
	private String name;
	private int money;
	private Product prod;
	
	
	//생성자
	public Person(String name , int money ) {
		setName(name);
		setMoney(money);
		
		
	}
	public void buy(Product prod) {
		this.prod = prod ; 
		if(this.money >= prod.getPrice()) { 
			setMoney(money-prod.getPrice());
			System.out.println(name+"님이 "+prod.getPrice()  +"를 지불하고"+ prod.getModel() +"를 구매함");
			System.out.println("[잔액]: "+ money + "원" );
		}
		// 
		else {
			System.out.println("잔액이 부족합니다");
		}
		
		}
			
		
		
	public void sell (Product prod) {
		this.prod = prod;
		setMoney(money + prod.getPrice());
		System.out.println(name + "님이 "+ prod.getModel() + "를"+ prod.getPrice()+"원에 판매함");
		System.out.println("[잔액]: "+money+"원");
	}
	
	// 자기가 산 물건을 되파는것 
	// 가지고 있는 물건만 팔 수 있다
	// 배열로
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	
	
}
