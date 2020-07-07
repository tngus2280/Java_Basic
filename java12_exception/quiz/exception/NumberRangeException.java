package java12_exception.quiz.exception;

import java.io.*;

public class NumberRangeException extends Exception {

	@Override
	public String getMessage() {	
		return "1부터 100 사이의 값이 아닙니다";
	}
}
