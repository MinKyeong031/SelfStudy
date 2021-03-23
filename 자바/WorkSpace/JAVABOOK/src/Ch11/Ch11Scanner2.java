package Ch11;

import java.util.Scanner;

public class Ch11Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========Scanner Test===========");
		
		System.out.print("숫자를 입력하세요. : ");
		Scanner scan1 = new Scanner(System.in);
		int num = scan1.nextInt();
		System.out.println("숫자 입력 값 : " + num);
		
		System.out.print("문자를 입력하세요. : ");
		Scanner scan2 = new Scanner(System.in);
		String str1 = scan2.next();
		System.out.println("문자 입력 값 : " + str1);
		
		System.out.print("문자열을 입력하세요(띄어쓰기 포함). : ");
		Scanner scan3 = new Scanner(System.in);
		String str2 = scan3.nextLine();
		System.out.println("문자열 입력 값 : " + str2);
	}

}
