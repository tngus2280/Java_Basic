package java12_exception.quiz;
import java.io.*;

import java12_exception.quiz.exception.CharCheckException;

public class CharacterProcess {
	public int countAlpha(String s) throws CharCheckException {
		int cnt=0;		
			for(int i=0;i<s.length();i++) {
				if((s.charAt(i)>='a'&&s.charAt(i)<='z') ||(s.charAt(i)>='A'&&s.charAt(i)<='Z')){
					cnt++;
			}else if(s.charAt(i)==' ') {
				throw new CharCheckException();
			}
			
		}
			return cnt;
		
	}
	
}

//[디폴트 생성자]
//
//		[메소드]	public int countAlpha(String s){}
//		//전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
//		//단, 공백문자가 있으면, CharCheckException 발생

