package Ch10;

public class ConstOverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstOver test1 = new ConstOver();
		ConstOver test2 = new ConstOver(3);
		ConstOver test3 = new ConstOver(4, 1);
		ConstOver test4 = new ConstOver(1, 2, 5);
		
		test1.showPoint();
		test2.showPoint();
		test3.showPoint();
		test4.showPoint();
	}

}
