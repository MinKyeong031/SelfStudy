package Ch19;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ja = new String("java");
		String an = new String("android");
		System.out.println(ja);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(ja));
		
		ja = ja.concat(an);

		System.out.println(ja);
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(ja));
	}

}
