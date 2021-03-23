package Ch21;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ch21FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("output.txt");
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
