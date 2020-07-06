package java12_exception;

public class OddNumberException extends RuntimeException{
	@Override
	public String getMessage() {
		return "홀수는 안됩니다";
	}
}
