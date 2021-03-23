package Ch21;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("TEST");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
