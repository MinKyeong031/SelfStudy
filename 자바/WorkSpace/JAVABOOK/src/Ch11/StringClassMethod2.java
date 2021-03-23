package Ch11;

public class StringClassMethod2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alength, blength;
		char achar, bchar;
		String str1 = new String("java Powerful");
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		
		System.out.println(str3);
		
		alength = str1.length();
		blength = str2.length();
		achar = str1.charAt(5);
		bchar = str2.charAt(10);
		
		System.out.println("Str1에 저장 = " + str1 + ", 길이 = " + alength);
		System.out.println("Str2에 저장 = " + str2 + ", 길이 = " + blength);
		System.out.println("Str1의 5번째 문자 = " + achar);
		System.out.println("Str2의 10번째 문자 = " + bchar);
		System.out.println("Str1의 대문자로 변환 : " + str1.toUpperCase());
		System.out.println("Str2의 a를 A로 변환 : " + str2.replace('a', 'A'));
	}
}
