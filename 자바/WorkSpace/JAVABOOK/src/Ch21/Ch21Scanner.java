package Ch21;

import java.util.Scanner;

public class Ch21Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("직업 : ");
		String job = scan.nextLine();
		System.out.print("사번 : ");
		int num = scan.nextInt();
		
		System.out.println(name);	
		System.out.println(job);	
		System.out.println(num);
	}

}
