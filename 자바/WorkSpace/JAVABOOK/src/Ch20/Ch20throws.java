package Ch20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ch20throws {

	public Class locadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch20throws test = new Ch20throws();	
		try {
			test.locadClass("a.txt", "javalang.String");
		}catch(FileNotFoundException e) {
			System.out.println("파일부재");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스부재");
		}
		System.out.println("종료됩니다.");
	}

}
