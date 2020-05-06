package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {
	public static void main(String[] args) {
		
		
		//1~3 학년
		//2개의 반
		//4명의 학생
		//3과목 점수
		
		int[][][][] score = new int[3][2][4][3];
		
		int [][][] sco1 = new int[2][4][3];
		int [][][] sco2 = new int[2][4][3];
		int [][][] sco3 = new int[2][4][3];
		
		//-------------------------------------------------------
		
		//배열 3
		
		//2명 학생의 정보
		// 국어, 영어, 수학 점수를 입력해서 저장..  //sco
		
		//총점, 평균을 구한다
		//sum, avg
		// 전체 출력
		
//		Scanner sc = new Scanner(System.in);//입력객체
//		
//		int sum1= 0;
//		int sum2= 0;
//		int avg1= 0;
//		int avg2= 0;
//		
//		int [][]sco = new int[2][3]; // 3과목 점수 , 2명의 학생
//		
//		for(int i=0; i<3;i++) {
//			for(int j=0; j<3 ; j++) {
//				
//				sco[i][j] = sc.nextInt();
//			
//				
//			}
//		}
		
		final int STUDENT_NUM =2;
				
		final int SUBJCET_NUM =3;
		
		
		
		
		//1. 필요한 변수 선언 (배열)
		Scanner sc = new Scanner(System.in);
		int[][] sco = new int[2][3];// 2명의 3과목 점수 배열
		int[] sum = new int[2];							// 2명의 총점 배열
		double[] avg= new double[2]; // 2명의 평균 배열
		
		// 2. 과목들 점수 입력 받기(Scanner)
		
		String[] subject = {"국어", "영어", "수학"};
		
		for(int i=0; i<sco.length;i++) { // i번째 학생
			for(int j=0; j<sco[i].length;j++) { // j번째 과목
		
			System.out.print((i+1)+"번째 학생의"+ subject[j ]+" 점수 입력:");
			sco[i][j] = sc.nextInt();// 점수 입력
			
				
			}
			
			System.out.println();
		}
		// TEST
//		for(int i = 0; i<sco.length;i++) {
//			for(int j = 0; j<sco[i].length;j++) {
//			System.out.print(sco[i][j]+ " ");
//		}
//		System.out.println();
		// 3. 총점 계산하기
		for( int i=0; i<sum.length; i++) {// i번째 학생
			for( int j=0; j<sco[i].length; j++) {// j번째 과목
			sum[i] += sco[i][j]; //학생별 총점 계산
			}
		}	
		//TEST
//		for(int i= 0; i<sum.length;i++) {
//			System.out.print(sum[i]);
//		}
		

		// 4. 평균 계산하기
		for(int i=0; i<avg.length;i++) {//i번째 학생
			avg[i] = sum[i] / (double)sco[i].length;//학생별 평균 계산
		}
		//TEST
//		for(int i= 0; i<avg.length;i++) {
//			System.out.print(avg[i]);
//	}
	
	
	
	
	
	
		// 5. 전체 출력
		System.out.println();
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균");
		
		for(int i=0; i<sco.length; i++) {//1번째 학생
			System.out.print((i+1)+"번");//학생의 번호
			
			//3과목 점수 출력
			for(int j=0; j<sco[i].length;j++) {
				System.out.print("\t"+sco[i][j]);
			}
			System.out.print("\t"+sum[i]);// 총점 출력
		//	System.out.println("\t"+avg[i]);// 평균 출력
			System.out.printf("\t%.2f\n", avg[i]);// 평균 출력(소수 둘째 자리)
			//\t  %2.f  \n
			// tab	format	new line
			
			
		}
		
		
	}
}
