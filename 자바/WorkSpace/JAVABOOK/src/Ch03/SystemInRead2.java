package Ch03;

import java.io.IOException;

public class SystemInRead2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.printf("문자 1개 입력 : ");
		char ch = (char)System.in.read();
		System.out.println("ch : " + ch);
	}

}
