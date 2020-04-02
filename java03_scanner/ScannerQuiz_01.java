package java03_scanner;
import java.util.Scanner;
public class ScannerQuiz_01 {
	public static void main(String[] args) {
		// 삼각형 넓이 구하기
		// -삼각형 
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("밑변:");
	int base = sc.nextInt();
	
	System.out.println("높이:");
	int height = sc.nextInt(); 
	
	//System.out.println("[Test]"+base+","+height); // 테스트 같은거 중간중간 넣는다
	
	//넓이 구하기
	double area = (base)*(height)/(double)2; //형 맞추기
	
//	System.out.println("[Test]area:"+area);
// 	최종출력
	
	System.out.println("--결 과---");
	System.out.println(">>밑변:"+ base);
	System.out.println(">>높이:"+ height);
	System.out.println(">>넓이:"+ area);
	
	}
}
