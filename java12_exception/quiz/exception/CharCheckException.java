package java12_exception.quiz.exception;
import java.io.*;



public class CharCheckException extends Exception{

	@Override
	public String getMessage() {	
		return "공백이 포함되었습니다";
	}
	
	}
	

