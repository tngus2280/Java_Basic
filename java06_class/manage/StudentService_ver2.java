package java06_class.manage;

import java.util.Scanner;

public class StudentService_ver2 {

	private Scanner sc; // 멤버필드
	private Student[] stuArr;
	public int idx;
	
	// 생성자 객체 초기화 , 멤버 메소드
	public StudentService_ver2() {
		
		sc = new Scanner(System.in);	//키보드 입력객체
		
		stuArr  = new Student[3];// 학생정보 객체
		
		for(int i=0; i<stuArr.length; i++)
			stuArr[i] = new Student();
		
	}
	private int getIdx() {
		System.out.println("몇번째 학생?");
		int idx = sc.nextInt()-1; //sc.nextInt-1 = 배열은 0,1,2로 시작 입력은 1 ,2 ,3
		sc.nextLine(); // sc.nextLine();해주는 이유는 int형을위에서 사용했기 때문에 버퍼 비우기 하기 위해서
		
		return idx; // idx값 반환
		
		
	}
	
	
	// ---------------------------------
	private void insertInfo(Student stuArr, int idx) {
		
		
	System.out.println("이름:");
	
	stuArr.setName(sc.nextLine()); //이름 입력받기
	
	System.out.println("나이:");
	stuArr.setAge(sc.nextInt()); // 나이 입력받기
	sc.nextLine(); // 버퍼 비우기 
	
	}
	
	public void insertInfoAll() {
		
		insertInfo(stuArr[0],0); // 0,0 배열 호출
		insertInfo(stuArr[1],1); 
		insertInfo(stuArr[2],2);
		
	}
	public void insertInfoIdx() {
		int idx = getIdx(); // 배열 012 입력 123
		insertInfo(stuArr[idx] , idx); // 배열의 0,0  호출
		
	}
	
	//-------------------------------------
	
	private void insertScore(Student stu, int idx) {
		
	System.out.println("국어점수:");
	stu.setKor(sc.nextInt());
	System.out.println("영어점수:");
	stu.setEng(sc.nextInt());
	System.out.println("수학점수:");
	stu.setMath(sc.nextInt());
	sc.nextLine();
	calcSum(stu); //기능만있기 때문에 호출하여서 실행하기위함
	calcAvg(stu);
	}
	public void insertScoreAll() {
	
		insertScore(stuArr[0],0);
		insertScore(stuArr[1],1);
		insertScore(stuArr[1],1);
		
	}
	public void insertScoreIdx() {
		int idx = getIdx();
		insertScore(stuArr[idx],idx);
		
	}
	//--------------------------------------------
	
	public void insertStu(int idx) {
		
		
		insertInfo(stuArr[idx] , idx);
		insertScore(stuArr[idx], idx);
	}	
	
	public void insertStuAll() {
		
		insertInfo(stuArr[0],0);
		insertInfo(stuArr[1],1);
		insertInfo(stuArr[2],2);
		insertScore(stuArr[0], 0);
		insertScore(stuArr[1], 1);
		insertScore(stuArr[2], 2);
	}	
	//-------------------------------------------------- 
	private void calcSum(Student stu) {
		
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
		
	}
	private void calcAvg(Student stu) {
	
		stu.setAvg(stu.getSum()/(double)3);
		
	}
	
	//---------------------------------------------------
	
	
	private void printStu(Student stu, int idx) {
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		System.out.print(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getKor()+"\t"+stu.getEng()+"\t"+stu.getMath()+"\t"+stu.getSum()  );
		System.out.printf("\t"+"%2f",stu.getAvg());
		System.out.println();
	}
	public void printStuAll() {
		this.printStu(stuArr[0],0);
		this.printStu(stuArr[1],1);
		this.printStu(stuArr[2],2);
		
	}
	public void printStuIdx() {
		int idx = getIdx();
		this.printStu(stuArr[idx], idx);
	}
	
	
	
	
	
	
	
	
	
	
}
