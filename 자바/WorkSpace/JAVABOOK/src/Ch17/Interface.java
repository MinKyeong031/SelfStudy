package Ch17;

interface Drawable13{
	int NUM = 1; // == public static final int NUM = 1;
	void draw(); // == abstract void draw();
}
class Circle13 implements Drawable13{

	@Override
	public void draw() {
		System.out.println("원을 그리다.");
	}
	
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle13 cc = new Circle13();
		cc.draw();
		
		Drawable13 ref;
		ref = new Circle13();
		ref.draw();
	}

}
