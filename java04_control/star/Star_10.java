package java04_control.star;

public class Star_10 {
	public static void main(String[] args) {
		
	for(int i =0; i<5; i++) { // i , 5~1 ,x5 
		for(int j= 0; j<5;j++) {
			if( i<=j) {System.out.print("*");}
			if( i>j) {System.out.print(" ");}
		}
		System.out.println();
		
		
		}
	}
}
