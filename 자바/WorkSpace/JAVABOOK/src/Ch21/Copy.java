package Ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ms = 0;
		try(FileInputStream fis = new FileInputStream("cmd.exe");
				FileOutputStream fos = new FileOutputStream("copy.exe")){
			ms = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			ms = System.currentTimeMillis() - ms;
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는데 " + ms + "milliseconds 소요되었습니다.");
	}

}
