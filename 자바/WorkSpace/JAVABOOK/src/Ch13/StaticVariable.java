package Ch13;

public class StaticVariable {
	static int num1 = 10;
	int num2 = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable.num1 = 70;
		System.out.println("StaticVariable.num1 = " + StaticVariable.num1);
		
		StaticVariable ex1 = new StaticVariable();
		StaticVariable ex2 = new StaticVariable();
		
		ex1.num1 = 20;
		System.out.println("ex1.num1 = " + ex1.num1);
		ex2.num1 = 30;
		System.out.println("ex2.num1 = " + ex2.num1);
		StaticVariable.num1 = 20;
		System.out.println("StaticVariable.num1 = " + StaticVariable.num1);
		StaticVariable.num1 = 30;
		System.out.println("StaticVariable.num1 = " + StaticVariable.num1);
		
		ex1.num2 = 30;
		System.out.println("ex1.num2 = " + ex1.num2);
		ex2.num2 = 50;
		System.out.println("ex2.num2 = " + ex2.num2);
		
	}

}














