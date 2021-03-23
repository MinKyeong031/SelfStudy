package Ch10;

public class ConstOver {
	int x;
	int y;
	int z;
	
	public ConstOver() {}
	public ConstOver(int x) {
		this.x = x;
	}
	public ConstOver(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public ConstOver(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void showPoint() {
		System.out.println(this.x + ", " + this.y + ", " + this.z);
	}
}
