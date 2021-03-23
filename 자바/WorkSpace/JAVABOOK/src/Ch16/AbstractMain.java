package Ch16;

abstract class Shape12{
	public double res = 0;
	public abstract double area();
	public void printArea() {
		System.out.println("면적은 " + res + "이다.");
	}
}
class Circle12 extends Shape12{
	public int r = 5;

	@Override
	public double area() {
		res = r * r * Math.PI;
		return res;
	}
}
class Rectangle12 extends Shape12{
	public int w = 10;
	public int h = 10;
	@Override
	public double area() {
		res = w * h;
		return res;
	}
}
class Triangle12 extends Shape12{
	public int w = 10;
	public int h = 10;
	@Override
	public double area() {
		res = w * h * 0.5;
		return res;
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape12 ref =null;
		//ref.area();
		//ref.printArea();
		ref = new Rectangle12();
		ref.area();
		ref.printArea();
		ref = new Triangle12();
		ref.area();
		ref.printArea();
	}

}
