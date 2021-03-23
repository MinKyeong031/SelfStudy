package Ch18;

public class ObjectHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		
		System.out.println("====equals메서드 확인====");
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		System.out.println(o2.equals(o3));
		
		System.out.println("====JVM이 부여한 주소 확인====");
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		System.out.println("====객체 고유 번호 확인====");
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
	}

}
