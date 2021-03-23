package Ch21;

import java.io.FileInputStream;
import java.io.IOException;

public class Ch21FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
