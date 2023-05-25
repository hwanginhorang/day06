package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		arr.add("감자");
		arr.add("고구마");
		arr.add("순대");
		arr.add("김밥");
		System.out.println(arr);
		
		System.out.println("찾는 값 입력");
		String name = input.next();
		int num = arr.indexOf(name);
		
		System.out.println(arr.indexOf(name)+" : "+num);
		System.out.println(arr.contains(name));
		
		System.out.println("============================");
		System.out.println(arr);
		int index;
		System.out.println("변경할 위치 입력");
		index = input.nextInt();
		System.out.println("변경할 위치 입력");
		name = input.next();
		
		System.err.print(arr.get(index)+"=>");
		arr.set(index, name);
		System.err.println(arr.get(index));
		System.err.println("변경 후 arr : "+arr);
	}
}
