package Ch20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiException {
	public Class locadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//String c = null;
			//System.out.println("문자열 값은 : " + c.toString());
			//System.out.println(12/0);
			MultiException test = new MultiException();
			test.locadClass("a.txt", "java.langString");
		}catch(NullPointerException e) {
			System.out.println("NullPointer");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic");
		}catch(Exception e) {
			//System.out.println(e);
			System.out.println("나머지 모든 예외 처리");
		}finally {
			System.out.println("Finally 연습");
			System.out.println("예외 발생 여부와 상관 없이 반드시 수행");
		}
		System.out.println(">>종료<<");
	}

}
