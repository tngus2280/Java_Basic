package java08_abstract.interfaceEx.quiz;

public class Taxi implements Fare{

	
	@Override
	public void calc(int distance) {
		System.out.println(distance+"m 만큼 운행을 했을때 요금은"+(FEE * distance*2)+"원 입니다");
				
		
		
	}
	
	
}
