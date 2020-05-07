package java05_array.array2D;

import java.util.Scanner;

public class Array2D_05 {
	public static void main(String[] args) {
		
		// new 연산자
		// 동적 할당 연산자
		
		
		// 할당 : 변수 공간을 생성(저장공간 생성)
	
		// 정적 할당: 프로그램 실행 전에 준비가 끝나는 할당, Compile-time ,변수들 ,배열 등등
		// 동적 할당: 프로그램 실행 도중에 준비 , Run-time
		
		
		int num; // int형 번수 선언 -> 정적 할당 
		// 변수를 생성하는건 정적할당
		
		int[] arr; // int형 배열 변수 선언 -> 정적 할당
		
		arr = new int[5]; //int[5] 배열 생성 -> 동적 할당
		// 동적할당을 하면 참조형 변수에 저장할 수 있는 참조값을 반환한다
		
		
		// - -----------------------------------------------------------
		
//		int[] arr2 = new int[-10];
		
		// 배열 선언 시점과 배열 생성 시점은 다르다
		
		// 배열변수 선언 -> 정적 할당
		// 배열공간 생성 -> 동적 할당
		
		// -----------------------------------------------------------
		
		//3명의 점수를 관리하지만 각 학생들의 과목수를 모를 때
		int[][] score = new int[3][];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.print(i+"행 학생의 과목수는?");
			int len = sc.nextInt();
			
			score[i] = new int[len];
		}
		
	}
}
