package java07_inherit.practice.controller;



import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
		Circle[] cir = new Circle[3];
		Rectangle[] rec = new Rectangle[3];
		
		
		cir[0] = new Circle(1,2,3);
		cir[1] = new Circle(4,5,6);
		cir[2] = new Circle(7,8,9);
		
		rec[0] = new Rectangle(10,11,12,13);
		rec[1] = new Rectangle(14,15,16,17);
		rec[2] = new Rectangle(18,19,20,21);
		
		
		
		
		System.out.println("------------------circle------------------");
//		cir[0].draw();
//		cir[1].draw();
//		cir[2].draw();
		for(int i = 0; i<cir.length; i++) {
			
			cir[i].draw();
			System.out.println("------------");
		}
		
		System.out.println("------------------rectangle--------------");
//		rec[0].draw();
//		rec[1].draw();
//		rec[2].draw();
		for(int i = 0; i<rec.length; i++) {
			rec[i].draw();
		}
		System.out.println("-----------------------------------------");
		
		Point[] p =  new Point[5];
		p[0] = new Circle(1,2,3);
		p[1] = new Rectangle(3,4,5,6);
		p[2] = new Circle(7,8,9);
		p[3] = new Rectangle(10,11,12,13);
		p[4] = new Circle(14,15,16);
		
		for(int i = 0; i<p.length; i++) {
			System.out.println(i+"번째");
			p[i].draw();
			System.out.println();
		}
	}
}
