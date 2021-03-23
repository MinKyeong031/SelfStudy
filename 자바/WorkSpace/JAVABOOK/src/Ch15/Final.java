package Ch15;

public class Final {
	int num = 10;
	final int NUM = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final cons = new Final();
		cons.num = 50;
		//cons.NUM = 200;
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
