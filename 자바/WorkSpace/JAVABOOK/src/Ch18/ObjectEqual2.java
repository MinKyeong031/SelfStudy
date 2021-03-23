package Ch18;

class MyData{
	int num;
	public MyData(int num) {
		this.num = num;
	}
}
class MyInt{
	int value;

	public MyInt(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyInt) {
			MyInt mi = (MyInt)obj;
			return this.value == mi.value;
		}
		return false;
	}
}

public class ObjectEqual2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData md1 = new MyData(1);
		MyData md2 = new MyData(1);
		MyData md3 = md1;
		System.out.println(md1.equals(md2));
		System.out.println(md1 == md2);
		
		MyInt mi1 = new MyInt(1);
		MyInt mi2 = new MyInt(1);
		System.out.println(mi1.equals(mi2));
		System.out.println(mi1 == mi2);
	}

}
