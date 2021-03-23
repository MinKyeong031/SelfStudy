package Ch16;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		Computer c3 = new MyNoteBook();
		
		c2.display();
		c3.typing();
		
		c3.display();
		c3.typing();
	}

}
