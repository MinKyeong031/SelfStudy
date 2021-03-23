package Ch21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ms = 0;
		try(FileInputStream fis = new FileInputStream("cmd.exe");
				FileOutputStream fos = new FileOutputStream("copy.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
			ms = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			ms = System.currentTimeMillis() - ms;
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는데 " + ms + "milliseconds 소요되었습니다.");
	}

}
