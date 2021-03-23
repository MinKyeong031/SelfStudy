package Ch22;

class CornO{
	private Object obj;

	public Object get() {
		return obj;
	}

	public void set(Object obj) {
		this.obj = obj;
	}
	
}

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CornO corn1 = new CornO();
		corn1.set("콘");
		String test1 = (String)corn1.get();
		System.out.println(test1);
		
		CornO corn2 = new CornO();
		corn2.set(123);
		int test2 = (int)corn2.get();
		System.out.println(test2);
		
	}

}
