package Ch19;

public class Ch19StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ja = new String("java");
		System.out.println("ja 문자열 주소 값 : " + System.identityHashCode(ja));
		
		StringBuilder buffer = new StringBuilder(ja);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));

		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		ja = buffer.toString();
		System.out.println(ja);
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(ja));
	}

}
