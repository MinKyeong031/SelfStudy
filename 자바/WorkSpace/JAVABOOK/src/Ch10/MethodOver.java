package Ch10;

public class MethodOver {
	int x;
	int y;
	
	public int sum(int y) {
		this.y = y;
		return x+y;
	}
	
	public int sum(int x, int y) {
		this.x = x;
		this.y = y;
		return x+y;
	}
}
