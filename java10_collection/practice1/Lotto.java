package java10_collection.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		
		lottoDisplay();
		
	}
	
	public static void lottoDisplay() {
		//1 ~45사이의 정수를 중복되지 않게 , 6개 발생시켜
		// 자동으로 오름차순 정렬되게 처리하는 Set 계열에 보관하고
		// 리스트로 바꾸어 출력
		
		Random ran = new Random();
		// 1~14 사이의 난수
		//ran.nextInt(45)+1;
		
		
		Set set= new TreeSet();
		
		
		
		
		// TreeSet의 요소가 6개가 될 때까지 반복
		while(set.size() != 6){
			set.add(ran.nextInt(45)+1);
		}
		
		System.out.println(set);
	
		
		System.out.println("--------------");
		
		//List로 변환하기
		
		List list = new ArrayList(set);
		System.out.println(list);
		
		
		// 방법2. 배열로 변환하기
		
		Object[] arr = set.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
