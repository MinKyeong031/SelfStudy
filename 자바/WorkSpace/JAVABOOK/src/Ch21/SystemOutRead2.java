package Ch21;

import java.io.IOException;

public class SystemOutRead2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		int i = 0;
		try {
			while((i = System.in.read()) != -1) {
				System.out.print((char)i);	
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
