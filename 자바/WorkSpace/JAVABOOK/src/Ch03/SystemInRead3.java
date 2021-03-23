package Ch03;
import java.io.IOException;

public class SystemInRead3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char a = (char)System.in.read();
		System.in.skip(2);
		char b = (char)System.in.read();
		System.out.println(a);
		System.out.println(b);
	}

}
