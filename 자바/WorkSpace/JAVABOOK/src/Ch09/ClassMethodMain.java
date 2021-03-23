package Ch09;

public class ClassMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassMethod test = new ClassMethod();
		
		test.x = 100;
		test.y = 5;
		System.out.println("x + y = " + test.sum());
		System.out.println("x - y = " + test.sub());
		System.out.println("x * y = " + test.mul());
		System.out.println("x / y = " + test.div());
	}

}
