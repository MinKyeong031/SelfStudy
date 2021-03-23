package Ch21;

import java.io.FileWriter;
import java.io.IOException;

public class Ch21FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("writer.txt");
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);
			fw.write("문자열 저장 확인");
			fw.write(buf, 1, 2);
			fw.write("65");
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료");
	}

}
