package java06_class;
// 기능 클래스
public class Class_03 {

	private int num; //번호
	private String name; //이름
	private double height; //키
	
	
	//Getter Method   - num 필드의 값을 알려준다(반환한다)
	public int getNum() {  //읽기전용
		return num;
	}
	
	//Setter Method - num필드에 값을 저장한다
	public void setNum(int num) { // 쓰기전용
		this.num = num;
		
		//정보은닉하고 실행하기위해 열어준다
	}
}
