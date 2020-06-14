package java09_api;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		
		Random ran = new Random();
		
		System.out.println( ran.nextInt());
		System.out.println( ran.nextInt(66));
		System.out.println( ran.nextInt(100)); // 0~ 99
		
		System.out.println("-------------------");
		
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());

	
		System.out.println(ran.nextDouble());
	
		System.out.println("----------");
		
		System.out.println( ran.nextInt(3));
		System.out.println( ran.nextInt(3)+1);
		
		System.out.println("----------");
		
		int[] arr =new int[6];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1;// 1~45
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);//배열정리
		
		System.out.println(Arrays.toString(arr));
	}
}
