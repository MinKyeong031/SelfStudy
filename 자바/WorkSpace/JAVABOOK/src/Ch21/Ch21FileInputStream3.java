package Ch21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch21FileInputStream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
