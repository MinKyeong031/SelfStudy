package Ch17;

abstract class Shape14{
	public double res = 0;
	public abstract double area();
	public void printArea() {
		System.out.println("면적은 " + res + "이다.");
	}
}
interface Drawable14{
	/*public abstract -> 있어도 없어도 ok*/ void draw();
}
class Rectangle14 extends Shape14 implements Drawable14{
	public int w = 10;
	public int h = 10;
	@Override
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
	@Override
	public double area() {
		res = w * h;
		return res;
	}
	
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle14 ref = null;
		ref = new Rectangle14();
		ref.area();
		ref.printArea();
		ref.draw();
	}

}
