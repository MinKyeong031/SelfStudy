package Ch13;

import java.util.Scanner;

public class ConviMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sid;
		String sname;
		Scanner scan = new Scanner(System.in);
		ConviStore[] store = new ConviStore[5];
		
		for(int i = 0; i < store.length; i++) {
			System.out.print("제품 코드 입력 : ");
			sid = scan.nextInt();
			System.out.print("제품명 입력 : ");
			sname = scan.next();
			store[i] = new ConviStore(sid, sname);
			System.out.println("제품 코드 : " + store[i].getId() + ", 제품명 : " + store[i].getPName());
			System.out.println("========================");
		}
		scan.close();
		for(int i = 0; i < store.length; i++) {
			System.out.println((i+1) + "번 제품 코드 : " + store[i].getId() + ", 제품명 : " + store[i].getPName());
		}
	}
}