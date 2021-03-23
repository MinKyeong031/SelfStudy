package Ch12;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		int[] arr2;
		System.out.println(arr1);
		
		int[] aaa = {1, 2, 3};
		int[] bbb = {3, 2, 1};
		
		bbb = aaa;
		
		System.out.println(bbb[0]);
		System.out.println(bbb[1]);
		System.out.println(bbb[2]);
	}

}
