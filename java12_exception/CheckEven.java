package java12_exception;

public class CheckEven {

	//전달인자가 짝수인지 홀수인지 판별하는 기능
	public void check(int num) throws OddNumberException{
		
		if(num%2 ==0 ) {
			
			System.out.println(num+" 짝수가 맞습니다!");
		}else {
			throw new OddNumberException();
		}
	}
	
	
	
	
}
