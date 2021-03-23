package Ch21;

import java.io.IOException;

public class SystemOutRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
