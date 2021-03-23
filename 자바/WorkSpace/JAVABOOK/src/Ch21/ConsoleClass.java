package Ch21;

import java.io.Console;

public class ConsoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console con = System.console();
		System.out.print("이름 : ");
		String name = con.readLine();
		System.out.print("직업 : ");
		String job = con.readLine();
		System.out.print("사번 : ");
		char[] pass = con.readPassword();
		String strPass = new String(pass);
		
		System.out.println();
		System.out.println(name);	
		System.out.println(job);	
		System.out.println(strPass);
	}

}
