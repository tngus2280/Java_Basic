package java06_class.method;

import java.util.Arrays;

public class MethodEx { //실행 클래스 ,Excutor
	public static void main(String[] args) {
		
		
		Method_01 m01 = new Method_01();
		
		int res = m01.add(100, 200);
		
		System.out.println("결과:"+res);
		
		System.out.println("------------------------------------");
		
		
		System.out.println("덧셈 결과:"+m01.add(45, 32));
		
		
		System.out.println("------------------------------------");
		
		
		Method_02 m02 = new Method_02();
		
		m02.method01();
		
		System.out.println("------------------------------------");
		
		m02.method02(100); //100, 전달인자, 전달 인수 Argument
		
		m02.printNum2(34, 72);
		
		System.out.println(m02.returnNum() );
		
		System.out.println(m02.add(3456,2323));
		
		System.out.println("------------------------------------");
		
		Method_03 m03 = new Method_03();
		
		int[] arr = new int[5]; //int 형 배열
		int num;
		
		arr[2] = 100;
		num = 200;
		
		System.out.println("--- 메소드 호출 전 ---");
		System.out.println(Arrays.toString(arr));
		System.out.println(num);
		
		
		m03.arrTest01(arr);// 일시정지 메소드 호출 , 참조 Reference
		m03.arrTest02(num); // 메소드 호출 , 값, Value 전달
		
		System.out.println();
		System.out.println("--- 메소드 호출 후 ---");
		System.out.println(Arrays.toString(arr));
		System.out.println(num);
		
		
		
		System.out.println("------------------------------------");
		
		int n = m03.arrTest03();
		n = 20;
		
		int[] ar = m03.arrTest04();
		ar[0] = 99;
	}
}
