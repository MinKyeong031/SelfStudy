package Ch19;

public class WrapperClass2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		int j = 5;
		int k = -7;
		
		Integer intI = null;
		String str = null;
		String str33 = "33";
		String str55 = "55";
		
		intI = i;
		str = intI.toString();
		System.out.println(str);
		
		str = new Integer(j).toString();
		System.out.println(str);
		
		str = String.valueOf(k);
		System.out.println(str);
		
		i = Integer.valueOf(str33);
		System.out.println(i);
		
		j = Integer.parseInt(str55);
		System.out.println(j);
	}
}
