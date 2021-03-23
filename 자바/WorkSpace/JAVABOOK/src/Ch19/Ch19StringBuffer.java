package Ch19;

public class Ch19StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "문자열";
		for(int i = 0; i < 5; i++) {
			str += i;
			System.out.println(System.identityHashCode(str));
		}
		System.out.println(str);
		
		System.out.println("=============================");
		StringBuffer sb = new StringBuffer();
		sb.append("문자열");
		
		for(int i = 0; i < 5; i++) {
			sb.append(i);
			System.out.println(System.identityHashCode(str));
		}
		System.out.println(sb.toString());
	}

}
