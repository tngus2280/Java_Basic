package java04_control.star;

public class Star_12 {
	public static void main(String[] args) {
		
	//Q11
	// *
	// **
	// ***
	// ****
	// *****
	// ****
	// ***
	// **
	// *
	
	int temp =5;
	
	for( int i= 1; i<=10;i++) {
		if(i<=temp) {
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		else {
			for(int k =5; k>i-5;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
			 }  
		
		}
		
//		for(int i =5; i>=1; i--) { // i , 5~1 ,x5 
//			for(int j= i; j<=5;j++) 
//		
//		
//		for(int i =0; i<5; i++) { // i , 5~1 ,x5 
//		for(int j= i+1; j<=5;j++) {
//						System.out.print("*");
	}	
	
	


