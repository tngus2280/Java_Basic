package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
public static void main(String[] args) {
	//학생 정보 관리 프로그램
	// 이름 , 나이, 성별, 국어, 영어 ,수학
	// 6가지 정보를 저장할 수 있는 변수를 만들고
	// 6가지 정보를 Scanner를 이용해 입력한 후에
	// 총점과 평균을 포함한 결과를 출력한다
	
	
	// 출력
	// 이름 나이 성별 국어 영어 수학 총점 평균
	// alice 22 f 100 99 97 296 98.66666666666666667
	
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("이름:");
	
	String name = in.nextLine();
//	System.out.println("[Test]"+name);
	
	
	System.out.println("나이:");
	int age = in.nextInt();
//	System.out.println("[test]"+ age);
	
	System.out.println("성별:");
	in.nextLine(); // 버퍼 비우기
	String str = in.nextLine();
	
	//System.out.println("[test]str"+str);
	
	char gender = str.charAt(0);
	//System.out.println("[test]gender"+ gender);
	
	System.out.println("국어:");
	int kor = in.nextInt();
	
	System.out.println("영어:");
	int eng = in.nextInt();
	
	System.out.println("수학:");
	int math = in.nextInt();
	
	
//	System.out.println("[test]"+kor+","+eng+","+math);
	
	
	
	int total = kor+eng+math;
	double avg = total/(double)3;
	System.out.println("[test"+total+","+avg);
	
	System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
	System.out.println(name + "\t"+age+"\t"+gender+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.2f",avg));
	
	System.out.println("---------");
//	2.	System.out.printf(); 메소드 이용하기
	System.out.printf("%.2f",avg);
	
	System.out.println("---------");
	//3. double 데이터타입을 유지하며 변환하기
	double formatted = Math.round(avg*100)/(double)100;
//	double formatted = Math.round(54.56789*100)/(double)100;
//	double formatted = Math.round(5456.789*100)/(double)100;
//	double formatted = 5457/(double)100;
//double formatted = 54.57
			//						round(반올림)		(average)
	
	//필요한 변수들 생각하기
	//Scanner
	
	//이름 , 나이, 성별, 국어, 영어 ,수학
	//총점과 평균
	
	// 정보 6가지 입력
	// 총점, 평균 계산
	// 전체 출력
	

	}
}
