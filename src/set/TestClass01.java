package set;

import java.util.ArrayList;
import java.util.HashSet;

public class TestClass01 {
/*
 set -> HashSet
  - 순서를 유지하지 않는다
  - index를 사용할 수 없다
  - index대신에 Iterator를 사용한다
  - 기본 배열(저장소)의 크기를 16개 만들어 놓고 시작한다
  	데이터를 저장하다 75%가 채워지면 이어서 16개의 공간을 늘린다
  - 데이터의 중복을 허용하지 않는다
  - list보다 처리속도가 빠르다
 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> arr = new ArrayList<>();
		
		hs.add("라면"); hs.add("김밥");
		hs.add("순대"); hs.add("김밥");
		
		arr.add("라면"); arr.add("김밥");
		arr.add("순대"); arr.add("김밥");
		
		System.out.println(hs);
		System.out.println(arr);
		
		hs.remove("순대");
		System.out.println(hs);
	}
}
