package java08_abstract.interfaceEx;

interface InterA{
	public abstract void getA();
	
}


interface InterB{
	public abstract void getB();
	
}


interface InterC extends InterA , InterB { //Interface 끼리의 상속은 extends InterC가 부모 A,B가 자식 다중상속 가능
	public abstract void getC();
	
	
	
}


class Child03 implements InterC {
//class Child03 implements InterA , InterB , InterC {

	
	
	
	
	@Override
	public void getC() {
		
	}

	@Override
	public void getB() {
		
	}

	@Override
	public void getA() {
		
	}
	
}










public class InterfaceEx_03 {

	
	
	
}
