package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading_01 ol01 = new Overloading_01();
		
		System.out.println("--------overloading_01-----------");
		System.out.println("------display()------");
		ol01.display();
		
		System.out.println("----display(int,int)----");
		ol01.display(11,22);
		
		// 같은이름으로 오버로딩 
		
		System.out.println("--------overloading_02-----------");
		Overloading_02 ol02 = new Overloading_02();
		
		int len = ol02.getLength(112233);
		System.out.println("112233의 문자 수:"+ len);

		System.out.println("7789의 문자 수:"+ ol02.getLength(7789));
		
		
		System.out.println("-------------------");
		
		System.out.println("true의 문자수:"+ol02.getLength(true));
		System.out.println("false의 문자수:"+ol02.getLength(false));
		
		System.out.println("12.4578의 문자수:"+ol02.getLength(12.4578));
		
		
		
		
		
		
	}
}
