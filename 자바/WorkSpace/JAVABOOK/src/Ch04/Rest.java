package Ch04;

public class Rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1 = 56789;
		int n1, n2, n3, n4, n5, n6, n7, n8, n9;
		
		n1 = t1 % 2;
		n2 = t1 % 2;
		n3 = t1 % 10;
		n4 = t1 % 100;
		n5 = t1 % 1000;
		n6 = t1 % 10000;
		n7 = t1 / 10000;
		n8 = t1 / 1000;
		n9 = t1 / 100;
		
		System.out.printf("입력 값 확인 = %d\n", t1);
		System.out.printf("짝/홀수 확인 = %d\n", n1);
		System.out.printf("3의 배수 확인 = %d\n", n2);
		System.out.printf("자리수 확인 마지막 자리 = %d\n", n3);
		System.out.printf("자리수 확인 끝의 두자리 = %d\n", n4);
		System.out.printf("자리수 확인 끝의 세자리 = %d\n", n5);
		System.out.printf("자리수 확인 끝의 네자리 = %d\n", n6);
		System.out.printf("자리수 확인 첫번째 자리 = %d\n", n7);
		System.out.printf("자리수 확인 두번째 자리 = %d\n", n8);
		System.out.printf("자리수 확인 끝의 두자리 = %d\n", n9);
	}

}
