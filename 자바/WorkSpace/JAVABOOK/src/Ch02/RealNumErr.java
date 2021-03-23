package Ch02;

public class RealNumErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		float num = 0.0f;
		
		for(i = 0; i < 100; i++) {
			num += 0.1;
		}
		System.out.printf("0.1을 100번 더한 결과 : %f \n", num);
		
		float test1 = 123.123456789f;
		double test2 = 123.123456789123456789;
		
		System.out.println(test1);	
		System.out.println(test2);
	}

}