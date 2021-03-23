package Ch04;

public class bitArith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 15;
		int num2 = 20;
		int num3 = num1&num2;
		int num4 = num1|num2;
		int num5 = num1^num2;
		int num6 = ~num1;
		System.out.printf("AND 비트 연산 결과 : %d\n", num3);
		System.out.printf("OR 비트 연산 결과 : %d\n", num4);
		System.out.printf("XOR 비트 연산 결과 : %d\n", num5);
		System.out.printf("NOT 비트 연산 결과 : %d\n", num6);
		
		int n = 1&0|1;
		System.out.println(n);
	}

}
