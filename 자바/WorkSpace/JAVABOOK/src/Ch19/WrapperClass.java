package Ch19;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "300";
		Integer num1 = new Integer(100);
		Integer num2 = Integer.valueOf(200);
		int num3 = Integer.parseInt(str);

		System.out.println(num1.intValue());
		System.out.println(num2.intValue());
		System.out.println(num3);
		
		int i4 = 400;
		Integer num4 = i4;
		System.out.println(num4.intValue());
		
		Integer num5 = new Integer(500);
		int i5 = num5;
		System.out.println(i5);
	}
}
