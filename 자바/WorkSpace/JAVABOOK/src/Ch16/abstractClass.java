package Ch16;

abstract class Parents{
	int num = 30;
	public abstract int sum(int x, int y);
}
class son extends Parents{

	@Override
	public int sum(int x, int y) {
		return x + y;
	}
	
}

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son test = new son();
		System.out.println(test.sum(1, 2));
	}

}
