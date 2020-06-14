package java08_abstract.interfaceEx.quiz2;

import java.util.Arrays;

public class Array implements ArrayAction {
	String[] arr = new String[10];
	int cnt=0;
		
	// 배열의 마지막 데이터 뒤에 삽입
	@Override
	public void add(String element) { //"Apple" 
		arr[cnt] = element;
		cnt++;
	}
	
	// element가 존재하면 삭제
	// 주의) 배열의 요소 사이에 빈공간이 없도록 유지한다

	
	@Override
	
	public void remove(String element) { 
		int idx=10;
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i] == element) {
				arr[i] = null;
				idx = i;
				cnt--;
				continue;
			}
			else if(i>idx) {
					arr[i-1] = arr[i];
				}		
			
		}
		
	}
	
	// idx위치의 element를 반환
	@Override
	public String get(int idx) {
		
		
		return arr[idx]; 	
	}
	
	// element의 idx를 반환
		//	없으면 -1
	
	@Override
	public int find(String element) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==element) {
				return i;

				
			}
		}
			return -1;
		
		
	}
	
	// 모든 element 출력
	@Override
	public void print() {
		for(int i=0; i<cnt; i++) {
			
			System.out.println(arr[i]);
		}
		
		
	}
	

}






