package Ch18;

public class ObjectHashCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abcd";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		
		
		Integer i1 = new Integer(100);	
		Integer i2 = new Integer(100);

		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i1.equals(i2));
		System.out.println(i1);
		System.out.println(i2.toString());
	}

}
