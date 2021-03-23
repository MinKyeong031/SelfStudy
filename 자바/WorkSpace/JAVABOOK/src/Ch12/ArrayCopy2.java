package Ch12;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aaa = {1, 2, 3};
		int[] bbb = {3, 2, 1};
		
		for(int i = 0; i < aaa.length; i++) {
			bbb[i] = aaa[i];
		}
		
		System.out.println(bbb[0]);
		System.out.println(bbb[1]);
		System.out.println(bbb[2]);
		
		System.out.println(aaa.equals(bbb));
	}

}
