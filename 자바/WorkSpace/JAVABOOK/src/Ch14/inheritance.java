package Ch14;

class Point2D{
	public int x;
	public int y;
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
class Point3D extends Point2D {
	public int z;
	
	public void showPoint3D() {
		System.out.println("(" + x + ", " + y + ", " + z +")");
	}
}


public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D pt = new Point3D();
		pt.x = 10;
		pt.y = 20;
		pt.z = 30;
		System.out.println("(" + pt.x + ", " + pt.y + ", " + pt.z +")");
		pt.showPoint3D();	
		pt.showPoint();	
	}
}
