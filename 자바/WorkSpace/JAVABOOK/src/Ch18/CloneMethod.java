package Ch18;

class cloneT implements Cloneable{
	private int x;
	private int y;
	public cloneT(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showXY() {
		System.out.println("x = " + this.x + ", y = " + this.y);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class CloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		cloneT t = new cloneT(10, 20);
		cloneT cp = (cloneT)t.clone();
	}

}
