package Ch10;

public class MethodOverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOver test1 = new MethodOver();
		MethodOver test2 = new MethodOver();
		
		test1.x = 10;
		System.out.println(test1.sum(5));
		System.out.println(test2.sum(5, 20));
	}

}
