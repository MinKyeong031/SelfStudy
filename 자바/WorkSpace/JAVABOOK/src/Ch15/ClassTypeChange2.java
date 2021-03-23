package Ch15;

class Shape{
	public double res = 0;
	public double area() {
		return res;
	}
}
class Circle extends Shape{
	public int r = 5;
	public double area() {
		res = r * r * Math.PI;
		return res;
	}
}
class Rectangle extends Shape{
	public int w = 10;
	public int h = 10;
	public double area() {
		res = w * h;
		return res;
	}
}
class Triangle extends Shape{
	public int w = 10;
	public int h = 10;
	public double area() {
		res = w * h * 0.5;
		return res;
	}
}

public class ClassTypeChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape ref = null;
		ref = new Circle();
		prtArea(ref);
		prtArea(new Circle());
		ref = new Rectangle();
		prtArea(ref);
		ref = new Triangle();
		prtArea(ref);
	}
	public static void prtArea(Shape sp) {
		System.out.println("도형의 면적은 " + sp.area());
	}

}







