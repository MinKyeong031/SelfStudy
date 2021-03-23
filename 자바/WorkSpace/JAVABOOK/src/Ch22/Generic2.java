package Ch22;

class Corn<T>{
	private T t;
	public T get() {return t;}
	public void set(T t) {
		this.t = t;
	}
}


public class Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Corn<String> corn1 = new Corn();
		corn1.set("콘");
		String name1 = (String)corn1.get();
		System.out.println(name1);
		
		Corn<Integer> corn2 = new Corn();
		corn2.set(123);
		Integer name2 = (int)corn2.get();
		System.out.println(name2);
	}

}
