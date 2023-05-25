package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> pnum = new ArrayList<>();
		int num=0, result=0;
		String n, p;
		boolean bool = true;
		
		while(bool) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.println(">>");
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("이름 입력 : "); n = scan.next();
				if(name.indexOf(n) == -1) {
					System.out.print("연락처 입력 : ");	
					p = scan.next();
					name.add(n); pnum.add(p);		
				}else{System.out.println("이름이 존재 합니다");}break;
			case 2:
				System.out.println("확인할 연락처: ");
				n = scan.next();
				if(result == -1) {
					System.out.println("목록에 없음");
				}else {
					System.out.println(name.get(result)+":");
					System.out.println(pnum.get(result));
				}break;
			case 3: 
				System.out.println("삭제할 연락처: ");
				n = scan.next();
				result = name.indexOf(n);
				if(result == -1) {
					System.out.println("목록에 없습니다");
				}else {
					System.out.println(name.remove(result)+":");
					System.out.println(pnum.remove(result));
				}
			case 4:
				for(int i=0; i<name.size(); i++) {
					System.out.println(name.get(i)+":");
					System.out.println(pnum.get(i));
				}break;
			case 5: bool = false;
				}
			}
		System.out.println("종료");
		}
	}

