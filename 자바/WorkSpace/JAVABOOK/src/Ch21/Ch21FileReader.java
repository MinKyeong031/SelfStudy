package Ch21;

import java.io.FileReader;
import java.io.IOException;

public class Ch21FileReader {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
