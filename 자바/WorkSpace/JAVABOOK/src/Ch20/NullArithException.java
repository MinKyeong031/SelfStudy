package Ch20;

public class NullArithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String c = null;
			System.out.println("문자열 값은 : " + c.toString());
			System.out.println(12/0);
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer");
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic");
		}finally {
			System.out.println("Finally 연습");
			System.out.println("예외 발생 여부와 상관 없이 반드시 수행");
		}
		System.out.println(">>종료<<");
	}

}
