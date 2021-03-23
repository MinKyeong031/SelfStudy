package Ch11;
import java.util.Scanner;

public class Ch11Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("2번째 숫자 : ");
		int num2 = scan.nextInt();
		System.out.print("3번째 숫자 : ");
		int num3 = scan.nextInt();
		System.out.print("4번째 숫자 : ");
		int num4 = scan.nextInt();
		int sum = num1 + num2 + num3 + num4;
		
		System.out.printf("합계 : %d + %d + %d + %d = %d\n", num1, num2, num3, num4, sum);
		scan.close();
	}

}
