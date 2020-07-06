package java12_exception;

class User{
	private int age; //나이
	
	
	
			
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {
		
		if(age<0 || age >150) { //예외 상황 , UserAgeException
			throw new UserAgeException(); // 예외 발생시키기
		}
		
		this.age = age;
	}
	
	
}

//사용자 정의 예외 클래스

//class UserAgeException extends Exception{  // Checked
class UserAgeException extends RuntimeException{ // Unchecked
	@Override
	public String getMessage() {

		return "나이는 0보다 작거나 150보다 클 수 없다";
	
	}
	
}

public class Exception_11_CustomException {
	public static void main(String[] args) {
		
//		throw new UserAgeException();
		
		
		User user = new User();
		
//		try {
//			user.setAge(-5);
//		} catch (UserAgeException e) {
//			e.printStackTrace();
//		}
		
		user.setAge(-5);
		
		
	}
}

