package Ch12;

public class ArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iAry = new int[3];
		boolean[] bAry = new boolean[3];
		char[] cAry = new char[3];
		String[] sAry = new String[3];
		
		System.out.println(iAry[1]);
		System.out.println(bAry[1]);
		if(cAry[1] == '\0') {
			System.out.println("'\\0'");
		}
		System.out.println(sAry[1]);
	}

}
