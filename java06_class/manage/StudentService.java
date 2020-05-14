package java06_class.manage;

import java.util.Scanner;

public class StudentService {

	private Student stu;
	private Scanner input;
	
	//생성자 - 객체 초기화 , 멤버필드 초기화
	public StudentService() {
		// 학생 정보 객체
		this.stu = new Student();
		//키보드 입력 객체
		this.input = new Scanner(System.in);
	}
	
	
	// 인적정보 입력 - 이름,나이
	public void insertInfo() {
		System.out.println("인적 정보:");
		System.out.print("이름:");
		
		
		stu.setName(input.nextLine()); 
		System.out.print("나이:");
		stu.setAge(input.nextInt());
			
		
	}
	// 점수정보 입력 - 국어, 영어 , 수학
	public void insertScore() {
			System.out.print("국어점수:");
			stu.setKor(input.nextInt());
			System.out.print("영어점수:");
			stu.setEng(input.nextInt());
			System.out.print("수학점수:");
			stu.setMath(input.nextInt());
			this.calcSum();
			this.calcAvg();
		
	}
	// 총점 계산
	public void calcSum() {
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
		System.out.println("총합 점수:" + stu.getSum());
	}
	// 평균계산
	public void calcAvg() {
		stu.setAvg(stu.getSum()/(double)3);
		System.out.println("평균 점수:" + stu.getAvg());
		
	}
	// 전체 정보 출력
	public void printStu() {
		
		System.out.println("-----------------------------------");
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		System.out.print("이름:"+stu.getName());
		System.out.println("나이:"+stu.getAge());
		System.out.println("국어:"+stu.getKor());
		System.out.println("영어:"+stu.getEng());
		System.out.println("수학:"+stu.getMath());
		System.out.println("총점:"+stu.getSum());
		System.out.printf("%.2f",stu.getAvg());
		System.out.println();
		
		
	}
	
	
}
