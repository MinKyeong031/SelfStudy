package Ch11;

public class StringClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println("str1 = str2 : " + (str1==str2));
		System.out.println("str3 = str4 : " + (str3==str4));
		System.out.println("str1 = str3 : " + (str1==str3));
		System.out.println("str1 = str4 : " + (str1==str4));
	}

}
